package array1;

import java.util.Scanner;

public class Score_Array1{

	public static void main(String[] args) {
		// 1. 배열의 초기화 입력 2. 입력받은 반의 평균점수 합 내 
		Scanner sc = new Scanner(System.in);
		System.out.print("반을 입력하시오: ");
		
		int i;
		int x = sc.nextInt();
		double [] scores = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		double sum = 0;
		
		for ( i=0; i<scores.length; i++) {
			if(i==0 || i==2) {
				sum += scores[i];
			}
			
		}
		System.out.print("점수는: " + sum);
	}
}


