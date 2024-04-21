package Model;

public class Employee {
    private String ID;
    private Store store;
    private String name;
    private String nickName;
	private String pass;
    private String email;
    private String address;
    private String Position;
    private static int employeeCount = 1;
    public Employee(Store store, String name, String nickName, String pass, String email, String address) {
    	this.ID = "EP";
    	String IDcounter = String.format("%04d", employeeCount);
    	ID += IDcounter;	
    	employeeCount++;
    	this.store = store;
    	this.name = name;
    	this.nickName = nickName;
    	this.pass = pass;
    	this.email = email;
    	this.address = address;
    	this.Position = "Employee";
    }
    
    public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
}
