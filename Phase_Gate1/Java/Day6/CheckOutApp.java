import java.time.LocalDateTime;
import java.util.Scanner;

public class CheckOutApp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("What did you buy\n ");
        String itemPurchased = input.nextLine();
        itemsBought.add(itemPurchased);
        
        System.out.print("How many peices\n "); 
        int itemsNumber = input.nextInt();
        itemsNo.add(itemsNumber);
        
        System.out.println("How much per unit\n");
        double howMuch = input.nextDouble();
        itemPrice.add(howMuch);
        
        input.nextLine();
        System.out.println("Add more items?\n");
        String addItems = input.nextLine();
        
        System.out.println("What is your name?\n");
        String cashier = input.nextLine();
        
        System.out.println("How much discount will he get?\n");
        double discount = input.nextDouble();

	 System.out.println("""
      SEMICOLON STORES
      MAIN BRANCH
      LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
      TEL: 03293828343
      DATE: 18-DEC-24 8:48:11PM
      """);
      System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashier, name);
      System.out.println("======================================================");
      System.out.printf("%s\t%s\t%s\t%s", "Item", "QTY", "PRICE", "TOTAL");

	}


}