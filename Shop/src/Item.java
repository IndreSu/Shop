
abstract class Item {
	
	String itemName;
	double netoPrice;

	public Item(String itemName, double netoPrice) {
		this.itemName = itemName;
		this.netoPrice = netoPrice;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getNetoPrice() {
		return netoPrice;
	}

	public void setNetoPrice(double netoPrice) {
		this.netoPrice = netoPrice;
	}

	public abstract double getPriceWithVat();
	
	public abstract double getExcise();

	public abstract double getTotalPrice();
}
