package array1;

import java.util.Scanner;

public class Alphabet_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하시오: ");
		String x = sc.next();
		
		String [] s = new String [10];
		String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		
		for(int i=0; i<alphabets.length; i++) {
			if (i == 3 || i == 0) {
				System.out.print(alphabets[i] + " ");
			} else if (i == 6) {
				System.out.print(alphabets[i] + " ");
			}
		}
	}

}
