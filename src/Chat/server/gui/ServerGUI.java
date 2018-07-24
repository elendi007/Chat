package Chat.server.gui;

import javax.swing.*;
import java.awt.*;

public class ServerGUI extends JFrame{

    private static final int POS_X = 200;
    private static final int POS_Y = 200;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 100;

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

        setVisible(true);
    }
}
