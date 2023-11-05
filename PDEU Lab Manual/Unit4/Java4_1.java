import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java4_1 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Student Information");

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2)); // 5 rows, 2 columns

        // Create labels and text fields for each piece of student information
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel rollNoLabel = new JLabel("Roll No:");
        JTextField rollNoField = new JTextField(10);

        JLabel cpiLabel = new JLabel("CPI:");
        JTextField cpiField = new JTextField(5);

        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField(20);

        // Create a submit button
        JButton submitButton = new JButton("Submit");

        // Add an action listener to the submit button
        submitButton.addActionListener(new SubmitButtonListener(nameField, rollNoField, cpiField, emailField, panel));

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(rollNoLabel);
        panel.add(rollNoField);
        panel.add(cpiLabel);
        panel.add(cpiField);
        panel.add(emailLabel);
        panel.add(emailField);

        // Add the submit button to the panel
        panel.add(submitButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(400, 300); // Increased the height to accommodate labels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class SubmitButtonListener implements ActionListener {
    
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel rollNoLabel = new JLabel("Roll No: ");
    private JLabel cpiLabel = new JLabel("CPI: ");
    private JLabel emailLabel = new JLabel("E-mail: ");

    private JTextField nameField;
    private JTextField rollNoField;
    private JTextField cpiField;
    private JTextField emailField;
    private JPanel panel;

    public SubmitButtonListener(JTextField nameField, JTextField rollNoField, JTextField cpiField, JTextField emailField, JPanel panel) {
        this.nameField = nameField;
        this.rollNoField = rollNoField;
        this.cpiField = cpiField;
        this.emailField = emailField;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Remove all components from the panel
        panel.removeAll();

        // Create labels to display entered values
        JLabel submittedNameLabel = new JLabel(nameField.getText());
        JLabel submittedRollNoLabel = new JLabel(rollNoField.getText());
        JLabel submittedCpiLabel = new JLabel(cpiField.getText());
        JLabel submittedEmailLabel = new JLabel(emailField.getText());

        // Add labels to the panel
        panel.add(nameLabel);
        panel.add(submittedNameLabel);

        panel.add(rollNoLabel);
        panel.add(submittedRollNoLabel);

        panel.add(cpiLabel);
        panel.add(submittedCpiLabel);

        panel.add(emailLabel);
        panel.add(submittedEmailLabel);

        // Repaint the panel
        panel.revalidate();
        panel.repaint();
    }
}