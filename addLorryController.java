import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class addLorryController implements ActionListener {
	private Model model;
	private addLorryView lorryview;

	public addLorryController(addLorryView lorryview, Model model) {
		this.model = model;
		this.lorryview = lorryview;
	}

	@Override//This method works the same as all controllers. If the save button is pressed then take all the values in each field and add a new Lorry.
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action = arg0.getActionCommand();

		if (action.equalsIgnoreCase("save")) {

			int kmField = Integer.parseInt(lorryview.getKilometresText());
			String seatsField = lorryview.getSeatsText();
			String brandField = lorryview.getBrandText();
			String modelField = lorryview.getModelText();
			int topSpeedField = Integer.parseInt(lorryview.getTopSpeedText());
			String reg_noField = lorryview.getReg_numberText();
			double hireRateField = Double.parseDouble(lorryview.getHireRateText());
			int load_capField = Integer.parseInt(lorryview.getload_capText());
			int load_weightField = Integer.parseInt(lorryview.getload_weightText());

			Lorry lorry = new Lorry(kmField, seatsField, brandField, modelField, topSpeedField, reg_noField, hireRateField,
					load_capField, load_weightField);
			model.addLorry(lorry);

			lorryview.getKilometres().setText("");
			lorryview.getSeats().setText("");
			lorryview.getBrand().setText("");
			lorryview.getModel().setText("");
			lorryview.getTopSpeed().setText("");
			lorryview.getReg_number().setText("");
			lorryview.getHireRate().setText("");
			lorryview.getload_cap().setText("");
			lorryview.getload_weight().setText("");

		}
		//Back Button If to show admin panel.
		if (action.equalsIgnoreCase("Back")) {
			StaffView staffGUI = new StaffView();
			staffController staffctrler = new staffController(staffGUI, model);
			StaffView.addListeners(staffctrler);
		}
	}

}
