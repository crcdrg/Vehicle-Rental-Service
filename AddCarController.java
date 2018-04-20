import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AddCarController implements ActionListener {
	private Model model;
	private addCarView carview;
	private JFrame frame;
	//Constructor
	public AddCarController(addCarView carview, Model model) {
		this.model = model;
		this.carview = carview;
	}
	
	@Override //Action Performed is used for the save button, provided the user enters correct information in order to be saved in a file.
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		
		if(action.equalsIgnoreCase("save")) {
			//If the save button is pressed, then take the fields below that have been entered by the user and create a new car.
			int kmField = 0;
			int topSpeedField = 0;
			int doorsField = 0;
			double hireRateField = 0;
			try {
				kmField = Integer.parseInt(carview.getKilometresText());
				topSpeedField = Integer.parseInt(carview.getTopSpeedText());
				doorsField = Integer.parseInt(carview.getDoorsText());
				hireRateField = Double.parseDouble(carview.getHireRateText());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("Please enter a valid integer");
			}
			String seatsField = null;
			String brandField = null;
			String modelField = null;
			String fuelTypeField = null;
			String reg_noField = null;
			try {
				seatsField = carview.getSeatsText();
				brandField = carview.getBrandText();
				modelField = carview.getModelText();
				fuelTypeField = carview.getFuelTypeText();
				reg_noField = carview.getReg_numberText();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		
			
			Car car = new Car(kmField, seatsField, brandField, modelField, topSpeedField, reg_noField, hireRateField, fuelTypeField, doorsField);
			model.addCar(car);
			//This sets the fields to blank once the save button is pressed.
			carview.getKilometres().setText("");
			carview.getSeats().setText("");
			carview.getBrand().setText("");
			carview.getModel().setText("");
			carview.getTopSpeed().setText("");
			carview.getReg_number().setText("");
			carview.getHireRate().setText("");
			carview.getFuelType().setText("");
			carview.getDoors().setText("");
			
		
		}
		//This if is for the back button to open up the admin panel.
		if(action.equalsIgnoreCase("Back")) {
			frame = carview.getFrame();
			frame.dispose();
			StaffView staffGUI = new StaffView();
			staffController staffctrler = new staffController(staffGUI, model);
			StaffView.addListeners(staffctrler);
			
			
		}
	}
}
