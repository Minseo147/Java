package loop1;

import java.util.Scanner;

public class Problem5_Loop1 {

	public static void main(String[] args) {
		// 0이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		
		int number2 = 0;
		
		while(true) {
			int number = sc.nextInt();
			if(number % 3 != 0 && number % 5 != 0) {
				number2++;
			}else if(number == 0) {
				break;
			}
		}
		System.out.print(number2);
	}

}