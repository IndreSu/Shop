
public class Medicine extends Item {
	
	private final double tax = 9;
	private double priceWithVat;
	private double totalPrice;
	 
	public Medicine(String itemName, double netoPrice) {
		super(itemName, netoPrice);
		this.priceWithVat = getPriceWithVat();
		this.totalPrice = getTotalPrice();
	}

	@Override
	public double getPriceWithVat() {
		priceWithVat = Math.round((netoPrice + ((netoPrice * tax)/100)) * 100.0 / 100.0);
		return priceWithVat;
	}
	
	@Override
	public double getExcise() {
		return 0;
	}
	
	@Override
	public double getTotalPrice() {
		totalPrice = priceWithVat;
		return totalPrice;
	}

	@Override
	public String toString() {
		return "Medicine: tax = " + tax + ", priceWithVat = " + priceWithVat + ", totalPrice = " + totalPrice + ",";
	}

	
	}

