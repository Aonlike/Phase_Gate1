import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("How many students do you have? ");
		int students = input.nextInt();

		System.out.println("How many subject do they offer? ");
		int subjects = input.nextInt();

		int[][] scores = new int [students][subjects];
		
		
		String[] subjectNames = new String[subjects];
		for(int row = 0; row < students; row++){
			for(int col = 0; j < subjects; j++){
				if(score <= 0 // score >= 100)								{System.out.print("Enter students scores(between 0-100): ");}
			System.out.print("Enter students scores: ");
			scores[col] = input.nextInt();
		}
			System.out.println("Enter subjects offered: ");
			subjectNames[row] = input.next();  
		}
		System.out.print("SUMMARY");
		for(int row = 0; row < students; row++){
			int total = 0;
			int max = scores[row][0];
			int min = scores[row][0];

			for(int col = 0; col < subjects; col++){
				if (scores[row][col] > max){max = scores[row][col];}
				if (scores[row][col] < min){min = scores[i][j];}  
			}
				total += scores[row][col];
			}
			
			double average = (double) total / subjects;
			
			System.out.println("Total score: " + total);
           		System.out.println("Average score: " + average);
            		System.out.println("Highest score: " + max);
            		System.out.println("Lowest score: " + min);
			System.out.print("Average score is: " + average);
			
			}
	}
}


