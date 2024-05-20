package J5020;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		
//		File dir = new File("d:/aaa");
		File dir = new File("d:/aaa/bbb");
		
		// 파일만들기 범위지정 가능 
		File file1 = new File("d:/aaa/file1.txt");
		
		// 다수 생성도 가능 
		File file2 = new File("d:/aaa/file2.txt");
		File file3 = new File("d:/aaa/file3.txt");
	
		
		//디렉토리 (폴더)만들기 
//		dir.mkdir();
		
		//하위 디렉토리(폴더)까지 같이 만들기  
		dir.mkdirs();
		
		//파일 만들기 
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
		//디렉터리 정보File("d:/aaa") 를가지고 test객체 생성 
		File test = new File("d:/aaa");
		
		//디렉터리 정보를 가지고 온다(하위 디렉토리+파일)
		//contents - File 객체의 배열 
		File[] contents = test.listFiles();
		
		System.out.println("날짜                시간           형태         크기             이름");
		System.out.println("---------------------------------------------------------------");
		
		//년 월 일 오전 오후 시간 분 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		
		for (int i = 0; i < contents.length; i++) {
			
			//contents[i].lastModified() : 마지막 생성 일자 
			//1716170830106 : 1970년1월1일 기준으로 오늘까지 
			//milliseconds로 계산된 값  
//			System.out.print(contents[i].lastModified());
			
			
//			System.out.print(new Date(contents[i].lastModified()) );
			
			System.out.print(sdf.format(new Date(contents[i].lastModified()) ) );
			
			if (contents[i].isDirectory()) {// 디렉토리 이면 
			System.out.println("\t<DIR>\t\t"+contents[i].getName());
				
			} else {
				System.out.println("\t\t\t"+contents[i].length()+"\t"+contents[i].getName());

			}
			
			
		}
	}
	
}
