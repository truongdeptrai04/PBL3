package Model;

import java.util.ArrayList;

public class ProductManagement {
   private ArrayList<Product> productList;

   public ProductManagement(ArrayList<Product> productList) {
		this.productList = productList;
   }

   public ProductManagement() {
	   this.productList = new ArrayList<Product>();
   }
   //Thêm sản phẩm
   public void addProduct(Product product) {
	   productList.add(product);
   }
   //Xóa sản phẩm
   public void deleteProduct(Product product) {
	   productList.remove(product);
   }
   //Tìm sản phẩm
   public void findProduct(String name) {
	   for(Product pd : productList) {
		   if(pd.getName().indexOf(name)>=0 ) {
			   System.out.println(pd.getName());
		   }
	   }
   }
   //Tăng số lượng
//   public void increaseQuantity(Product product, int quantity) {
//	   productList.get(product).setQuantity(quantity);
//   }
//   //Giảm số lượng
//   public void decreaseQuantity(Product product, int quantity) {
//	   productList.get(findProduct(product)).setQuantity(quantity);
//   }
}
