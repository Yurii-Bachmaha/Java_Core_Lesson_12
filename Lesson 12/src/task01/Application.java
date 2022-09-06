package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Enter 1 to display array elements.");
		System.out.println("Enter 2 to set a single object of class auto for all objects of this array.");
	}

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(5);
		int b = random.nextInt(5);
		
		List<ArrayList<Auto>> auto = new ArrayList<>();
		List<String> TypeOfMaterial = new ArrayList<String>();
		TypeOfMaterial.add("Leather");
		TypeOfMaterial.add("Plastic");
		TypeOfMaterial.add("Alcantara");
		TypeOfMaterial.add("Wood");

		while (true) {
			Scanner sc = new Scanner(System.in);
			menu();

			switch (sc.next()) {

			case "1": {

				for (int c = 0; c < a; c++) {

					ArrayList<Auto> auto1 = new ArrayList<>();

					for (int d = 0; d < b; d++) {
						Auto autoA = new Auto(random.nextInt(100, 300), (random.nextInt(1980, 2022)),
									 new Engine(random.nextInt(2, 8)), 
									 new SteeringWheel(random.nextDouble(14, 16),TypeOfMaterial.get(random.nextInt(TypeOfMaterial.size()))));

						auto1.add(autoA);
					}
					auto.add(auto1);
				}
				System.out.println(auto);

				break;
			}

			case "2": {

				Auto autoC = new Auto(random.nextInt(100, 300), (random.nextInt(1980, 2022)),
							 new Engine(random.nextInt(2, 8)), 
							 new SteeringWheel(random.nextDouble(14, 16),TypeOfMaterial.get(random.nextInt(TypeOfMaterial.size()))));

				for (int c = 0; c < auto.size(); c++) {
					
					for (int d = 0; d < auto.get(c).size(); d++) {
						auto.get(c).set(d, autoC);
					}
				}
				System.out.println(auto);

				break;
			}

			default: {
				System.err.println("Enter 1 or 2");
			}
			}
		}
	}
}