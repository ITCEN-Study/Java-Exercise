package collection;

import java.util.Objects;

public class Product {
	private String productID;
	private String productName;
	private int productPrice ;
	
	public Product (String productID,  String productName,  int productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getProductID () {
		return productID;
	}
	public void setProductID (String productID) {
		this.productID = productID;
	}
	
	public String getproductName () {
		return productName;
	}
	public void setproductName (String productName) {
		this.productName = productName;
	}
	
	public int getproductPrice () {
		return productPrice;
	}
	public void setproductPrice (int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productID, other.productID);
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-15s %,d", productID, productName, productPrice);
	}
}
