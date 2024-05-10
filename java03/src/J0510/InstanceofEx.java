package J0510;
/*
 * Instanceof 연산사 사용 (상속)
 * */
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceofEx {
	
	//Person p = new Student() -> 업캐스팅 
	static void print(Person p) {
		if (p instanceof Person) {//p 객체가 Person 클래스타입지
			System.out.print("Person ");// 참이면 출력 //참
		}
		if (p instanceof Student) {//p 객체가 Student 클래스타입지
			System.out.print("Student ");// 참이면 출력 //참
			}
		if (p instanceof Researcher) {//p 객체가 Researcher 클래스타입지
			System.out.print("Researcher ");// 참이면 출력 / 거짓
		}
		if (p instanceof Professor) {//p 객체가 Professor 클래스타입지
			System.out.print("Professor ");// 참이면 출력 / 거짓 
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	System.out.print("new Student()->\t"); print(new Student());
	System.out.print("new Researcher()->\t"); print(new Researcher());
	System.out.print("new Professor()->\t"); print(new Professor());
	}
}
