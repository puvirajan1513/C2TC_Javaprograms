package day3;

public class Product {
	private int pid;
	private String product_name;
	private float price;
	public int getPid() {
		return pid;
	}
	public Product()
	{
		this.pid=101;
		this.product_name="keys";
		this.price=245.6f;
	}
	public Product(int pid,String product_name,float price)
	{//parametter constructor
		this.pid=pid;
		this.product_name=product_name;
		this.price=price;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", product_name=" + product_name + ", price=" + price + "]";
	}

}
