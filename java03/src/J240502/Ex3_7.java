package J240502;

public class Ex3_7 {
	public static void main(String[] args) {
		//선언 생성 초기화
		int[] evens = {0,2,4,6,8,10,12,14,16,18}; 
		int[] primes  = {2,3,5,7,11,13,17,19}; 
	
		
//		11.짝수 배열을 메소드 매개변수로 호출
//		sum(evens); 
		
//		55.합계를 받아서 enensum에 저장
//		int evensum = sum(evens); 
//		int enensum = sum(evens[]); // []오류 
		int evensum = sum(evens); 
		int primesum = sum(primes); 
		
		
		
		// -- public static int sum(int arr) 
		// sum(int arr) 를 sum(int[] arr)하여 타입을 맞춰준다
		
		
		System.out.println("짝수 배열의 합 : "+ evensum);
		System.out.println("소수 배열의 합 : "+ primesum);
	}
/*	
 * 
	int : 리턴타입
	sum() : 메소드
	sum(int[] arr) : arr - 파라미터
	*/
//	public static int sum(int[] arr) {
	
	
//		22. arr로 evens를 받는다.
	// 같은 이름을 사용해도 무관  --  int[] evens  --um(int[] arr)
//	public static int sum(int arr) {
	
//	sum(int[] arr) : sum은 배열을 받아서 함계를 구해주는 메소드
		public static int sum(int[] arr) { 
			int sum = 0;
			
//			매개변수 배열의 크기만큼 반복하면서 sum에 합계를 누적
//			33.arr 배열원소를 가지고 반복  /{0,2,4,6,8,10,12,14,16,18}해서 합곅 구함
			for (int i = 0; i < arr.length; i++) {
				sum +=arr[i];
			}
//			44. 합계를 반환 
		return sum; // int와 값을 맞춰서 0 입력
		
	}
	
}

