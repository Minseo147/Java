package loop2;

import java.util.Scanner;

public class Problem7_Loop2 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
		// 주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 쓰시오: ");
		
		int number = sc.nextInt();
		
		for(int i=0; i<number; i++) {
			int b=1;
			for (int j=0; j<number-1-i; j++) {
				System.out.print(" ");
			} for (int j=0; j<i+1; j++) {
				System.out.print(b++ + "");
			}
			System.out.println();
		}

	}

}