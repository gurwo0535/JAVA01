package J0522;

public class StudentDriver_qq {
	public static void main(String[] args) {
		
		//---------- 
		//System.out.println(student1);
		// @Override
//		 public String toString() {
//		return "이름 : " + Name + "\n학번 : " + Number + "\n소속학과 : " + Department;
		
		// 위의 오버라이딩을 사용한다면 쉽게 줄일수 있다 
//		System.out.println("이름 : "+student1.getName());
//		System.out.println("학번 :"+student1.getNumber());
//		System.out.println("소속학과 :" +student1.getDepartment());
		
		Student_qq student1 = new Student_qq();
		
		student1.setName("갑돌");
		student1.setNumber(100);
		student1.setDepartment("컴퓨터 공학과");
		
		System.out.println(student1);
		
//		System.out.println("이름 : "+student2.getName());
//		System.out.println("학번 :"+student2.getNumber());
//		System.out.println("소속학과 :" +student2.getDepartment());
		
		Student_qq student2 = new Student_qq();
		
		student2.setName("갑순");
		student2.setNumber(200);
		student2.setDepartment("건축학과");
//		
		System.out.println(student2.toString());
		
		student2.setDepartment("수학과");
		
		// 오버라이딩하고 
		//student2.toString() 사용 해도 되네 ?
		
		System.out.println(student2.toString());
	}
}



