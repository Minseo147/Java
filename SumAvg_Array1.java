package array1;

import java.util.Scanner;

public class SumAvg_Array1 {

	public static void main(String[] args) {
		//열개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double sum1 = 0;
		
		double [] s = {95, 100, 88, 65, 76, 89, 58, 93, 77, 99};
		
		for(int i=0; i<s.length; i++) {
			if (i==1 || i==3 || i==5 || i==7 || i==9) {
				sum += s[i];
			} else if (i==0 || i==2 || i==4 || i==6 || i==8) {
				sum1 += s[i];
				
			}
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + sum1/5);
	}

}
