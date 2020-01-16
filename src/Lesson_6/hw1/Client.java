package Lesson_6.hw1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static boolean isRunning = true;

    public static void run() {

        String SERVER_ADDRESS = "localhost";
        int SERVER_PORT = 8189;

        Socket socket = null;
        Scanner in;
        PrintWriter printWriter;

        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Клиент запущен!");

            in = new Scanner(socket.getInputStream());
            printWriter = new PrintWriter(socket.getOutputStream());
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
                socket.close();
                System.out.println("Подключение закрыто!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
