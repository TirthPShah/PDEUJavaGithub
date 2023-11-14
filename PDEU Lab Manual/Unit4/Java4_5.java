import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java4_5 implements ActionListener {

    private JFrame frame;
    private JTextField nameField;

    public Java4_5() {

        frame = new JFrame("Java4_5");
        frame.setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(1, 2));

        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(10);

        form.add(nameLabel);
        form.add(nameField);

        frame.add(form, BorderLayout.CENTER);

        JButton button = new JButton("Submit");
        button.addActionListener(this);

        frame.add(button, BorderLayout.SOUTH);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        JOptionPane.showMessageDialog(frame, "Hello " + name + ", from Java4_5.");
    }

    public static void main(String[] args) {
        new Java4_5();
    }
}
