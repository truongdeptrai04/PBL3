package Model;
import java.util.*;
class Invoice {
	private String invoiceID;
    private Employee employee;
    private Customer customer;
    private Store store;
    private Discount discount;
    private InvoiceDetail invoiceDetail;
    private Date date;
    private String paymentMethod;
    private String PurchasingMethod;
    private double total;
    private static int IDCounter = 1;
    
    public Invoice(Employee employee, Customer customer, Store store, Discount discount, InvoiceDetail invoiceDetail,  Date date, String paymentMethod, String PurchasingMethod) {
        this.invoiceID = "IN";
        String Counter = String.format("%05d", IDCounter);
        invoiceID+=Counter;
        IDCounter++;
        this.employee = employee;
        this.customer = customer;
        this.store = store;
        this.discount = discount;
        this.invoiceDetail = invoiceDetail;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.PurchasingMethod = PurchasingMethod;
    }

	public String getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public InvoiceDetail getInvoiceDetail() {
		return invoiceDetail;
	}

	public void setInvoiceDetail(InvoiceDetail invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPurchasingMethod() {
		return PurchasingMethod;
	}

	public void setPurchasingMethod(String purchasingMethod) {
		PurchasingMethod = purchasingMethod;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}