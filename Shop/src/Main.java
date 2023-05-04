
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		
		Converter convertToFranks = new Converter();
		
		SimpleItem arbata = new SimpleItem("Ooling", 4.99);
		System.out.println(arbata.getItemName());
		System.out.println(arbata);
		System.out.println("in Franks = " + convertToFranks.getPriceFranks(arbata));
		
		Medicine painkiller = new Medicine("Apap", 2.55);
		System.out.println(painkiller.getItemName());
		System.out.println(painkiller);
		System.out.println("in Franks = " + convertToFranks.getPriceFranks(painkiller));

		AlcoDrink beer = new AlcoDrink("Corona", 1.99, 0.5, 4.3);
		System.out.println(beer.getItemName());
		System.out.println(beer);
		System.out.println("in Franks = " + convertToFranks.getPriceFranks(beer));

		
		Wine redWine = new Wine("Chiraz",9.99, 0.7, 13.3);
		System.out.println(redWine.getItemName());
		System.out.println(redWine);
		System.out.println("in Franks = " + convertToFranks.getPriceFranks(redWine));


		
		
//		System.out.println("Choose item category:");
//		System.out.println("1. simple item");
//		System.out.println("2. medicine");
//		System.out.println("3. alcoholic drink");
//		System.out.println("4. wine");
//		
//		int category = Integer.parseInt(input.nextLine());
//		if (category == 1) {
//			System.out.println("Enter item name and neto price:");
//			String itemName = input.nextLine();
//			double netoPrice = Double.parseDouble(input.nextLine());
//			SimpleItem arbata = new SimpleItem(itemName, netoPrice);
//			System.out.println(arbata);
//			System.out.println("in Franks = " + convertToFranks.getPriceFranks(arbata));
//		
//		} else if (category == 2) {
//			System.out.println("Enter item name and neto price:");
//			String itemName = input.nextLine();
//			double netoPrice = Double.parseDouble(input.nextLine());
//			Medicine painkiller = new Medicine(itemName, netoPrice);
//			System.out.println(painkiller);
//			System.out.println("in Franks = " + convertToFranks.getPriceFranks(painkiller));
//				
//		} else if (category == 3) {
//			System.out.println("Enter item name, neto price, capacity and alcohol volume:");
//			String itemName = input.nextLine();
//			double netoPrice = Double.parseDouble(input.nextLine());
//			double capacity = Double.parseDouble(input.nextLine());
//			double alcVol = Double.parseDouble(input.nextLine());
//			AlcoDrink beer = new AlcoDrink(itemName, netoPrice, capacity, alcVol);
//			System.out.println(beer);
//			System.out.println("in Franks = " + convertToFranks.getPriceFranks(beer));
//			
//		} else if (category == 4) {
//			System.out.println("Enter item name, neto price, capacity and alcohol volume:");
//			String itemName = input.nextLine();
//			double netoPrice = Double.parseDouble(input.nextLine());
//			double capacity = Double.parseDouble(input.nextLine());
//			double alcVol = Double.parseDouble(input.nextLine());
//			Wine redWine = new Wine(itemName, netoPrice, capacity, alcVol);
//			System.out.println(redWine);
//			System.out.println("in Franks = " + convertToFranks.getPriceFranks(redWine));
//		}
//		input.close();
	}
}
