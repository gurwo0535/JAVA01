package J0517;

public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
//		/append() : 문자열을 연결(추가되면서 수정)
		sb.append(" is pencil");
		//This is pencil
		System.out.println(sb);
		
		//insert() : 문자열 삽입
		//삽입 할 위치 정할떄 공백은 세지않는다 
		sb.insert(7, " my");
//		This is pencil -> This is my pencil
		System.out.println(sb);
		
		//replace() : 문자열 대체
		// (시작위치,끝나는 위치,삽입할 문자)
		sb.replace(8, 10, "your");
		//This is my pencil -> This is your pencil
		System.out.println(sb);
		
		//delete(시작위치,끝나는위치) : 문자열 삭제
		sb.delete(8, 13);
		//This is your pencil -> This is pencil
		System.out.println(sb);
		
		//setLength(0부터 끝나는 범위 지정) : 문자열 길이 수정   
		sb.setLength(4);
		//This is pencil -> This
		System.out.println(sb);
		
		
		
	}
}
