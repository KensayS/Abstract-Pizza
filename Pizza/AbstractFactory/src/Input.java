import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// The driver for ordering a pizza from any franchise
		 try (Scanner input = new Scanner(System.in)) {
			if (args.length < 1) {
				System.out.println("welcome to our Pizza Store! What location would you like to order from? (NY, Chicago)");
			}
			String inputText = input.nextLine();
			if ("NY".equals(inputText)) {
				PizzaStore nyPizzaStore = new NYPizzaStore();
				nyPizzaStore.orderPizza(type());

			} else if ("Chicago".equals(inputText)) {
				PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
				chicagoPizzaStore.orderPizza(type());
				
			} else {
				System.out.println("Unidentified store location.");
			}
		}

	}
	
	public static String type() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("What type of Pizza would you like? Our options are: cheese, pepperoni, clam, and veggie");
			return input.nextLine();
		}
		
	}

}
