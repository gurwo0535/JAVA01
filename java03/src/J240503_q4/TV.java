package J240503_q4;

public class TV {
	String kaisya;
	int year;
	int inch;
	
	
	public TV(String kaisya, int year, int inch) { //1111/// 같은거 
		this.kaisya = kaisya;
		this.year = year;
		this.inch = inch;
//		
//		this("LG",2017,32); / this()를 쓰고 싶으면 크기가 맞는 생성자가 필요하다
		
		
	}
	
//	public TV(String k, int y, int i) { ///11111// 같은거 
//		kaisya = k;
//		year = y;
//		inch = i; 
//	}

	
	void show() {
		System.out.println(kaisya+"에서 만든 "+year+"년년형"+inch+"인치 TV" );
	}
	
	public static void main(String[] args) {
		 TV myTV = new TV("LG",2017,32);
		 
		 myTV.show();
	}
}
