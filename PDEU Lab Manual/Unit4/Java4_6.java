import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BoxLayoutExample {
    private JFrame frame;
    private JPanel boxPanel;

    public BoxLayoutExample() {
        frame = new JFrame("Piano Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        boxPanel = new JPanel();
        boxPanel.setLayout(new GridLayout(1, 7));

        String[] buttons = {"Button1", "Button2", "Button3", "Button4", "Button5", "Button6", "Button7"};

        for (int i = 0; i < buttons.length; i++) {

            JButton button = new JButton(buttons[i]);
            button.setBackground(Color.WHITE);
            button.setOpaque(true);
            button.setBorderPainted(false);

            button.addActionListener(new ButtonListener());
            boxPanel.add(button);
        }

        frame.add(boxPanel);
        frame.setSize(700, 300);
        frame.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            button.setBackground(Color.LIGHT_GRAY);
        }
    }
}

public class Java4_6 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BoxLayoutExample();
        });
    }
}