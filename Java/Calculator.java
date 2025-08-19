import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	int squareFirstNumber = firstNumber * firstNumber;
	System.out.print("The square of the first number is" + squareFirstNumber);

	int squareSecondNumber = secondNumber * secondNumber;
	System.out.print("The square of the second number is" + squareSecondNumber);

	int sumOfSquares = squareFirstNumber + squareSecondNumber;
	System.out.print("The sum of squares is " + sumOfSquares);
	
	int differenceOfSquares = squareFirstNumber - squareSecondNumber;
	System.out.print("The difference of squares is " + differenceOfSquares);
	



	}


}