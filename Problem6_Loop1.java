package loop1;

import java.util.Scanner;

public class Problem6_Loop1 {

	public static void main(String[] args) {
		// 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue?" 에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y'이면 작업을 반복하고
		// 다른 문자이면 종료하는 프로그램을 작성하시오. (넓이는 반올림하여 소수 첫째자리까지 출력한다.)
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			float width = ((float)base*height)/2;
			System.out.println("Triangle width = " + width);
			System.out.print("Contine? ");
			String answer = sc.next();
			if (answer.equals("Y") || answer.equals("y")) {
				continue;
			} else {
				break;
			}
		}
	}

}