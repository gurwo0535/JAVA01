package J0522;

@FunctionalInterface
interface MyFuntion2{
	
	//추상메소드는 리턴값이 없다 ?
	
	// calc(int x);
	
	int calc(int x);

}

public class LambdaEx2 {
	public static void main(String[] args) {
		
		MyFuntion2 square = x->x*x;
		
		//메소드에서 리턴값을 가져오는것과 비슷한 형태 
		System.out.println(square.calc(3));
	}
}
