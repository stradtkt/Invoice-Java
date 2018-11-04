package invoice;

public class LineItem {
	private int quantity;
	private Product product;
	
	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}
	public String format() {
		return String.format("%-30s%8.2f%5d%8.2f", product.getName(), product.getPrice(), quantity, getTotalPrice());
	}
}
