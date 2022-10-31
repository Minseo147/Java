package loop2;

import java.util.Scanner;

public class Problem2_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int number2 = sc.nextInt();
	
		for(int min=number < number2 ? number : number2, max=number>number2 ? number : number2; min <=max;min++) {
			for(int i=1; i<=9; i++) {
				System.out.println(min + "X" + i + "=" + (min*i));
		}
		}
		
		
	}

}
