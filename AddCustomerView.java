import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCustomerView {
 private LoginController loginController;
 private Model model;
 private JFrame custframe;
 private JTextField userIDField;
 private JTextField nameField;
 private JTextField addressField;
 private JTextField phoneField;
 private JTextField emailField;
 private JTextField dobField;
 private JTextField usernameField;
 private JTextField passwordField;

 private JButton btnSave;

	/**
	 * Create the application.
	 * @param model 
	 * @param loginController 
	 */
	public AddCustomerView() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		custframe = new JFrame();
		custframe.setBounds(100, 100, 684, 465);
		custframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		custframe.getContentPane().setLayout(null);
		custframe.setVisible(true);
		
		userIDField = new JTextField();
		userIDField.setBounds(143, 11, 86, 20);
		custframe.getContentPane().add(userIDField);
		userIDField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(143, 42, 86, 20);
		custframe.getContentPane().add(nameField);
		
		addressField = new JTextField();
		addressField.setColumns(10);
		addressField.setBounds(143, 73, 86, 20);
		custframe.getContentPane().add(addressField);
		
		phoneField = new JTextField();
		phoneField.setColumns(10);
		phoneField.setBounds(143, 104, 86, 20);
		custframe.getContentPane().add(phoneField);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(143, 135, 86, 20);
		custframe.getContentPane().add(emailField);
		
		dobField = new JTextField();
		dobField.setColumns(10);
		dobField.setBounds(143, 166, 86, 20);
		custframe.getContentPane().add(dobField);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBounds(143, 197, 86, 20);
		custframe.getContentPane().add(usernameField);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(143, 228, 86, 20);
		custframe.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("User ID:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		custframe.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Name:");
		lblFirstname.setBounds(10, 45, 59, 14);
		custframe.getContentPane().add(lblFirstname);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 76, 59, 14);
		custframe.getContentPane().add(lblAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setBounds(10, 107, 76, 14);
		custframe.getContentPane().add(lblPhoneNo);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 138, 46, 14);
		custframe.getContentPane().add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setBounds(10, 169, 86, 14);
		custframe.getContentPane().add(lblDateOfBirth);
		
		JLabel lblUser = new JLabel("Username:");
		lblUser.setBounds(10, 200, 76, 14);
		custframe.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 231, 76, 14);
		custframe.getContentPane().add(lblPassword);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(345, 41, 89, 23);
		custframe.getContentPane().add(btnSave);
	}

	public String getUserIDFieldtext() {
		return userIDField.getText();
	}
	public JTextField getUserIDField() {
		return userIDField;
	}

	public String getNameFieldtext() {
		return nameField.getText();
	}
	
	public JTextField getNameField() {
		return nameField;
	}
	

	public String getAddressFieldtext() {
		return addressField.getText();
	}
	
	public JTextField getAddressField() {
		return addressField;
	}

	public String getPhoneFieldtext() {
		return phoneField.getText();
	}
	
	public JTextField getPhoneField() {
		return phoneField;
	}

	public String getEmailFieldtext() {
		return emailField.getText();
	}
	
	public JTextField getEmailField() {
		return emailField;
	}

	public String getDobFieldtext() {
		return dobField.getText();
	}
	
	public JTextField getDobField() {
		return dobField;
	}

	public String getUsernameFieldtext() {
		return usernameField.getText();
	}
	
	public JTextField getUsernameField() {
		return usernameField;
	}

	public String getPasswordFieldtext() {
		return passwordField.getText();
	}
	
	public JTextField getPasswordField() {
		return passwordField;
	}
	
	public void addListeners(AddCustomerController custCntrl) {
		
		btnSave.addActionListener(custCntrl);
	}
	
}
