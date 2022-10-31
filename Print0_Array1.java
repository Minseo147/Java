package array1;

import java.util.Scanner;

public class Print0_Array1 {

	public static void main(String[] args) {
		// 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0을 제외하고 
		// 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		
		int [] s = new int[100];
		int i, x=0;
		
		for(i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			if(s[i] == 0) {
				break;
			}
			x++;
		}
		for(i= x-1; i>=0; i--) {
			System.out.print(s[i] + " ");
		}
	}
}
