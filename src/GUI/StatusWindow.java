package GUI;

/**
 * Created by Prabdeep on 05-12-2015.
 */

import javax.swing.*;
import java.awt.*;

public class StatusWindow extends JPanel {
    private JLabel lblStatus;
    private JLabel lblStatusMessages;

    public StatusWindow(){

        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblStatus = new JLabel("Status:");
        lblStatus.setForeground(new Color(0, 0, 102));
        lblStatus.setFont(new Font("Tahoma",Font.BOLD, 22));
        lblStatus.setBounds(36, 39, 321, 50);
        add(lblStatus);

        lblStatusMessages = new JLabel("");
        lblStatusMessages.setVerticalAlignment(SwingConstants.TOP);
        lblStatusMessages.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblStatusMessages.setBounds(36, 90, 377, 449);
        add(lblStatusMessages);
    }
}
