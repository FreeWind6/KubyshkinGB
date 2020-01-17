package Lesson_6.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

public class ServerMain {
    private Vector<ClientHandler> clients;
    private ArrayList arrayListNick = new ArrayList();

    public ServerMain() {
        clients = new Vector<>();
        ServerSocket server = null;
        Socket socket = null;

        try {
            AuthService.connect();
//            String str = AuthService.getNickByLoginAndPass("login1", "pass1");
//            System.out.println(str);
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен!");

            while (true) {
                socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(this, socket);
                // clients.add(new ClientHandler(this, socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            AuthService.disconnect();
        }
    }

    public void subscribe(ClientHandler client, String nick) {
        clients.add(client);
        arrayListNick.add(nick);
    }

    public void unsubscribe(ClientHandler client, String nick) {
        clients.remove(client);
        arrayListNick.remove(nick);
    }

    public void broadcastMsg(String msg) {
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }
    }

    public void privateMsg(ClientHandler from, String to, String msg) {
        boolean isNickFound = false;
        for (ClientHandler o : clients) {
            if (o.getNick().equals(to)) {
                o.sendMsg("Личное сообщение от: " + from.getNick() + ": " + msg);
                from.sendMsg("Личное сообщение " + to + ": " + msg);
                isNickFound = true;
            }
        }
        if (!isNickFound) {
            from.sendMsg("Пользователь " + to + " не найден");
        }
    }

    public boolean checkNick(String newNick) {
        if (arrayListNick.contains(newNick)) {
            return true;
        } else {
            return false;
        }
    }
}
