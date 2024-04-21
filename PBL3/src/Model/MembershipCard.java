package Model;

public class MembershipCard {
    private String CardID;
    private Discount discount;
    private Brand brand;
    private String rank;
    
    public MembershipCard(String CardID, Discount discount, Brand brand, String rank) {
    	this.CardID = CardID;
    	this.discount = discount;
    	this.brand = brand;
    	this.rank = rank;	
    }
    
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public String getCardID() {
		return CardID;
	}
	public void setCardID(String cardID) {
		CardID = cardID;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		rank = rank;
	}
    
}
