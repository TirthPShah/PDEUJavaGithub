import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java4_2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Java4_2");
        frame.setLayout(new BorderLayout());

        JLabel messageLabel = new JLabel("Listening for key and mouse events", SwingConstants.CENTER);
        frame.add(messageLabel, BorderLayout.CENTER);

        frame.addKeyListener(new KeyEventProcessor(messageLabel));
        frame.addMouseListener(new MouseEventProcessor(messageLabel));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class KeyEventProcessor extends KeyAdapter {

    private JLabel messageLabel;

    public KeyEventProcessor(JLabel messageLabel) {
        this.messageLabel = messageLabel;
    }

    public void keyTyped(KeyEvent e) {

        char keyChar = e.getKeyChar();
        messageLabel.setText(keyChar + " is pressed");

    }
}

class MouseEventProcessor extends MouseAdapter {

    private JLabel messageLabel;

    public MouseEventProcessor(JLabel messageLabel) {
        this.messageLabel = messageLabel;
    }

    public void mouseClicked(MouseEvent e) {

        int x = e.getX();
        int y = e.getY();
        messageLabel.setText("Mouse clicked at (" + x + ", " + y + ")");

    }
}