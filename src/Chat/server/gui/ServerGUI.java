package Chat.server.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerGUI extends JFrame{

    private static final int POS_X = 200;
    private static final int POS_Y = 200;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 100;

    private static final JButton btnStart = new JButton("Start");
    private static final JButton btnStop = new JButton("Stop");

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new ServerGUI();
        });
    }

    ServerGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat Server");
        setAlwaysOnTop(true);// установка окна поверх всех окон
        setLayout(new GridLayout(1,2));

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button start press");
            }
        });
        add(btnStart);

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button stop press");
            }
        });
        add(btnStop);

        setVisible(true);
    }
}
