import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addMinibusView {
	private JFrame frame;
	private JTextField kilometres;
	private JTextField seats;
	private JTextField brand;
	private JTextField model;
	private JTextField topSpeed;
	private JTextField reg_number;
	private JTextField hireRate;
	private JTextField load_cap;
	private JButton btnSave;
	private JButton btnBack;
	
	public addMinibusView() {
		initialize();
	}

	//Frame, Labels, Textfields and Buttons creation.
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		kilometres = new JTextField();
		kilometres.setBounds(22, 72, 86, 20);
		frame.getContentPane().add(kilometres);
		kilometres.setColumns(10);

		seats = new JTextField();
		seats.setColumns(10);
		seats.setBounds(145, 72, 86, 20);
		frame.getContentPane().add(seats);

		brand = new JTextField();
		brand.setColumns(10);
		brand.setBounds(259, 72, 86, 20);
		frame.getContentPane().add(brand);

		model = new JTextField();
		model.setColumns(10);
		model.setBounds(393, 72, 86, 20);
		frame.getContentPane().add(model);

		topSpeed = new JTextField();
		topSpeed.setColumns(10);
		topSpeed.setBounds(524, 72, 86, 20);
		frame.getContentPane().add(topSpeed);

		reg_number = new JTextField();
		reg_number.setColumns(10);
		reg_number.setBounds(22, 179, 86, 20);
		frame.getContentPane().add(reg_number);

		hireRate = new JTextField();
		hireRate.setColumns(10);
		hireRate.setBounds(193, 179, 86, 20);
		frame.getContentPane().add(hireRate);

		load_cap = new JTextField();
		load_cap.setColumns(10);
		load_cap.setBounds(370, 179, 86, 20);
		frame.getContentPane().add(load_cap);
		
		
		JLabel lblKilometres = new JLabel("Kilometres:");
		lblKilometres.setBounds(22, 47, 86, 14);
		frame.getContentPane().add(lblKilometres);
		
		JLabel lblNoOfSeats = new JLabel("No. Of Seats:");
		lblNoOfSeats.setBounds(145, 47, 86, 14);
		frame.getContentPane().add(lblNoOfSeats);
		
		JLabel lblMake = new JLabel("Make:");
		lblMake.setBounds(260, 47, 46, 14);
		frame.getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setBounds(393, 47, 46, 14);
		frame.getContentPane().add(lblModel);
		
		JLabel lblTopSpeed = new JLabel("Top Speed:");
		lblTopSpeed.setBounds(524, 47, 86, 14);
		frame.getContentPane().add(lblTopSpeed);
		
		JLabel lblRegNumber = new JLabel("Reg. Number:");
		lblRegNumber.setBounds(22, 154, 86, 14);
		frame.getContentPane().add(lblRegNumber);
		
		JLabel lblDailyHireRate = new JLabel("Daily Hire Rate:");
		lblDailyHireRate.setBounds(193, 154, 86, 14);
		frame.getContentPane().add(lblDailyHireRate);
		
		JLabel lblload_cap = new JLabel("Loading Cap:");
		lblload_cap.setBounds(370, 154, 86, 14);
		frame.getContentPane().add(lblload_cap);
		
		JLabel lblAddMinibus = new JLabel("Add Minibus");
		lblAddMinibus.setBounds(207, 11, 99, 14);
		frame.getContentPane().add(lblAddMinibus);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(271, 240, 89, 23);
		frame.getContentPane().add(btnSave);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(19, 358, 89, 23);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);
		
	}
	
	//Getters and text getters for the parsed datatypes and for the text entered in the fields.
	public String getKilometresText() {
		return kilometres.getText();
	}

	public JTextField getKilometres() {
		return kilometres;
	}
	
	public String getSeatsText() {
		return seats.getText();
	}

	public JTextField getSeats() {
		return seats;
	}
	
	public String getBrandText() {
		return brand.getText();
	}

	public JTextField getBrand() {
		return brand;
	}
	
	public String getModelText() {
		return model.getText();
	}

	public JTextField getModel() {
		return model;
	}
	
	public String getTopSpeedText() {
		return topSpeed.getText();
	}

	public JTextField getTopSpeed() {
		return topSpeed;
	}
	
	public String getReg_numberText() {
		return reg_number.getText();
	}

	public JTextField getReg_number() {
		return reg_number;
	}
	
	public String getHireRateText() {
		return hireRate.getText();
	}

	public JTextField getHireRate() {
		return hireRate;
	}
	
	public String getLoadcapText() {
		return load_cap.getText();
	}

	public JTextField getLoadcap() {
		return load_cap;
	}
	
	//Getter for MinibusView to use dispose.
	
	public JFrame getFrame() {
		return frame;
	}

	//Listeners for Save Button and Back
	public void addListeners(addMinibusController minibusController) {
		
		btnSave.addActionListener(minibusController);
		btnBack.addActionListener(minibusController);
	}
	
}
