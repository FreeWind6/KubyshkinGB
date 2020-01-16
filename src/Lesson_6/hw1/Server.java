package Lesson_6.hw1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static boolean isRunning = true;

    public static void run() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Сервер запущен!");


            socket = serverSocket.accept();
            System.out.println("Клиент подключен!");

            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            Scanner console = new Scanner(System.in);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    String msg;
                    try {
                        while (true) {
                            msg = console.nextLine();
                            printWriter.println(msg);
                            printWriter.flush();
                            if (msg.equals("/end")) {
                                isRunning = false;
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
            }).start();

            while (isRunning) {
                if (in.hasNext()) {
                    String msg = in.nextLine();
                    if (msg.equalsIgnoreCase("/end")) {
                        break;
                    }
                    System.out.println(msg);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                System.out.println("Подключение закрыто!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
