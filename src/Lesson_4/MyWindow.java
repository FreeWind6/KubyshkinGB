package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Java Swing");
        setBounds(800,300,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        centerPanel.setBackground(Color.gray);
        bottomPanel.setBackground(Color.lightGray);

        bottomPanel.setPreferredSize(new Dimension(1,40));

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        centerPanel.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout());

        JButton jb = new JButton("Send");

        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        centerPanel.add(jsp, BorderLayout.CENTER);
        JTextField jtf = new JTextField();

        bottomPanel.add(jtf);
        bottomPanel.add(jb);

        jtf.setPreferredSize(new Dimension(300,28));

        jta.setEditable(false);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append(jtf.getText() + "\n");
                jtf.setText("");
               // jtf.grabFocus();
            }
        });

        jb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println(1);
//                    jta.append(jtf.getText() + "\n");
//                    jtf.setText("");
//                    jtf.grabFocus();
                }
            }
        });

        setVisible(true);

//        JButton btn1 = new JButton("btn1");
//        JButton btn2 = new JButton("btn2");
//
//        JPanel panel = new JPanel();
//
//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println(e.getX() + " " + e.getY());
//            }
//        });
//
//        add(panel, BorderLayout.CENTER);
//        panel.add(btn1);
//        panel.add(btn2);
//
//        add(panel, BorderLayout.SOUTH);
//
//        btn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("btn1");
//            }
//        });
//
//        btn2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("btn2");
//            }
//        });

      //  btn1.setPreferredSize(new Dimension(200,300));

//        setLayout(null);
//
//        JButton btn1 = new JButton("btn1");
//        JButton btn2 = new JButton("btn2");
//
//        btn1.setBounds(50,60,80,80);
//        btn2.setBounds(150,160,80,80);
//
//        setResizable(false);
//        add(btn1);
//        add(btn2);
    }
}

class MainClass {
    public static void main(String[] args) {
        new MyWindow();
    }
}
