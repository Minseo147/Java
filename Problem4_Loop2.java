package loop2;

import java.util.Scanner;

public class Problem4_Loop2 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아서 n줄 만큼 다음과 같이 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
