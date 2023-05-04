
public class Converter {

	private double toFranks = 0.9861;
	
	double getPriceFranks(Item item) {
		return item.getTotalPrice() * toFranks;
	}
	
}
