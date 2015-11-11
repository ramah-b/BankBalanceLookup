import java.io.Serializable;


public class Customer {
	private String id;
	private double balance;
	private String firstname;
	private String lastname;
	
	public Customer(String id, String firstname, String lastname, double balance){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.balance = balance;
	}
	public Customer(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
