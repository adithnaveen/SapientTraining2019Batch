package training.sapient.pmsbasics;

import com.fasterxml.jackson.annotation.JsonFilter;


@JsonFilter("product-list")
public class Product {
	private int productId; 
	private String productName; 
	private double productPrice; 
	private boolean isAvailable;
	
	// this property is to show the port which is used in ribbon 
	private Integer port; 
	
	
	public Product() {}
	
	public Product(int productId, String productName, double productPrice, boolean isAvailable) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.isAvailable = isAvailable;
	}
	
	public Product(int productId, String productName, double productPrice, boolean isAvailable, int port) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.isAvailable = isAvailable;
		this.port = port; 
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	} 
	
	
}
