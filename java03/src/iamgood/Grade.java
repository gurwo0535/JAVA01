package iamgood;

public class Grade {

	String name;
	double korScore ;
	double engScore ;
	double mathScore ;
	double avg ; 
	public Grade(String name,double korScore,
			double mathScore,double engScore) {
			this.name = name;
			this.korScore = korScore;
			this.mathScore = mathScore;
			this.engScore = engScore;
			
			avg = (korScore + mathScore + engScore)/3;
			
			
	}
	
//	new Grade(강백호,90.0 , 85.5 , 70.0 ); 
//	new Grade(채치수, 82.0, 92.0, 60.5); 
	
	
}

