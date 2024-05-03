package J240503_q4;

public class CoronaSum_3 {
	public static void main(String[] args) {
	
//		//선생님 
//		int sum = 0;
//		int corona[][]= {{11,12,13}
//						 ,{21,22,23}		
//						 ,{31,32,33}		
//						 ,{41,42,43}		
//						 ,{51,52,53}		
//						 ,{61,62,63}		
//						 ,{71,72,73}		
//						 ,{81,82,83}		
//						 ,{91,92,93}		
//						 ,{101,102,103}		
//						 ,{111,112,113}		
//						 ,{121,122,123}		
//		};
//		//행기준(1월~12월), corona.length:12
//		for (int month = 0; month < corona.length; month++) {
//			//열 기준(3개 도시),corona[month].length : 3
//			for (int city = 0; city < corona[month].length; city++) {
//				//최종 반복: 행*열 =12*3=36(11~123 반복)
//				sum+=corona[month][city];
//			}
//		}
//		System.out.println("1년 전체 코로나 환자수는 : "+sum);
//	}
//}
		//나 결과값 틀림
		int sum = 0;
		
		int corona[][]= new int[12][3];
		
		
		for (int i = 0; i < corona.length; i++) {
			for (int j = 0; j < corona[i].length; j++) {
				
//				corona[i][j] = j*10+(i+1);   // 나 틀림 
				corona[i][j] = (i+1)*10+1+j;  // 이거 맞음 확인 요망
				sum +=corona[i][j];
				System.out.println("ii ==="+i);
				System.out.println("jj ==="+j);
				
				
				System.out.println("1년 전체 코로나 환자수는 : "+sum);
				
			}
		}
	}
}


//급C10 : 2차원 배열로 1년 코로나 환자수구하기(CoronaSum)
//1
//2차원 배열에월별로3개의도시에발생된코로나환자수를저장하고, 1년간전체
//코로나환자수를출력하라. (단, 1월은 3개의 도시에 각각11, 12, 13 명 발생하고, 2
//월은21,22,23… 12월은 121,122,123 이다.)
//1년 전체코로나환자수는2412