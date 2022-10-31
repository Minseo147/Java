package loop2;

import java.util.Scanner;

public class Problem3_Loop2 {

	public static void main(String[] args) {
		// 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.println(" ");
			for(int k=1; k<=b; k++) {
				System.out.print(i*k);
			}
			
		}
	}

}