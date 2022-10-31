package loop1;

import java.util.Scanner;

public class Problem3_Loop1 {

	public static void main(String[] args) {
		// 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		
		int number = sc.nextInt();
		
		for(int i=number; i<=number*10; i+= number) {
			System.out.print(i + " ");
		}
		
		

	}

}