import java.io.Serializable;

public class Staff implements Serializable {
	private String id, password;
	
	Staff(String id, String password) {
	
	this.id = id;
	this.password = password;
	
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
