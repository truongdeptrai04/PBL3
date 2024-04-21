package Model;

import java.util.ArrayList;

public class InvoiceDetail {
    private String invoiceID;
    ArrayList<Product> items;
    private static int IDCounter = 1;
    public InvoiceDetail(ArrayList<Product> items) {
    	invoiceID = "IN";
    	String counter = String.format("%05d", IDCounter);
    	invoiceID += counter;
    	IDCounter++;
    	this.items = items;
    }
    
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	public ArrayList<Product> getItems() {
		return items;
	}
	public void setItems(ArrayList<Product> items) {
		this.items = items;
	}
    
}
