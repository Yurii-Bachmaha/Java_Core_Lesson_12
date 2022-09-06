package task03;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Enter 1 to add the item to the end of the list." + "\nEnter 2 to view the list."
				+ "\nEnter 3 to delete an item from the list.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList MyList = new ArrayList();

		while (true) {
			menu();

			switch (sc.next()) {

			case "1": {
				System.out.println("Enter item");
				sc = new Scanner(System.in);
				String item = sc.next();
				MyList.add(item);
				break;
			}
			case "2": {
				System.out.println(MyList);
				break;
			}
			case "3": {
				sc = new Scanner(System.in);
				boolean flag = false;
				while (!flag)
					try {
						System.out.println("Enter index of element you want to delete");
						int index = sc.nextInt();
						sc.nextLine();
						MyList.remove(index);
						flag = true;
					} catch (InputMismatchException ime) {
						System.out.println("Enter valid value");
						sc.nextLine();
					}
				break;
			}
			}
		}
	}
}