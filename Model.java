
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Model { //Creation of the Class model with 5 arraylists which contain the Car, Lorry, Minibus, staff and customers.

	ArrayList<Car> cars = new ArrayList<Car>(); 
	ArrayList<Lorry> lorry = new ArrayList<Lorry>();
	ArrayList<miniBus> minibus = new ArrayList<miniBus>();
	ArrayList<StaffView> staff = new ArrayList<StaffView>();
	ArrayList<Customer> customer = new ArrayList<Customer>();
	
	public Model () { //Temporarily I've created 10 vehicles of each category to be able to work around before i introduce the add car button method.
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Fiat", "Bravo", 154, "BBQ5080", 32.00, "Diesel", 3));
		cars.add(new Car(45, 4, "Audi", "A3", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		cars.add(new Car(45, 4, "Opel", "Corsa", 172, "NZH3328", 55.50, "Gas", 5));
		
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		lorry.add(new Lorry(120000, 8, "Ford", "Transit", 120, "ZZR1223", 88.88, 1200, 450));
		
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		minibus.add(new miniBus(130, 7, "Mercedes", "Vito", 110, "MPK5240", 120.32, 800));
		
	}
	
	
	public ArrayList<Customer> loadCustomerslist() {
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		ArrayList<Customer> tempCustomers = null;
		
		try {
			fin = new FileInputStream("C:\\Users\\Jimakos\\Desktop\\customers.dat");
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
			for (int i = 0; i<tempCustomers.size(); i++) {
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
	
	
	public boolean addCustomer (Customer customer) {//This boolean method is used to create a customer. There is an input file stream which becomes and object output stream in order to create and save the entry.
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		ArrayList<Customer> tempArray = loadCustomerslist();
		if (!tempArray.contains(customer)) {
			tempArray.add(customer);
		}else {
			System.out.println("User Exists!");
			return false;
		}
		
		
		try {
			 fs = new FileOutputStream("C:\\Users\\Jimakos\\Desktop\\customers.dat",false);		//The directory to which the file is created when a user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			 os = new ObjectOutputStream(fs); //Everything is surrounded in a try and catch block to catch errors.
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
	
	
	public boolean addStaff (Staff staff) {//This boolean method is used to create a customer. There is an input file stream which becomes and object output stream in order to create and save the entry.
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		ArrayList<Staff> tempArray = new ArrayList<Staff>();
		tempArray = loadStafflist();
		
		tempArray.add(staff);
		
		try {
			 fs = new FileOutputStream("C:\\Users\\Jimakos\\Desktop\\staff.dat",false);		//The directory to which the file is created when a user is added.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			 os = new ObjectOutputStream(fs); //Everything is surrounded in a try and catch block to catch errors.
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
			fin = new FileInputStream("C:\\Users\\Jimakos\\Desktop\\staff.dat");
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
	
	
}
