package J0510;

public class ChildExample {
	public static void main(String[] args) {
		//Parent 클래스에 기본 생성자 만들어서 호출하고,
		//Child 클래스에서 기본생성자 만들엇 호출
		
		//업캐스팅 (수퍼 클래스 타입으로 서브 클래스 객체 생성)
		Parent parent = new Child();
		parent.field1 = "data1";
		//업 캐스팅 된객체는 서브 클래스 - 맴버 접근 불가 
//		parent.field2 = "data1"; / 오류
		
		parent.method1();
		parent.method2();
//		parent.method3(); / 오류 //업 캐스팅 된객체는 서브 클래스 - 맴버 접근 불가
		
		Child child = (Child) parent;// 다운캐스팅 
		
		child.filed2 = "data2";//다운캐스팅 객체는서브클래스 접근 가능 
		
		child.method3();//다운캐스팅 객체는서브클래스 접근 가능
	}
}
