import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController implements ActionListener {
	//Customer Controller's constructor uses the Model which is common for everyone and a customerview in order to have a GUI and be able to work with.
	private Model model;
	private CustomerView view;
	
	public CustomerController(CustomerView view, Model model) {
		this.model = model;
		this.view = view;
	}	

@Override
public void actionPerformed(ActionEvent arg0) {
	//Exit Button
	// TODO Auto-generated method stub
	String action = arg0.getActionCommand();
	
	if (action.equalsIgnoreCase("exit")) {
		System.exit(0);
		}
	}
}