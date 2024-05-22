package J0522;

public class Student_qq {

	public String Name;
	public int Number;
	public String Department;
	
//	alt shift s 게터 세터 만들기 
	

	
	 public String getName() {
		return Name;
	}
	 public void setName(String Name) {
		this.Name = Name;
	}
	 
	 public int getNumber() {
		 return Number;
	 }
	 public void setNumber(int Number) {
		 this.Number = Number;
	 }
	 
	 public String getDepartment() {
		 return Department;
	 }
	 public void setDepartment(String Department) {
		 this.Department = Department;
	 }
	 
	 //System.out.println(student1);
	 //오버라이딩 하지않으면 위의 코드를 사용할수 없다
	 // toString() : 이기에 자동으로 호출이 된다 
	 // equals()사용 할시 
	 
	 @Override
	 public String toString() {
		 
		return "이름 : " + Name + "\n학번 : " + Number + "\n소속학과 : " + Department;
	
	}
}


//1. Student 클래스 설계
//변수들
//Name: 이름
//Number: 학번
//Department: 소속학과
//
// StudentDriver 클래스 설계
//main 메소드 설계
//
//변수들
//
//student1: 첫 번째 Student 객체 참조변수
//student2: 두 번째 Student 객체 참조변수
// 알고리즘
//
//메소드들
//getName: 이름을 반환한다
//setName: 이름을 주어진 값으로 변경한다
//getNumber: 학번을 반환한다
//setNumber: 학번을 주어진 값으로 변경한다
//getDepartment: 소속학과를 반환한다
//setDepartment: 소속학과를 주어진 값으로 변경한다
//toString: 학생의 이름, 학번과 소속학과를 반환한다
//
//Student 객체를 생성하여 student1이 가리키게 한다. 
//
//객체student1의 이름을 ‘갑돌’로 변경한다.
//객체student1의 학번을 100으로 변경한다. 
//객체student1의 소속학과를 컴퓨터공학과로 변경한다.
//객체student1의 이름, 학번과 소속학과를 출력한다. 
//Student 객체를 생성하여 student2가 가리키게 한다.
//객체student2의 이름을 ‘갑순’으로 변경한다.
//객체student2의 학번을 200으로 변경한다. 
//객체student2의 소속학과를 건축학과로 변경한다.
//  10. 객체student2의 이름, 학번과 소속학과를 출력한다.
//  11. 객체student2의 소속학과를 수학과로변경한다.
//  12. 객체student2의 이름, 학번과 소속학과를 출력한다.