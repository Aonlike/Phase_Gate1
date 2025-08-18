import java.util.Scanner;
public class DivisiblByThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int integer = input.nextInt();

		if(integer % 3 == 0){
			System.out.print("Integer is divisible by 3");}
		else
			{System.out.print("Integer is not divisible by 3");}

	}


}