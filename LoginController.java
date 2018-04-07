import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginController implements ActionListener { // This is the login Controller which is called everytime a
															// button is pressed and depending on what button has been
															// pressed it acts accordingly.
	private Model model;
	private LoginView view;
	private String username;
	private String password;
	//Constructor
	public LoginController(LoginView view, Model model) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Action Performed here Controls the buttons, depending which button has been pressed, do the following.
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if (action.equalsIgnoreCase("exit")) {
			System.exit(0);
		}if (action.equalsIgnoreCase("Register")){
			model.createTestAccount();
			AddCustomerView registerGUI = new AddCustomerView();
			AddCustomerController customerController = new AddCustomerController(registerGUI, model);
			registerGUI.addListeners(customerController);			
		}
		if (action.equalsIgnoreCase("login")) {
			// Model model = new Model();
			// LoginController LoginController = new LoginController(model);
			// LoginView LoginView = new LoginView(LoginController, model);

			// custGUI customerGUI = new custGUI();
			// custController customerController = new custController(customerGUI, model);
			// customerGUI.addListeners(customerController);
			username = view.getUsernameText();
			password = view.getPasswordText();

			ArrayList<Customer> customers = model.loadCustomerslist();
			ArrayList<Staff> staff = model.loadStafflist();

			// Customer customers = new
			// Customer("test1","test1","test1","test1","test1","test1","test1","test1");
			// model.addCustomer(customers);
			// Staff staff = new Staff("admin", "12345");

			// model.addStaff(staff);

			
			//This piece of code below doesn't allow the user to login if the username and password fields are empty.
			boolean userFound = false;
			boolean userIsStaff = false;
			Customer cust = null;
			if (!username.equals("") || !password.equals("")) {
				//Enchaned for loop that acknowledges depending on the information given whether the user is an admin or a plain user.
				for (Staff element1 : staff) {
					if (username.equals(element1.getId()) && password.equals(element1.getPassword())) {
						userFound = true;
						userIsStaff = true;
						break;
					}
				}
				
				for (Customer element : customers) {
					if (username.equals(element.getUsername()) && password.equals(element.getPassword())) {
						userFound = true;
						userIsStaff = false;
						cust = element;
						break;
					}

				}

			}
			//Login Error
			//TODO Find a way to show it to the screen because println uses the console.
			if (!userFound) {

				System.out.println("Cannot Login");
			}
			//Depending the credentials, redirect the user to the user page or the admin page.
			else if (userFound && userIsStaff) {
				StaffView staffGUI = new StaffView();
				staffController staffctrler = new staffController(staffGUI, model);
				StaffView.addListeners(staffctrler);
			} else if (userFound && !userIsStaff) {
				CustomerView customerGUI = new CustomerView(cust);
				CustomerController customerController = new CustomerController(customerGUI, model);
				customerGUI.addListeners(customerController);
			}

		}

	}
}
