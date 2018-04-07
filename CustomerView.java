import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class CustomerView {

	private JFrame frame;
	private static JButton btnExit;
	private CustomerController CustomerController;
	/**
	 * Create the application.
	 */
	public CustomerView(Customer customer) {
		initialize(customer);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Frame, Labels, Buttons and JTextFields creation for the GUI.
	private void initialize(Customer customer) {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel UserDetailsPane = new JPanel();
		UserDetailsPane.setBounds(191, 30, 467, 150);
		frame.getContentPane().add(UserDetailsPane);
		UserDetailsPane.setLayout(null);
		
		JLabel lblName = new JLabel("");
		lblName.setBounds(83, 37, 107, 14);
		lblName.setText(customer.getName());
		UserDetailsPane.add(lblName);
		
		JLabel lblAddress = new JLabel("");
		lblAddress.setBounds(83, 62, 107, 14);
		lblAddress.setText(customer.getAddress());
		UserDetailsPane.add(lblAddress);
		
		JLabel lblUserid = new JLabel("");
		lblUserid.setBounds(83, 11, 107, 14);
		lblUserid.setText(customer.getId());
		UserDetailsPane.add(lblUserid);
		
		JLabel lblPhone = new JLabel("");
		lblPhone.setBounds(83, 87, 107, 14);
		lblPhone.setText(customer.getPhone_no());
		UserDetailsPane.add(lblPhone);
		
		JLabel lblEmail = new JLabel("");
		lblEmail.setBounds(350, 11, 107, 14);
		lblEmail.setText(customer.getEmail());
		UserDetailsPane.add(lblEmail);
		
		JLabel lblDOB = new JLabel("");
		lblDOB.setBounds(350, 37, 107, 14);
		lblDOB.setText(customer.getDob());
		UserDetailsPane.add(lblDOB);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setBounds(350, 62, 107, 14);
		lblUsername.setText(customer.getUsername());
		UserDetailsPane.add(lblUsername);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setBounds(10, 11, 63, 14);
		UserDetailsPane.add(lblUserId);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setBounds(10, 37, 63, 14);
		UserDetailsPane.add(lblFullName);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setBounds(10, 62, 63, 14);
		UserDetailsPane.add(lblAddress_1);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setBounds(10, 87, 63, 14);
		UserDetailsPane.add(lblPhoneNo);
		
		JLabel lblEmail_1 = new JLabel("E-mail:");
		lblEmail_1.setBounds(277, 11, 46, 14);
		UserDetailsPane.add(lblEmail_1);
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setBounds(277, 37, 46, 14);
		UserDetailsPane.add(lblDob);
		
		JLabel lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setBounds(277, 62, 63, 14);
		UserDetailsPane.add(lblUsername_1);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(191, 216, 467, 199);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblVehicles = new JLabel("Vehicles:");
		lblVehicles.setBounds(401, 191, 105, 14);
		frame.getContentPane().add(lblVehicles);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details:");
		lblPersonalDetails.setBounds(401, 11, 105, 14);
		frame.getContentPane().add(lblPersonalDetails);
		
	    btnExit = new JButton("Exit");
		btnExit.setBounds(44, 370, 89, 23);
		frame.getContentPane().add(btnExit);
		frame.setVisible(true);
	}
	
	public static void addListeners(CustomerController custController) {
		// TODO Auto-generated method stub
		//Exit button Listener
		btnExit.addActionListener(custController);
	}
}
