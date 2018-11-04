package invoice;

public class InvoicePrinter {

	public static void main(String[] args) {
		Address lowesAddress = new Address("Lowe's Home Improvement", "618 Mt Moriah Dr", "Cincinnati", "Ohio", "45245");
		
		Invoice lowesInvoice = new Invoice(lowesAddress);
		lowesInvoice.add(new Product("Hammer", 14.99), 1);
		lowesInvoice.add(new Product("Hose", 24.99), 3);
		lowesInvoice.add(new Product("Chainsaw", 245.99), 1);
		System.out.println(lowesInvoice.format());
	}

}
