package exercise.Chapter_05;

import java.util.Scanner;

// Display star just triangle side
public class Triangle_Star_Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter line of quarter dimond");
		int line = input.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = line; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (i == line - 1) {
					for (int lastRow = 0; lastRow <= 2*i; lastRow++) {
						System.out.print("*");

					}
					break;
				}
				if (k == 0 || k == i) {

					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}

}

