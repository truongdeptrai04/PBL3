package Model;

class Product {
	private String ID;
	private ProductType type;
	private Discount discount;
	private String name;
	private double price;
	private int quantity;
	private String color;
	private String size;
	private static int IDCounter = 1;
	
    public Product() {
	}
	public Product(ProductType type, Discount discount, String name, double price, int quantity, String color, String size) {
    	this.ID = "PD";
        String counter = String.format("%05",IDCounter);
        ID += counter;
        IDCounter++;
        this.type = type;
        this.discount = discount;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.size = size;	
    }
	public ProductType getType() {
		return type;
	}
	public void setType(ProductType type) {
		this.type = type;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
    public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void setPrice(double price) {
    	this.price = price;
    }
    public double getPrice() {
    	return this.price;
    }
    public void setQuantity(int quantity) {
    	this.quantity = quantity;
    }
    public int getQuantity() {
    	return this.quantity;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public String getColor() {
    	return this.color;
    }
    public void setSize(String size) {
    	this.size = size;
    }
    public String getSize() {
    	return this.size;
    }
}
