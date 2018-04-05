import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController implements ActionListener {
	private Model model;
	private CustomerView view;
	
	public CustomerController(CustomerView view, Model model) {
		this.model = model;
		this.view = view;
	}	

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String action = arg0.getActionCommand();
	
	if (action.equalsIgnoreCase("exit")) {
		System.exit(0);
		}
	}
}