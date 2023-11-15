import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//Button click event handling listened by ActionListener interface
class SwingCalculatorAppEventHandling extends JFrame implements ActionListener{
	
	JLabel lblNumber1 = new JLabel("Number1 : ");
	JLabel lblNumber2 = new JLabel("Number2 :");
	JLabel lblAnswer = new JLabel("Answer : ");
	JLabel lblStatus = new JLabel();
	
	JTextField txtNumber1 = new JTextField();
	JTextField txtNumber2 = new JTextField();
	JTextField txtAnswer = new JTextField();

	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnMul = new JButton("*");
	JButton btnClear = new JButton("CLEAR");

	public SwingCalculatorAppEventHandling(String title){
		
		super(title);
		setSize(300, 300);

		//Data input/output panel designing with Grid of 3 rows and 2 columns

		JPanel dataIO = new JPanel(new GridLayout(3,2));
		dataIO.add(lblNumber1);
		dataIO.add(txtNumber1);
		dataIO.add(lblNumber2);
		dataIO.add(txtNumber2);
		dataIO.add(lblAnswer);
		dataIO.add(txtAnswer);
		
		// Listener Registration - Register button as a source to actionListener, 			//generates actionEvent and handled by ActionListener

		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);

		// Math Operations panel designing with FlowLayout
		JPanel math1 = new JPanel(new FlowLayout());
		math1.add(btnAdd);
		math1.add(btnSub);
		math1.add(btnMul);
		math1.add(btnClear);

		// DataIO panel Added to the North(Upper) - Math panel added to the South(Lower)
		
		add(dataIO, BorderLayout.NORTH);
		add(math1, BorderLayout.SOUTH);
		add(lblStatus, BorderLayout.CENTER);


		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// Method implementation of ActionListener interface, when add button clicked
        // actionEvent generated and action will be performed by actionPerformed method.
	
	public void actionPerformed(ActionEvent ae){
		
		
		int number1 = Integer.parseInt(txtNumber1.getText());
		int number2 = Integer.parseInt(txtNumber2.getText());
		if(ae.getSource() == btnAdd){
			int ans = number1 + number2;
			txtAnswer.setText(ans + "");
			lblStatus.setText(number1 + " + " + number2 + " = " + ans);
		}if(ae.getSource() == btnClear){
			txtAnswer.setText("");
			txtNumber1.setText("");
			txtNumber2.setText("");
			lblStatus.setText("CLEARED!!");
		}
		
	}

	public static void main(String[] args){
		SwingCalculatorAppEventHandling app1 = new SwingCalculatorAppEventHandling("Math-Calculator");
	}
}