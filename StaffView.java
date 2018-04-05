import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class StaffView {
	private static JButton addCustomer;
	private JFrame frame;
	private static JButton addCar;
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
		
		JButton removeVehicle = new JButton("Remove Vehicle");
		removeVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		removeVehicle.setBounds(247, 30, 125, 23);
		frame.getContentPane().add(removeVehicle);
		
		JButton viewVehicles = new JButton("View Vehicles");
		viewVehicles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		viewVehicles.setBounds(382, 30, 125, 23);
		frame.getContentPane().add(viewVehicles);
		
		addCar = new JButton("Add Car");
		addCar.setBounds(10, 64, 125, 23);
		frame.getContentPane().add(addCar);
		
		JButton addLorry = new JButton("Add Lorry");
		addLorry.setBounds(10, 98, 125, 23);
		frame.getContentPane().add(addLorry);
		
		JButton addMiniBus = new JButton("Add Minibus");
		addMiniBus.setBounds(10, 132, 125, 23);
		frame.getContentPane().add(addMiniBus);
		
		JLabel lblVehicleType = new JLabel("Vehicle Type:");
		lblVehicleType.setBounds(10, 34, 92, 14);
		frame.getContentPane().add(lblVehicleType);
	}

	public static void addListeners(staffController staffController) {
		// TODO Auto-generated method stub
		addCustomer.addActionListener(staffController);
		addCar.addActionListener(staffController);
	}
}
