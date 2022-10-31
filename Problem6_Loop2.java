package loop2;

import java.util.Scanner;

public class Problem6_Loop2 {

	public static void main(String[] args) {
		// 1부터 100개까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 10의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int number = sc.nextInt();

		
		for(int i=1; number*i<=100; i++) {
			System.out.print(number*i + " ");
			
			if((number*i)%10 == 0) {
				break; 
			}
		}
	}
}
