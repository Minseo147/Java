package loop1;

import java.util.Scanner;

public class Problem2_Loop1 {

	public static void main(String[] args) {
		// 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i=number; i<=100; i++) {
			sum+= i;
		}
		System.out.println(sum);
	}

}
