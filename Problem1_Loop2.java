package loop2;

import java.util.Scanner;

public class Problem1_Loop2 {

	public static void main(String[] args) {
		// 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하시오: ");
		
		int n = sc.nextInt();
		int sum = 0;
		int i;
		
		
		for(i=1; sum<n; i+=2) {
			if(i%2 !=0) {
				sum += i;
			}
		}
		System.out.println(i/2 + " " + sum);
	}
}