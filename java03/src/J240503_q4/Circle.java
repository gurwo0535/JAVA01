package J240503_q4;

public class Circle {

	//맴버 변수(필드)
	int radius;
	//맴버 변수(필드)
	String name;
	
	//오버로딩
	public Circle() {}//클래스 하고 이름이 똑같은 메소드 : 생성자(기본)
	public Circle(int a) {}//클래스 하고 이름이 똑같은 메소드 : 생성자(매개변수 1개) 
	public Circle(int a,int b) {}//클래스 하고 이름이 똑같은 메소드 : 생성자(매개변수 2개) 
	
	
	public double getArea() {//맴버함수(메소드) /double :리턴타입
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		
		Circle pizza;//참조변수(태명과 비슷한느낌) 선언,
//					   circle이 클래스(객체를 생성하는 틀/판)
		
//		new Circle();//이름없는 circle
		pizza = new Circle();//객체 생성// 이름이 pizza
//		pizza.radius; // pizza가 객체 / radius가 필드
		pizza.radius = 10; //맴버 변수 값 셋팅
		pizza.name = "자바 	피자";//맴버 변수 값 셋팅
		double area=  pizza.getArea();//메소드(맴버함수) 호출
		
	
		System.out.println(pizza.name+"의 면적은 : "+area);//맴버 변수 값 사용
		
		
		Circle donut = new Circle();//객체생성//이름이 donut //중요
		
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		
		System.out.println(donut.name+"의 면적은 : "+area);//맴버 변수 값 사용
	}
	
}
