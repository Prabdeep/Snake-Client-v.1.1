package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadResult extends JPanel {

    private JLabel lblLoadResult;
    private JLabel lblLastResult;
    private JLabel lblResult;
    private JLabel lblScore;
    private JLabel lblCanYouBeat;
    private JButton btnBack;

    public LoadResult() {
        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblLoadResult = new JLabel("Load Result From Your Last Game");
        lblLoadResult.setForeground(new Color(0, 0, 102));
        lblLoadResult.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblLoadResult.setBounds(35, 48, 379, 50);
        add(lblLoadResult);

        lblLastResult = new JLabel("Your latest Snake result was:");
        lblLastResult.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblLastResult.setBounds(93, 109, 264, 50);
        add(lblLastResult);

        lblResult = new JLabel("Result:");
        lblResult.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblResult.setBounds(119, 237, 68, 21);
        add(lblResult);

        lblScore = new JLabel("");
        lblScore.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblScore.setBounds(219, 237, 100, 21);
        add(lblScore);

        lblCanYouBeat = new JLabel("Can you beat your previous highscore?");
        lblCanYouBeat.setForeground(new Color(0, 0, 153));
        lblCanYouBeat.setBounds(119, 328, 227, 14);
        add(lblCanYouBeat);

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
