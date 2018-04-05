import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

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
	private void initialize(Customer customer) {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel UserDetailsPane = new JPanel();
		UserDetailsPane.setBounds(191, 30, 467, 150);
		frame.getContentPane().add(UserDetailsPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(191, 216, 467, 199);
		frame.getContentPane().add(panel);
		
		JLabel lblVehicles = new JLabel("Vehicles:");
		lblVehicles.setBounds(401, 191, 105, 14);
		frame.getContentPane().add(lblVehicles);
		
		
		JLabel lblPersonalDetails = new JLabel("Personal Details:");
		lblPersonalDetails.setBounds(401, 11, 105, 14);
		frame.getContentPane().add(lblPersonalDetails);
		
	    btnExit = new JButton("Exit");
		btnExit.setBounds(44, 370, 89, 23);
		frame.getContentPane().add(btnExit);
		btnExit.addActionListener(CustomerController);
		frame.setVisible(true);
	}
	
	public static void addListeners(CustomerController custController) {
		// TODO Auto-generated method stub
		btnExit.addActionListener(custController);
	}
}
