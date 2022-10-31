package loop2;

import java.util.Scanner;

public class Problem5_Loop2 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아서 n줄 만큼 다음과 같이 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int number = sc.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			} for (int k=0; k<(2*number-1)-(2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}