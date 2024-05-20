package J5020;

import java.util.Scanner;

//		person1.setLastName(lname);

public class PersonDriver {
	public static void main(String[] args) {
		String fname;
		String lname;
		Scanner scanner = new Scanner(System.in);
		
		Person person1 = new Person();
		
		System.out.print("성을 입력하세요 : ");
		lname = scanner.next();
		person1.lastName=lname;
		
		
		System.out.print("이름을 입력하세요 : ");
		fname = scanner.next();
		person1.firstName= fname;
		
		System.out.println("성 : "+lname);
		System.out.println("이름 : "+fname );
		System.out.println("성명의 길이 : "+ person1.getLength());
				
		Person person2 = new Person();
		
		System.out.print("성을 입력하세요 : ");
		lname = scanner.next();
		person2.lastName=lname;
		
		
		System.out.print("이름을 입력하세요 : ");
		fname = scanner.next();
		person2.firstName= fname;
		
		System.out.println("성 : "+lname);
		System.out.println("이름 : "+fname );
		System.out.println("성명의 길이 : "+ person2.getLength());
	}
}




