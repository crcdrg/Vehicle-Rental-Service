import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCarController implements ActionListener {
	private Model model;
	private addCarView carview;
	
	public AddCarController(addCarView carview, Model model) {
		this.model = model;
		this.carview = carview;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		
		if(action.equalsIgnoreCase("save")) {
			
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
			System.out.println("Perasthke");
			model.addCar(car);
			
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
	}
}
