import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class staffController implements ActionListener {
	private Model model;
	private StaffView staff;
	private JFrame frame;
	public staffController(StaffView staff, Model model) {
		this.model = model;
		this.staff  = staff;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action = arg0.getActionCommand();
		if (action.equalsIgnoreCase("Add Customer")) {
			frame = staff.getFrame();
			frame.dispose();
			AddCustomerView customerGUI = new AddCustomerView();
			AddCustomerController customerController = new AddCustomerController(customerGUI, model);
			customerGUI.addListeners(customerController);
			
		}
		
		
		 if (action.equalsIgnoreCase("Add Car")){
			frame = staff.getFrame();
			frame.dispose();
			addCarView addCarGUI = new addCarView();
			AddCarController carCntrl = new AddCarController(addCarGUI, model);
			addCarGUI.addListeners(carCntrl);
			
		}
		 
		 if (action.equalsIgnoreCase("Add Minibus")){
			 	frame = staff.getFrame();
				frame.dispose();
				addMinibusView addMinibusGUI = new addMinibusView();
				addMinibusController minibusCntrl = new addMinibusController(addMinibusGUI, model);
				addMinibusGUI.addListeners(minibusCntrl);
			}
		 
		 if (action.equalsIgnoreCase("Add Lorry")){
			 	frame = staff.getFrame();
				frame.dispose();		 	
				addLorryView addLorryGUI = new addLorryView();
				addLorryController lorryCntrl = new addLorryController(addLorryGUI, model);
				addLorryGUI.addListeners(lorryCntrl);
			}
		 
		 if(action.equalsIgnoreCase("Remove Vehicle")) {
			 
			 if (model.deleteFromCars(staff.removeField.getText().toString())) {
				staff.removeLabel.setText("Removed!");
			}else {
				staff.removeLabel.setText("The vehicle with the no. requested doesn't exist");
			}
			 
		 }
		 
	}
}
