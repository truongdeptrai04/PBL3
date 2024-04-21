package Model;

public class Store {
    private String storeID;
    private Brand brand;	
    private String address;
    private String phoneNumber;
    private static int IDcounter = 1;
    public Store(Brand brand, String address, String phoneNumber) {
    	storeID = "STID";
    	String counter = String.format("%02d", IDcounter);
    	storeID += counter;
    	IDcounter++;
    	this.brand = brand;
    	this.address = address;
    	this.phoneNumber = phoneNumber;
    }
    
	public String getStoreID() {
		return storeID;
	}
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
}
