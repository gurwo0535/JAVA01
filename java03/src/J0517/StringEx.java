package J0517;



public class StringEx {
	public static void main(String[] args) {
		
		
		
		// heap 메모리에 생성 ,저장 
		String a= new String(" C#");
		// heap 메모리에 생성 ,저장 
		String b= new String(" C++ ");
		
		//a.length() : a 문자열의 길이 
		//c#의 길이는 3 (스페이스 포함)
		System.out.println(a.length());
		
		
		// a.contains("#") : 문자열의 포함 여부 
		// #을 포함하고 있으므로 true 
		System.out.println(a.contains("#"));
		
		//a.contains("#") : 문자열의 포함 여부
		//*을 포함하지않으므로 false
		System.out.println(a.contains("*"));
		
		
		
		// concat() :문자열 연결
		a = a.concat(b);
		// C# C++ (새로운 스트링 객체를 생성 ,a를 가리킴) 
		System.out.println(a);
		 
		// a.trim(); : 앞뒤 공백 제거
		 a= a.trim();
		 //C# C++ 제거 되어 나옴 
		 System.out.println(a);
		
		 //replace(); : 문자열 대체,교환
		 a = a.replace("C#", "JAVA");
		 //"C#", "JAVA"  -> JAVA C++
		 System.out.println(a);
		 
		 //a.split(","); : 문자열을 분리
		 String s[] = a.split(",");
		 for (int i = 0; i < s.length; i++) {
//			 분리된 문자열0 : JAVA
//			 분리된 문자열1 : C#
			System.out.println("분리된 문자열"+i+":"+s[i]);
			
			//a.substring(5); : 인덱스값으로 시작하는 문자열 /5부터 시작
			a = a.substring(5);
			//JAVA C++ -> 5번쨰인 c부터 시작
			System.out.println(a);
			
			
			// a.charAt(2); : 인덱스에 해당하는 문자 
			// 0번재부터 시작해 2번쨰 답을 도출 
			char c =  a.charAt(2);
			//+ / C++ 의 0,1,2 중의 2번째 답 
			System.out.println(c);
		}
	}
}
