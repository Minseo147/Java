package loop1;

import java.util.Scanner;

public class Problem1_Loop1 {

	public static void main(String[] args) {
		// 100 이하의 양의 정수만 입력된다. while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		
		int number = sc.nextInt();
		int sum = 0;
		
		int i = 1;
		while (i<=number) {
			sum += i;
			i++;
		}
		System.out.print(sum);
		
	}

}