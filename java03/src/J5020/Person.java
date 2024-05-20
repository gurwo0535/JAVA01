package J5020;


// alt+sh+ s / getter setter 단축키 
public class Person {

	public String lastName;
	public String firstName;
	
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	public  int getLength() {
		
		return   getLastName().length() + getFirstName().length();
		
	}
}
