package Qn5;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up ;
        System.out.println("Enter the height of Qn5.Pyramid: ");
        up = sc.nextInt();
        int k = 0;

        for (int i = 1; i <= up; ++i, k = 0) {
            for (int space = 1; space <= up - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}
