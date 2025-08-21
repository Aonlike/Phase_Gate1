public class Task2{
  public static void main(String[] args){
	}
public static  String gradeCalculator(int score1, int score2, int score3){
    for(int score = 1; int score <= 100; score++){
		int average = score1 + score2 + score3;
		if(average >= 90 && average <= 100 ){
			return 'A';
			}
		else if(80 <= average && average < 90){
			return 'B';
			}
		else if(80 <= average && average < 90){
			return 'C';
			}
		else if(70 <= average && average < 80){
			return 'D';
			}
		else if(60 <= average && average < 70){
			return 'F';
			}
    }

  }

}