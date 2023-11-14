import javax.swing.*;

public class Free extends JFrame {
    JButton buttons[];

    public Free() {
        buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            // adding the buttons directly to the frame
            add(buttons[i]);
        }

        // Set the layout manager to BoxLayout and align components vertically
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new Free());
    }
}
