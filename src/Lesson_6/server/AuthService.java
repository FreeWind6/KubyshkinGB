package Lesson_6.server;

import java.sql.*;

public class AuthService {
    private static Connection connection;
    private static Statement stmt;

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:mydb.db");
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getNickByLoginAndPass(String login, String pass) {
        String sql = String.format("SELECT nickname FROM main where login = '%s' and password = '%s'", login, pass);

        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // заполнить в таблицу (id записи, id того кто блокирует, id того кого блокирует)
    public static String insertTable(String who, String whom) {
        String sql = String.format("INSERT INTO blocklist(id1, id2) VALUES('%s', '%s')", who, whom);

        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // вывести id записи где челок который заблочик = nick1 и человек которого заблочили = nick2.
    // если выведится не null то запись существует
    public static String getNick(String nick1, String nick2) {
        String sql = String.format("SELECT id FROM blocklist WHERE id1='%s' and id2='%s'", nick1, nick2);

        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
