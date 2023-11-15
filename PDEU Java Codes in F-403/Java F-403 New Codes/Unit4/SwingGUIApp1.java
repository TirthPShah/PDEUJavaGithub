import javax.swing.*;
import java.awt.*;

class SwingGUIApp1 extends JFrame{
	
	JLabel lblStatus = new JLabel("JAVA-SWING GUI LABEL!!!");
	JLabel lblStatus1 = new JLabel("JAVA-SWING GUI 1!!!");
	
	public SwingGUIApp1(String title){
		
		super(title);
		setSize(300, 300);
		
		lblStatus.setFont(new Font("Arial", Font.BOLD, 24));
		lblStatus.setForeground(Color.RED);

		add(lblStatus, BorderLayout.NORTH);
		lblStatus.setFont(new Font("Arial", Font.BOLD, 24));
		lblStatus.setForeground(Color.BLUE);
		add(lblStatus1, BorderLayout.SOUTH);
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		SwingGUIApp1 app1 = new SwingGUIApp1("JAVA-GUI WELCOME FRAME!");
	}
}