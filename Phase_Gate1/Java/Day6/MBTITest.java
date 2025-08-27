import java.util.Scanner;
public class MBTITest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

String[][] questions = {{"Question 1\nExpend energy, enjoy groups. ", "B. Conserve 	energy, enjoy one-on-one: "},
	{"Question 2\nA. Interpret literally. ", "B. Look for meaning and 	possibilities: "},
	{"Question 3\nA.logical, thinking, questioning. ", "B. empathetic, feeling, 	accommodating: "},
	{"Question 4\nA. Organized, orderly. ", "B. flexible, adaptable: "},
	{"Question 5\nA. More outgoing, think out loud. ", "B. more reserved, think 	to yourself: "},
	{"Question 6\nA. Practical, realistic, experiential. ", "B. imaginative, 	innovative, theoretical: "},
	{"Question 7\nA. Candid, straight forward, frank. ", "B. tactful, kind, 	encouraging: "},
	{"Question 8\nA. Plan, schedule. ", "B. Unplanned, spontaneous: "},
	{"Question 9\nA. Seek many tasks, public activities, interaction with 	others. ", "B.seek private, solitary activities with quiet to concentrate: 	"},
	{"Question 10\nA. Standard, usual, conventional. ", "B. different, novel,	 unique: "}, 
	{"Question 11\nA. Firm, tend to criticize, hold the line. ", "B. gentle, 	tend to appreciate, conciliate: "},
	{"Question 12\nA. Regulated, structured. ", "B. Easygoing, \"live\" and 	\"let live\": "},
	{"Question 13\nA. external Communicative. , express yourself", "B. 	Internal, reticent, keep to yourself: "},
	{"Question 14\nA. Focus on here-and-now. ", "B. look to the future, global 	perspective \"big picture\": "},
	{"Question 15\nA. Tough-minded, just. ", "B. tender-hearted, merciful: "},
	{"Question 16\nA. Preparation, plan ahead. ", "B. go with the flow, adapt 	as you go: "},
	{"Question 17\nA. Active, initiate. ", "B. reflective, deliberate: "},
	{"Question 18\nA. facts, things, \"what is\". ", "B. Ideas, dreams, \"what 	could be,\" philosophical: "},
	{"Question 19\nA. matter of fact, issue-oriented. ", "B. Sensitive, people-	oriented, compassionate: "},
	{"Question 20\nA. control, govern. ", "B. latitude, freedom: "}
	};

		System.out.print("Enter your name: ");
		String name = input.nextLine();

		for(int number = 0; number < 4; number++){
	 	 for(number = display; display < questions.length; display = display + 4 ){
			System.out.print("questions[display[0]]");
			System.out.print("questions[display[1]]");
			String answer = input.nextLine();

			 if (answer.equalsIgnoreCase("a") || answers.equalsIgnoreCase("b")){
               if (answers.equalsIgnoreCase("a")){
                  answerArray[display] = questions[display][0]; }
               else {
                  answerArray[display] = questions[display][1];
                  
                   }



		  }	
		}


	
	}

}
