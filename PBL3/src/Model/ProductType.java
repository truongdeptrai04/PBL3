package Model;

public class ProductType {
    private String ID;
    private String typeName;
    private String describe;
    private static int IDCounter;
    public ProductType(String typeName, String describe) {
    	this.ID = "PDT";
    	String counter = String.format("%03d", IDCounter);
    	ID += counter;
    	IDCounter++;
    	this.typeName = typeName;
    	this.describe = describe;
    }
    
	public String getID() {
		return ID;
	}	
	public void setID(String iD) {
		ID = iD;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
    
}
