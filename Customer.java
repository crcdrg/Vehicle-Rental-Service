import java.io.Serializable;

public class Customer implements Serializable { //Customer Class creation which implements Serializable in order to be able to save entries and whatnot into a binary file.
	
	private String id, name, address, phone_no, email, dob, username, password; //Constructor creation of the Customer which is going to contain the following attributes.
	
			public Customer(String id, String name, String address, String phone_no, String email, String dob, String username, String password) {
				this.id = id;
				this.name = name;
				this.address = address;
				this.phone_no = phone_no;
				this.email  = email;
				this.dob = dob;
				this.username = username;
				this.password = password;
			}

			
			//Setters and Getters of all the Customer class attributes.
			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getPhone_no() {
				return phone_no;
			}

			public void setPhone_no(String phone_no) {
				this.phone_no = phone_no;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getDob() {
				return dob;
			}

			public void setDob(String dob) {
				this.dob = dob;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
}
