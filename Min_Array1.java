package array1;

import java.util.Scanner;

public class Min_Array1 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int [] s = new int[10];
		int min = 1000;
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			if(min>s[i]) {
				min = s[i];
			}
		}
		System.out.print("입력된 수에서 가장 작은 수는: " + min + " 입니다.");
	}

}
