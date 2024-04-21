package Model;

public class Brand {
    private String brandID;
    private String brandName;
    private static int brandCounter = 1;
    
    public Brand(String brandName){
    	String brandID = "BR";
    	String counterString = String.format("%04d", brandCounter);
    	brandID += counterString;
    	brandCounter++;
    	this.brandName = brandName;
    }
    
	public String getBrandID() {
		return brandID;
	}
	public void setBrandID(String brandID) {
		this.brandID = brandID;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
    
}	
