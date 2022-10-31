package array1;

import java.util.Scanner;

public class Problem7_Array1 {

	public static void main(String[] args) {
		// 100 미만의 양의 정수들이 주어진다. 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 그 때까지 입력된 정수의
		// 십의 자리 숫자가 각가 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오.(0개인 숫자는 출력하지 않는다.)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int [] s = new int[10];
		
		while (true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int a = n/10;
			s[a]++;
		}
		 for(int i=0; i<s.length; i++) {
			 if(s[i] !=0) {
				 System.out.println(i + " : " + s[i]);
			 }
		 }
	}

}
