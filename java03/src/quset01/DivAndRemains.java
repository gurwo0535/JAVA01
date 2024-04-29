package quset01;

import java.util.Scanner;

public class DivAndRemains {
 public static void main(String[] args) {
	
	 System.out.print("2자리수 정수 입력(10~99) >> ");
	 Scanner sc =new Scanner(System.in);
	 int a = sc.nextInt();

	 int ten = a/10;
	 int one = a%10;

	 
//	 ex1
	 if (ten==one) {
		 System.out.println("Yes! 10의 자리와1의 자리가 같습니다");
	} else {
		System.out.println("No~ 틀려요");
	}
	 
//	 ex2
	 if (10 <= a && 99 >= a ) {
		}  if (a%11 == 0){
		 System.out.println("Yes! 10의 자리와1의 자리가 같습니다");
	}else {
		System.out.println("No~ 틀려요");
	}
		sc.close();
}
}
