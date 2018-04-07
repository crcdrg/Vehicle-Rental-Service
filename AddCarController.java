import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCarController implements ActionListener {
	private Model model;
	private addCarView carview;
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
			int kmField = Integer.parseInt(carview.getKilometresText());
			String seatsField = carview.getSeatsText();
			String brandField = carview.getBrandText();
			String modelField = carview.getModelText();
			int topSpeedField = Integer.parseInt(carview.getTopSpeedText());
			String reg_noField = carview.getReg_numberText();
			double hireRateField = Double.parseDouble(carview.getHireRateText());
			String fuelTypeField = carview.getFuelTypeText();
			int doorsField = Integer.parseInt(carview.getDoorsText());
			
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
			StaffView staffGUI = new StaffView();
			staffController staffctrler = new staffController(staffGUI, model);
			StaffView.addListeners(staffctrler);
		}
	}
}
