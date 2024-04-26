package iamgood;


public class Gang{
	static class Grade {

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

			 public static void main(String[] args) {
			        Grade grade1 = new Grade("강백호", 90.0, 85.5, 70.0);
			        Grade grade2 = new Grade("채치수", 82.0, 92.0, 60.5);

			        
			        
			        System.out.printf(grade1.name +"의 평균 점수: %.2f\n" , grade1.avg);
			        System.out.printf(grade2.name + "의 평균 점수: %.2f\n" , grade2.avg);
	
	
//	new Grade(강백호,90.0 , 85.5 , 70.0 ); 
//	new Grade(채치수, 82.0, 92.0, 60.5); 
			 }
	
		}
}
