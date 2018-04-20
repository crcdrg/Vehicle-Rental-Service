import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StaffView {
	private static JButton addCustomer;
	private JFrame frame;
	private static JButton addCar, addMinibus, addLorry, removeVehicle;
	public JTextField removeField;
	public JLabel removeLabel;
	
	/**
	 * Create the application.
	 */
	public StaffView() {
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
		frame.setVisible(true);

		
		addCustomer = new JButton("Add Customer");
		addCustomer.setBounds(247, 151, 125, 23);
		frame.getContentPane().add(addCustomer);
		
		JButton removeCustomer = new JButton("Remove Customer");
		removeCustomer.setBounds(382, 151, 125, 23);
		frame.getContentPane().add(removeCustomer);
		
		removeVehicle = new JButton("Remove Vehicle");

		
		removeVehicle.setBounds(247, 30, 125, 23);
		frame.getContentPane().add(removeVehicle);
		
		JButton viewVehicles = new JButton("View Vehicles");
		
		viewVehicles.setBounds(382, 30, 125, 23);
		frame.getContentPane().add(viewVehicles);
		
		addCar = new JButton("Add Car");
		addCar.setBounds(10, 64, 125, 23);
		frame.getContentPane().add(addCar);
		
		addLorry = new JButton("Add Lorry");
		addLorry.setBounds(10, 98, 125, 23);
		frame.getContentPane().add(addLorry);
		
		addMinibus = new JButton("Add Minibus");
		addMinibus.setBounds(10, 132, 125, 23);
		frame.getContentPane().add(addMinibus);
		
		JLabel lblVehicleType = new JLabel("Vehicle Type:");
		lblVehicleType.setBounds(10, 34, 92, 14);
		frame.getContentPane().add(lblVehicleType);
		
		removeField = new JTextField();
		removeField.setBounds(247, 64, 125, 20);
		frame.getContentPane().add(removeField);
		removeField.setColumns(10);
		
		removeLabel = new JLabel("");
		removeLabel.setBounds(247, 98, 411, 14);
		frame.getContentPane().add(removeLabel);
		
		
	}
	//Getter for the frame in order to be able to dispose of it in the controller class
	public JFrame getFrame() {
		return frame;
	}

	public static void addListeners(staffController staffController) {
		// TODO Auto-generated method stub
		addCustomer.addActionListener(staffController);
		addCar.addActionListener(staffController);
		addMinibus.addActionListener(staffController);
		addLorry.addActionListener(staffController);
		//TODO na valw back button kai listener
		//btnBack.addActionListener(staffController);
		removeVehicle.addActionListener(staffController);
		
		
	}
}
