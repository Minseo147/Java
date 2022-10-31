package array1;

import java.util.Scanner;

public class Problem8_Array1 {

	public static void main(String[] args) {
		// 2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("first array: ");
		System.out.println("second array: ");
		
		
		int [][] s = new int [2][4];
		int [][] s2 = new int [2][4];
		int [][] s3 = new int [2][4];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				s[i][j] = sc.nextInt();
			}
		} for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				s2[i][j] = sc.nextInt();
			}
		}
		System.out.println("first array");
		System.out.println("second array");
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				s3[i][j] = s[i][j] * s2[i][j];
				System.out.print(s3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
