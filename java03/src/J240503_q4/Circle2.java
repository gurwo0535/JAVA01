package J240503_q4;

public class Circle2 {
	//4.매개 변수 값이 맴버변수로 저장 
	//4. 맴버 변수가 1	
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
		}
	//2. 생성자 호출됨 
	public Circle2() {//생성자	
		//3. 반지름 1 
		radius = 1;
		name = "";
	} 
	
	//매개변수와 맴버변수가 같을때 this를 사용해서 경고창 없애줌
	//2.생성자 호출됨(매개변수를 받음)
	public Circle2(int radius, String n) {//생성자
		//3.매개변수 값이 저장
		 this.radius=radius;//10
		 name = n;//자바피자
	} 
	
	public static void main(String[] args) {
		//레퍼런스 (참조변수) 선언 
//		Circle2 pizza;
		
		//객체 생성하면서 생성자 호출(기본생성자 없으면 자동으로 생성해서 호출)
		//기본 생성자 외에 다른 생성자가 있으면 생성하지 못해서 컴파일 오류
//		new Circle2();//객체 생성 
		 
		/*//1.객체 생성하면서 생성자 호출 
		Circle2 pizza = new Circle2();// 반지름이1이고,이름(name)가없는 피자 생성 
		double area = pizza.getArea();
		System.out.println(area);
		*/
		
		//매개변수 1개를 가지는 생성자가 없어 오류

//		new Circle2(10);
		
		//1. 객체 생성하면서 생성자 호출 (매개변수 10,"자바피자"2개를 들고 감 )
		 Circle2 pizza =  new Circle2(10,"자바피자");
		 //반지름이 10이고, 이름은 자바피자인 pizza객체를 생성 
		 
		 double area = pizza.getArea();
		 System.out.println(pizza.name+"의 면적은"+area);
		
		 
		 //반지름이 1이고 , 이름은없는 도넛 생성 
//		 Circle2 donut = new Circle2();
		 Circle2 donut = new Circle2(2,"자바 도넛");
		 donut.name ="자바 도넛";// 객체의 맴버변수
		 area = donut.getArea();
		 
		 System.out.println(donut.name+"의 면적은"+area);
		 
	}
}
