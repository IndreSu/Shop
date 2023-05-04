

public class SimpleItem extends Item {

	
	private final double tax = 21;
	private double priceWithVat;
	private double totalPrice;
	
	public SimpleItem(String prekesPavadinimas, double netoKaina) {
		super(prekesPavadinimas, netoKaina);
		this.priceWithVat = getPriceWithVat();
		this.totalPrice = getTotalPrice();
	}
	
	@Override
	public double getPriceWithVat() {
		priceWithVat = Math.round((netoPrice + (netoPrice * tax)/100) * 100.0/100.0) ;
		return priceWithVat;
	}

	@Override
	public double getExcise() {
		return 0;
	}

	@Override
	public double getTotalPrice() {
		this.totalPrice = Math.round((priceWithVat) * 100.0 / 100.0);
		return totalPrice;
	}
	

	@Override
	public String toString() {
		return "SimpleItem: tax = " + tax + ", priceWithPvm = " + priceWithVat +
				", totalPrice = " + totalPrice
				+ ",";
	}
}