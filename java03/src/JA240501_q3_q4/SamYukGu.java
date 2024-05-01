package JA240501_q3_q4;

public class SamYukGu {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
        	
        	
        	
        	// continue 를 이용해 else 를 사용하지않고 코딩
        	  if (i % 3 == 0) {
                  System.out.print("짝 ");
                  continue;
              } 
                  System.out.print(i+" ");
              
        	  
        	  
        	//일반적인 방법 
//            if (i % 3 == 0) {
//                System.out.print("짝 ");
//            } else {
//                System.out.print(i+" ");
//            }
        	
        	
        	
          
        }
    }
}

//중급B 4 : 1~10까지의 3, 6, 9 (ContinueSamYukGu)
//1부터 10까지의 정수출력중
//3, 6, 9일 때는 박수 소리를출력하는프로그