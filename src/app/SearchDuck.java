package app;

import java.util.Scanner;

import domain.DuckException;
import domain.DuckService;
import domain.DuckType;
import domain.DucksEntry;
import domain.MallardDuck;
import domain.SteamerDuck;

public class SearchDuck {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("There are many kinds of ducks.");
		while(start()) {
			try {
				System.out.println("What type of duck would you like to know more about, mallard or steamer?");
				DuckType duckType = DuckType.fromString(scanner.next());
				isValidDuck(duckType);
				DucksEntry newDuck = new DucksEntry(duckType);
				DuckService duckService = null;
				if (duckType == DuckType.MALLARD) {
					duckService = new MallardDuck(newDuck);
				} else if (duckType == DuckType.STEAMER) {
					duckService = new SteamerDuck(newDuck);
				}
				duckService.printDuck();
			} catch (DuckException duckException){
				System.out.println(duckException.getMessage());
			} catch (Exception e) {
				System.out.println("Fatal exception. Please contect the service.");
			}
		}
	}

	private static void isValidDuck(DuckType duckType) {
		if (duckType == DuckType.INVALID) {
			throw new DuckException("Please enter either mallard or steamer!");
		}
	}
	
	private static boolean start() {
		System.out.println("Type anything to continue or 'exit' to quit the program.");
		String value = scanner.next();
		if (value.equalsIgnoreCase("exit")) {
			System.out.println("Thank you for using Duck Info app.");
			System.exit(0);
		}
		return true;
	}
}
