package invoice;

import java.util.ArrayList;

public class Invoice {
	private Address address;
	private ArrayList<LineItem> items;
	
	public Invoice(Address address) {
		items = new ArrayList<LineItem>();
		this.address = address;
	}
	public void add(Product product, int quantity) {
		LineItem anItem = new LineItem(product, quantity);
		items.add(anItem);
	}
	public String format() {
		String in = "                                    I N V O I C E \n\n"
				+ address.format()
				+ String.format("\n\n%-30s%8s%Ss%8s\n", "Name", "Price", "Qty", "Total");
		for(LineItem item : items) {
			in = in + item.format() + "\n";
		}
		in = in + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
		return in;
	}
	private double getAmountDue() {
		double amountDue = 0;
		for(LineItem item: items) {
			amountDue = amountDue + item.getTotalPrice();
		}
		return amountDue;
	}
}
