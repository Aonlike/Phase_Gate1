function gradeCalculator(score1,score2, score3){
    for(let score = 1;score <= 100; score++){
		let average = score1 + score2 + score3;
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
console.log(gradeCalculator(30,70,30))
}

