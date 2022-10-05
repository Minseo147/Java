import java.util.Scanner;

public class MiniProject2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double F, C; //화씨, 섭씨
		
		System.out.println("==========================");
		System.out.println("1. 화씨->섭씨 ");
		System.out.println("2. 섭씨->화씨 ");
		System.out.println("==========================");
		System.out.print("번호를 선택하시오: ");
		int n = sc.nextInt(); //menu 선택
		
		if (n==1) { //화씨 -> 섭씨
			System.out.print("화씨온도를 입력하시오: ");
			F = sc.nextDouble();
			C = (F-32)/1.8;
			System.out.println("섭씨온도는 " + C);
		}
		else if (n==2) { //섭씨 -> 화씨
			System.out.print("섭씨온도를 입력하시오: ");
			C = sc.nextDouble();
			F = (C*1.8) + 32;
			System.out.println("화씨온도는 " + F);
		}
		
		
	}

}
