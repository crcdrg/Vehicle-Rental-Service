import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

	
	
	private int top_speed;
	private String reg_no;
	private double dailyHireRate;
	private String fuel_type;
	private int door_no;

	public Car(int kilometeres, int numberOfSeats, String make, String model, int top_speed, String reg_no, double dailyHireRate, String fuel_type, int door_no) {
		super(kilometeres, numberOfSeats, make, model);
		// TODO Auto-generated constructor stub
		this.top_speed = top_speed;
		this.reg_no = reg_no;
		this.dailyHireRate = dailyHireRate;
		this.fuel_type = fuel_type;
		this.door_no = door_no;
	}

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public double getDailyHireRate() {
		return dailyHireRate;
	}

	public void setDailyHireRate(double dailyHireRate) {
		this.dailyHireRate = dailyHireRate;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public int getDoor_no() {
		return door_no;
	}

	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}

	
	
	
}
