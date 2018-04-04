import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class custController implements ActionListener { //This is the controller for the customer. This class is being used when a new customer is to be added.
private Model model;
private CustomerView cust;
	
	public custController(CustomerView cust, Model model) {
		this.model = model;
		this.cust  = cust;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String action =	e.getActionCommand();
	
	if(action.equalsIgnoreCase("save")) { //If the user presses the save button then get all the fields below and put them into a new constructor and then create a new customer.
		
		String userIDField = cust.getUserIDFieldtext();
		String nameField = cust.getNameFieldtext();
		String addressField = cust.getAddressFieldtext();
		String phoneField = cust.getPhoneFieldtext();
		String emailField =  cust.getEmailFieldtext();
		String dobField = cust.getDobFieldtext();
		String usernameField = cust.getUsernameFieldtext();
		String passwordField = cust.getPasswordFieldtext();
		
		Customer customer = new Customer(userIDField, nameField, addressField, phoneField, emailField, dobField, usernameField, passwordField);
		
		model.addCustomer(customer);
		
		cust.getUserIDField().setText("");
		cust.getNameField().setText("");
		cust.getAddressField().setText("");
		cust.getPhoneField().setText("");
		cust.getEmailField().setText("");
		cust.getDobField().setText("");
		cust.getUsernameField().setText("");
		cust.getPasswordField().setText("");
		
	}
	
	
		
	}
	
}
