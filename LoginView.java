import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LoginView  { //the View class is introduced here. More information can be found in the myGUI class where the main GUI is created and then by using the View pattern everything is operated from here.

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnExit;
	private JLabel lblRentalService;
	private LoginController controller;

	/**
	 * Create the application.
	 */
	public LoginView(Model model) {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(250, 162, 163, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(164, 162, 87, 20);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(164, 196, 76, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 193, 163, 20);
		frame.getContentPane().add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(250, 238, 89, 23);
		btnLogin.addActionListener(controller);
		frame.getContentPane().add(btnLogin);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(349, 238, 89, 23);
		frame.getContentPane().add(btnExit);
		btnExit.addActionListener(controller);
		
		lblRentalService = new JLabel("Rental Service");
		lblRentalService.setHorizontalAlignment(SwingConstants.CENTER);
		lblRentalService.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRentalService.setBounds(250, 57, 163, 81);
		frame.getContentPane().add(lblRentalService);
		frame.setVisible(true);
		
	}
	
	public String getUsernameText() {
		
	return	textField.getText().toString();
	}
	
	public String getPasswordText() {
		
	return	passwordField.getText().toString();
	}
	
	public void addListeners(LoginController custCntrl) {
		
		btnExit.addActionListener(custCntrl);
		btnLogin.addActionListener(custCntrl);
	}
	
	
}
