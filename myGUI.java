import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myGUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnExit;
	private JLabel lblRentalService;


	/**
	 * Create the application.
	 */
	public myGUI() {
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
		frame.getContentPane().add(btnLogin);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(349, 238, 89, 23);
		frame.getContentPane().add(btnExit);
		
		lblRentalService = new JLabel("Rental Service");
		lblRentalService.setHorizontalAlignment(SwingConstants.CENTER);
		lblRentalService.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRentalService.setBounds(250, 57, 163, 81);
		frame.getContentPane().add(lblRentalService);
	}
}
