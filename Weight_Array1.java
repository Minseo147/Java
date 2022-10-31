package array1;

import java.util.Scanner;

public class Weight_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게를 입력하시오: ");
		double [] weight = new double[6];
		double sum = 0;
		
		
		for(int i=0; i<weight.length; i++) {
			double x = sc.nextDouble();
			weight[i] = (x);
			sum += weight[i];
		}
		System.out.print("몸무게의 평균은:  " + Math.round(sum/6*10)/10.0);
	}

}
