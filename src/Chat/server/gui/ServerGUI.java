package Chat.server.gui;

import javax.swing.*;

public class ServerGUI extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new ServerGUI();
        });
    }
}
