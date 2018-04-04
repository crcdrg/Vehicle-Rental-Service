
public abstract class Vehicle { //Abstract class creation with 4 constructor attributes.
	private int kilometres, numberOfSeats;
	private String make, model;
	
	
	public Vehicle(int kilometeres, int numberOfSeats, String make, String model) { //Initation of the constructor of the class Vehicle and what it is going to contain.
		this.kilometres = kilometres;
		this.numberOfSeats = numberOfSeats;
		this.make = make;
		this.model = model;
		
		
	}

//Getters and Setters for each constructor attribute.
	public int getKilometres() {
		return kilometres;
	}


	public void setKilometres(int kilometres) {
		this.kilometres = kilometres;
	}


	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
}


