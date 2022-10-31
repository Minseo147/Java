package array1;

import java.util.Scanner;

public class Avg_Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        int[] width = new int[4];
        int[] height = new int[2];
        int average = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                width[i] += arr[i][j];
            }
        }

        for (int i = 0; i < arr[i].length; i++) {
            for(int j = 0; j < arr.length; j++) {
                height[i] += arr[j][i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                average += arr[i][j];
            }
        }

        for (int i = 0; i < width.length; i++) {
            System.out.print(width[i] / 2 + " ");
        }
        System.out.println();

        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i] / 4 + " ");
        }
        System.out.println();

        System.out.print(average / 8);

    }
}
