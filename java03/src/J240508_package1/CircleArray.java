package J240508_package1;




class Circle3{
//	4. 맴버변수 저장됨 
	int radius;
	public double getArea() {
		
		return 3.14*radius*radius;
	}
//	2. radius = 0;
	public Circle3(int radius) { 
		//Circle3 = 생성자 // 클레스와 이름이같은 매소드 //리턴값이 없음 
//		3. 매개변수를 맴버변수에 저장 
		this.radius =radius; //this.radius 맴버변수  --  =radius; 매개변수 
	}
}

class Circle4{}
class Circle5{}
class Circle6{}
class Circle7{}

//jvm - CircleArray - main(String[] args) 
//CircleArray : 자동차 브랜드 
//ex)현대-Circle4 삼성-Circle5 소나타-Circle6 
// 자동차를 만들어내는 행위 == 객체 생성 
//Circle3[] c  ==  객체생성[] 현대,삼성등 자동차 이름  
//c = new Circle3[5]-- 5개 차동차 생산하는 라인 
//c[i] =  new Circle3(i) -- 실직적인 자동차 생산 
//(c[i].getArea() -- 자동차를 내보이기 위한 도색 (검정색)/(c[i].getArea2()라면 빨간색  

public class CircleArray {
	public static void main(String[] args) {
		
		Circle3[] c; // 객체 배열 Circle3을 참조변수 c로 선언 
		c = new Circle3[5]; // 객체 배열 생성 ->참조변수 5개 크기 (c[0]~c[4])
		
		//c.length = 5
		for (int i = 0; i < c.length; i++) {
//			1.i=0 -> 객체 생성 - 생성자 호출 
			c[i] =  new Circle3(i); // 객체  생성  (c[0]~c[4]) 참조 변수가 객체를 가리킴
			 //Circle3(i) 객체   -- c[i] 레퍼런스 변수 
		}
		for (int i = 0; i < c.length; i++) {
//			5개 객체의각각의 메소드 호출해서 다른 원의 넓이를 구함 
			System.out.println(c[i].getArea());
		}
	}
}
