package J0513;



// 오버라이딩 확인
// 업캐스팅과 오버라이딩의 차이 / 아직 
class Animal{
	public void eat() {
		System.out.println("동물처럼 먹는다");
	}
}
	class Person extends Animal {
		public void eat() {
			System.out.println("사람처럼 먹는다");
		}public void say() {
			System.out.println("사람처럼 말한다");
			
		}
	}

public class Text_overriding {
public static void main(String[] args) {
	
	Person p = new Person();
	p.eat();
	
	Animal a = new Animal();
	a.eat();
	
	Animal b = new Person();
	b.eat();  // 오버 라이딩 // 업캐스팅 
	
	Person c = (Person)b;
	c.say();  // 다운 캐스팅 
}
}
//Bird d = new Duck();// 업캐스팅
//d.eat();//업캐스팅은 슈퍼클래스의 맴버만 접근 가능 
//Duck d2 =(Duck)d;// 다운캐스팅
