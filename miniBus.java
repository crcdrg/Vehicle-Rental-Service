import java.io.Serializable;

public class miniBus extends Vehicle implements Serializable {

	
	
	private int top_speed;
	private String reg_no;
	private double dailyHireRate;
	private String fuel_type;
	private int door_no;
	private int loading_cap;

	public miniBus(int kilometeres, String numberOfSeats, String make, String model, int top_speed, String reg_no, double dailyHireRate, int loading_cap) {
		super(kilometeres, numberOfSeats, make, model);
		// TODO Auto-generated constructor stub
		this.top_speed = top_speed;
		this.reg_no = reg_no;
		this.dailyHireRate = dailyHireRate;
		this.fuel_type = fuel_type;
		this.door_no = door_no;
		this.loading_cap = loading_cap;
		
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

	public int getLoading_cap() {
		return loading_cap;
	}

	public void setLoading_cap(int loading_cap) {
		this.loading_cap = loading_cap;
	}
	

	
}
