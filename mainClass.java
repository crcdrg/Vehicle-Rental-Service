
public class mainClass { //The main class here will execute the Model, the View and the Controller using the MVC pattern.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is the main class that runs the MVC pattern.
		Model model = new Model();
		LoginView loginview = new LoginView(model);
		LoginController logincontroller = new LoginController(loginview, model);
		
		
		loginview.addListeners(logincontroller);
	}

}
