package J240508_package1;


import java.util.Scanner;

public class ArrayminMax {
	public static void main(String[] args) {
		
		System.out.println("양수 10개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[10];
		int min =0;
		int max =0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			
			if (i == 0) {
				min = intArray[i];
			}if (intArray[i]< min) {
				min = intArray[i];
			}if (intArray[i]> max) {
				max = intArray[i];
			}
		}
		System.out.print("가장 작은 수는 "+min+"이고, ");
		System.out.println("가장 큰 수는 "+max+"이고, ");
		System.out.println("최소값+최대값은 "+(min+max)+"입니다.");
	}
}


//중상급3 배열에입력받은수중최소값+최대값(ArrayMinMax)
//양수10개를입력받아배열에저장하고,제일작은수와제일큰수를더한
//값을출력하는프로그램을작성하라. 
//양수10개를입력하세요.
// 10
// 9
// 8
// 7
// 6
// 5
// 14
// 13
// 12
// 11
//가장작은수는5이고,가장큰수는14이고,
//최소값+최대값은19입니다.