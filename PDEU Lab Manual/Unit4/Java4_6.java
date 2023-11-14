import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java4_6 extends JFrame implements ActionListener{

    private JPanel boxPanel;

    public Java4_6() {

        super("Piano Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        boxPanel = new JPanel();
        boxPanel.setLayout(new GridLayout(1, 7));

        String[] buttons = {"Button1", "Button2", "Button3", "Button4", "Button5", "Button6", "Button7"};

        for (int i = 0; i < buttons.length; i++) {

            JButton button = new JButton(buttons[i]);
            button.setBackground(Color.WHITE);
            button.setOpaque(true);
            button.setBorderPainted(false);

            button.addActionListener(this);
            boxPanel.add(button);
        }

        add(boxPanel);
        setSize(700, 300);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setBackground(Color.LIGHT_GRAY);
    }

    public static void main(String[] args) {
        new Java4_6();
    }
} 