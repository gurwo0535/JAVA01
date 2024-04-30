package java240430_cha03;

import java.util.Scanner;

public class LoopExample2gugu {
	public static void main(String[] args) {
		
		
		
		int i=1;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (i<=19) {
			System.out.println(n+" x "+i+" = " + n*i);
			i++;
		}
		
	}
}
