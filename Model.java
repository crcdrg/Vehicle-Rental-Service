
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Model { // Creation of the Class model with 5 arraylists which contain the Car, Lorry,
						// Minibus, staff and customers.

	String path = "C:\\Users\\Jimakos\\Desktop\\";
	//String path = "C:\\Users\\user\\Desktop\\";

	ArrayList<Car> cars = new ArrayList<Car>();
	ArrayList<Lorry> lorry = new ArrayList<Lorry>();
	ArrayList<miniBus> minibus = new ArrayList<miniBus>();
	ArrayList<Staff> staff = new ArrayList<Staff>();
	ArrayList<Customer> customer = new ArrayList<Customer>();

	public Model() { // Temporarily I've created 10 vehicles of each category to be able to work
						// around before i introduce the add car button method.
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "PLK3328", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Fiat", "Bravo", 154, "BBQ5080", 32.00, "Diesel", 3));
		cars.add(new Car(45, "4", "Audi", "A3", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "YRZ2143", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "ASD1123", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "BRB2356", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "JYT6789", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "LKP3343", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "QWE1236", 55.50, "Gas", 5));
		cars.add(new Car(45, "4", "Opel", "Corsa", 172, "BVC5486", 55.50, "Gas", 5));

		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, "8", "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));

		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, "7", "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));

		customer.add(new Customer("test1", "test1", "test1", "test1", "test1", "test1", "test1", "test1"));

	}

	public ArrayList<Car> loadCarlist() {

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		ArrayList<Car> tempCar = new ArrayList<Car>();

		try {
			fin = new FileInputStream(path + "cars.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<Car>();
		}
		try {
			ois = new ObjectInputStream(fin);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			tempCar = (ArrayList<Car>) ois.readObject();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return tempCar;
		}
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempCar;
	}

	public ArrayList<Lorry> loadLorryList() {

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		ArrayList<Lorry> tempLorry = new ArrayList<Lorry>();;

		try {
			fin = new FileInputStream(path + "lorry.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<Lorry>();
		}
		try {
			ois = new ObjectInputStream(fin);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			tempLorry = (ArrayList<Lorry>) ois.readObject();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return tempLorry;
		}
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempLorry;

	}

	public ArrayList<miniBus> loadMinibusList() {

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		ArrayList<miniBus> tempMinibus = new ArrayList<miniBus>();;

		try {
			fin = new FileInputStream(path + "minibus.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<miniBus>();
		}
		try {
			ois = new ObjectInputStream(fin);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			tempMinibus = (ArrayList<miniBus>) ois.readObject();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return tempMinibus;
		}
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempMinibus;

	}

	public boolean addLorry(Lorry lorry) {

		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		ArrayList<Lorry> tempArray = loadLorryList();
		if (!tempArray.contains(lorry)) {
			tempArray.add(lorry);
		} else {
			System.out.println("Car Exists!");
			return false;
		}
		try {
			fs = new FileOutputStream(path + "lorry.dat", false); // The directory to which the file is created when
			// a user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os = new ObjectOutputStream(fs); // Everything is surrounded in a try and catch block to catch errors.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os.writeObject(tempArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean addMinibus(miniBus minibus) {// This boolean method is used to create a customer. There is an input file
		// stream which becomes and object output stream in order to create and save the
		// entry.
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		ArrayList<miniBus> tempArray = loadMinibusList();
		if (!tempArray.contains(minibus)) {
			tempArray.add(minibus);
		} else {
			System.out.println("Car Exists!");
			return false;
		}
		try {
			fs = new FileOutputStream(path + "minibus.dat", false); // The directory to which the file is created when
			// a user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os = new ObjectOutputStream(fs); // Everything is surrounded in a try and catch block to catch errors.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os.writeObject(tempArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean addCar(Car cars) {// This boolean method is used to create a customer. There is an input file
										// stream which becomes and object output stream in order to create and save the
										// entry.
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		ArrayList<Car> tempArray = loadCarlist();
		if (!tempArray.contains(cars)) {
			tempArray.add(cars);
		} else {
			System.out.println("Car Exists!");
			return false;
		}
		try {
			fs = new FileOutputStream(path + "cars.dat", false); // The directory to which the file is created when
																	// a user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os = new ObjectOutputStream(fs); // Everything is surrounded in a try and catch block to catch errors.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os.writeObject(tempArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public ArrayList<Customer> loadCustomerslist() {

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		ArrayList<Customer> tempCustomers = null;

		try {
			fin = new FileInputStream(path + "customers.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<Customer>();
		}
		try {
			ois = new ObjectInputStream(fin);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			tempCustomers = (ArrayList<Customer>) ois.readObject();
			for (int i = 0; i < tempCustomers.size(); i++) {
				System.out.println(tempCustomers.get(i).getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempCustomers;
	}

	public boolean addCustomer(Customer customer) {// This boolean method is used to create a customer. There is an
													// input file stream which becomes and object output stream in order
													// to create and save the entry.
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		ArrayList<Customer> tempArray = loadCustomerslist();
		if (!tempArray.contains(customer)) {
			tempArray.add(customer);
		} else {
			System.out.println("User Exists!");
			return false;
		}

		try {
			fs = new FileOutputStream(path + "customers.dat", false); // The directory to which the file is created when
																		// a user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os = new ObjectOutputStream(fs); // Everything is surrounded in a try and catch block to catch errors.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os.writeObject(tempArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean addStaff(Staff staff) {// This boolean method is used to create a customer. There is an input file
											// stream which becomes and object output stream in order to create and save
											// the entry.
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		ArrayList<Staff> tempArray = new ArrayList<Staff>();
		tempArray = loadStafflist();

		tempArray.add(staff);

		try {
			fs = new FileOutputStream(path + "staff.dat", false); // The directory to which the file is created when a
																	// user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os = new ObjectOutputStream(fs); // Everything is surrounded in a try and catch block to catch errors.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			os.writeObject(tempArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public ArrayList<Staff> loadStafflist() {

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		ArrayList<Staff> tempStaff = new ArrayList<Staff>();

		try {
			fin = new FileInputStream(path + "staff.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<Staff>();
		}
		try {
			ois = new ObjectInputStream(fin);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			tempStaff = (ArrayList<Staff>) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tempStaff;
	}

	public void createTestAccount() {
		// TODO Auto-generated method stub
		for (int i = 0; i < cars.size(); i++) {
			addCar(cars.get(i));

		}

		for (int i = 0; i < customer.size(); i++) {
			addCustomer(customer.get(i));

		}

		for (int i = 0; i < lorry.size(); i++) {
			addLorry(lorry.get(i));

		}

		for (int i = 0; i < minibus.size(); i++) {
			addMinibus(minibus.get(i));

		}
		
		for (int i = 0; i < staff.size(); i++) {
			addStaff(staff.get(i));
		}

	}

	public boolean deleteFromCars(String reg_no) {
		
		for (Car car : cars) {
			if (car.getReg_no().equals(reg_no)) {
				cars.remove(car);
				return true;
			}
		}
		
		return false;
		
	}

}
