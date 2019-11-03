package training.sapient.pmsbasicscategory;

public class Product {
	private int productId; 
	private double productPrice;
	private Integer port ; 
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product() {} 
	public Product(int productId, double productPrice) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	} 
	
	
}
