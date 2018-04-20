import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class addMinibusController implements ActionListener {
	private Model model;
	private addMinibusView minibusview;
	private JFrame frame;
	
	public addMinibusController(addMinibusView minibusview, Model model) {
		this.model = model;
		this.minibusview = minibusview;
	}
	
	@Override //Same as all the Controller classes. If the save button is pressed take all the fields below, add a new minibus.
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String action = arg0.getActionCommand();
		
		if(action.equalsIgnoreCase("save")) {
			
			int kmField = Integer.parseInt(minibusview.getKilometresText());
			String seatsField = minibusview.getSeatsText();
			String brandField = minibusview.getBrandText();
			String modelField = minibusview.getModelText();
			int topSpeedField = Integer.parseInt(minibusview.getTopSpeedText());
			String reg_noField = minibusview.getReg_numberText();
			double hireRateField = Double.parseDouble(minibusview.getHireRateText());
			int load_capField = Integer.parseInt(minibusview.getLoadcapText());
			
			miniBus minibus = new miniBus(kmField, seatsField, brandField, modelField, topSpeedField, reg_noField, hireRateField, load_capField);
			model.addMinibus(minibus);

			
			minibusview.getKilometres().setText("");
			minibusview.getSeats().setText("");
			minibusview.getBrand().setText("");
			minibusview.getModel().setText("");
			minibusview.getTopSpeed().setText("");
			minibusview.getReg_number().setText("");
			minibusview.getHireRate().setText("");
			minibusview.getLoadcap().setText("");
			
			
		}
		//Back button to show admin panel.
		if(action.equalsIgnoreCase("Back")) {
			frame = minibusview.getFrame();
			frame.dispose();
			StaffView staffGUI = new StaffView();
			staffController staffctrler = new staffController(staffGUI, model);
			StaffView.addListeners(staffctrler);
		}
		
		
	}
	
}
