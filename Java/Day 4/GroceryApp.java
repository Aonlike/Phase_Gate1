import java.util.ArrayList;
import java.util.Scanner;
public class GroceryApp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	ArrayList<String> items = new ArrayList<>();
	int showMenu;


      do{
	String prompt = """ 
		1. Add an item
		2. Remove an item
		3. Available items
		4. Exit
			 """;
		System.out.print(prompt);
		int showMenu = input.nextInt();
		input.nextLine();
			

		switch(showMenu){
			case 1:{System.out.println("Add an item: ");
				String addItem = input.nextLine();
				//items.add(addItem);
				//System.out.println(addItem + " added to items.");
				break;}

			case 2: System.out.println("Remove an Item: ");
				String removeItem = input.nextLine();
				items.remove(removeItem);
				System.out.println(removeItem + " removed from items.");
				break;
			case 3: System.out.println("Available Items");
				break;

			case 4: System.out.println("Exit the program! Goodbye");

			default:System.out.println("Invalid choice. Please try again.");}
		}while(showMenu != 4 );
    
	}
}


