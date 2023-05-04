
public class AlcoDrink extends Item {

	private final double tax = 21;
	private double capacity;
	private double alcVol;
	private double excise;
	private double priceWithVat;
	private double totalPrice;

	public AlcoDrink(String itemName, double netoPrice, double capacity, double alcVol) {
		super(itemName, netoPrice);
		this.capacity = capacity;
		this.alcVol = alcVol;
		this.priceWithVat = getPriceWithVat();
		this.excise = getExcise();
		this.totalPrice = getTotalPrice();
	}

	@Override
	public double getPriceWithVat() {
		return priceWithVat = Math.round((netoPrice + ((netoPrice * tax)/100) * 100.0 / 100.0));
	}

	@Override
	public double getExcise() {
		if (alcVol < 15) {
			excise = (0.89 * capacity);
		} else {
			excise = (1.26 * capacity);
		}
		return excise;
	}
	
	@Override
	public double getTotalPrice() {
		this.totalPrice = Math.round((priceWithVat + excise) * 100.0 / 100.0);
		return totalPrice;
	}


	@Override
	public String toString() {
		return "AlcoDrink: tax = " + tax + ", capacity = " + capacity + ", alcVol = " + alcVol + ", excise = " + excise
				+ ", priceWithVat = " + priceWithVat + ", totalPrice = " + totalPrice + ",";
	}
}
