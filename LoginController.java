import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginController implements ActionListener { //This is the login Controller which is called everytime a button is pressed and depending on what button has been pressed it acts accordingly.
	private Model model;
	private LoginView view;
	
	public LoginController(LoginView view, Model model) {
		this.model = model;
		this.view = view;
	}
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String action =	e.getActionCommand();
	if(action.equalsIgnoreCase("exit")) {
		System.exit(0);
	}
	if(action.equalsIgnoreCase("login")) {
	//	Model model = new Model();
	//	LoginController LoginController = new LoginController(model);
//		LoginView LoginView = new LoginView(LoginController, model);
		
//	custGUI customerGUI = new custGUI();
//	custController customerController = new custController(customerGUI, model);
//	customerGUI.addListeners(customerController);
		String username = view.getUsernameText();
		String password = view.getPasswordText();
		
	ArrayList<Customer> customers = model.loadCustomerslist();
	ArrayList<Staff> staff = model.loadStafflist();
	
	
	//Customer customers = new Customer("test1","test1","test1","test1","test1","test1","test1","test1");
	//model.addCustomer(customers);
	//Staff staff = new Staff("admin", "12345");
	
	//model.addStaff(staff);

	
	boolean userFound = false;
	boolean userIsStaff = false;
	
	
	for (Staff element1 : staff) {
		   if (username.equals(element1.getId()) && password.equals(element1.getPassword())){
			   userFound = true;
			   userIsStaff = true;
		   break;
	   }
	}
	
	for (Customer element : customers) {
	   if (username.equals(element.getUsername()) && password.equals(element.getPassword())){
		   userFound = true;
		   userIsStaff = false;
		   break;
	   }
	   
	}
	
	if (!userFound) {
		
		System.out.println("Cannot Login");
	} 
	
	else if(userFound && userIsStaff) {
		StaffView staffGUI = new StaffView();
		staffController staffctrler = new staffController(staffGUI, model);
		StaffView.addListeners(staffctrler);
	}
	else if (userFound && !userIsStaff) {
		CustomerView customerGUI = new CustomerView();
		custController customerController = new custController(customerGUI, model);
		customerGUI.addListeners(customerController);
	}
	String s = "";
		

		
	}
	
	
		
	}
}
