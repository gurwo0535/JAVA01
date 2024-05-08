package J240508_package1;






public class ArrayparameterEx {
	//공백을 쉼표로 바꿔주는 메소드  
	static void replaceSpace(char a[]){
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
		} 
	}
	//파라미터로 받은 배열 원소를 출력 
	static void printCharArray(char a[]){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		} 
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);// 1. char c[] 값출력 
		replaceSpace(c); // 2. if (a[i] == ' '; a[i] = ',';로 변경 
		printCharArray(c); // 3. 변경된 값 출력 
		
		//불러들이는 것과 가져오는 것에 코드적인 차이가 있나??
		
	}
	
}
