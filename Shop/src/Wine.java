
public class Wine extends Item {
	
	private final double tax = 21;
	private double capacity;
	private double alcVol;
	private double excise;
	private double priceWithVat;
	private double totalPrice;
	

	public Wine(String itemName, double netoPrice, double capacity, double alcVol) {
		super(itemName, netoPrice);
		this.capacity = capacity;
		this.alcVol = alcVol;
		this.priceWithVat = getPriceWithVat();
		this.excise = getExcise();
		this.totalPrice = getTotalPrice();
	}
	
	@Override
	public double getPriceWithVat() {
		priceWithVat = Math.round(netoPrice + ((netoPrice * tax)/100) * 100.0/100.0);
		return priceWithVat;
	}
	
	@Override
	public double getExcise() {
		if (alcVol < 8.5) {
			this.excise =  (0.28 * capacity);
		} else {
			this.excise = (0.72 * capacity);
		}
		return excise;
	}

	@Override
	public double getTotalPrice() {
		totalPrice = Math.round((priceWithVat + excise) *  100.0/100.0) ;
		return totalPrice;
	}
	

	@Override
	public String toString() {
		return "Wine: tax = " + tax + ", capacity = " + capacity + ", alcVol = " + alcVol + ", excise = " + excise
				+ ", priceWithPvm = " + priceWithVat + ", totalPrice = " + totalPrice
				+ ",";
	}
}
