package loop1;

public class Problem7_Loop1 {

	public static void main(String[] args) {
		// 아래와 같이 출력되는 프로그램을 작성하시오.
		for (int i=1; i<6; i++) {
			for (int j=i+1; j<=i+5; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
