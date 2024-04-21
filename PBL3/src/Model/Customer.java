package Model;

class Customer {
	private String phoneNumber;
	private String name;
	private String address;
	private MembershipCard card;
	
	public Customer(String phoneNumber, String name, String address) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}
	
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    public Customer(String name, String phoneNumber, boolean isVip) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
	public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    public MembershipCard getCard() {
		return card;
	}
	public void setCard(MembershipCard card) {
		this.card = card;
	}
}