package J0513;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
	
	int n = 10;
	// n을 값으로 가지는 객체 생성 (intObject : 참조변수 ,객체)
	Integer intObject = Integer.valueOf(n);//박싱 //10을 가지는 객체를 만듬 
		
	//auto boxing
	Integer intObject2 = n; 
	
	System.out.println("intObject = "+intObject);
	
	System.out.println("intObject2 = "+intObject2);//10 출력
	
	//intObject(객체)를 int m(기본타입)으로 받았기에 unboxing
//	int m = intObject.intValue()+intObject.intValue();
	
	// auto unboxing
	int m = intObject+intObject;
	
	System.out.println("m = "+m);
	
	}
}
