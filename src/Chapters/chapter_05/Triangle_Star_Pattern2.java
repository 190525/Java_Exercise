package exercise.Chapter_05;

import java.util.Scanner;

//Display star just Diamond pattern side
public class Triangle_Star_Pattern2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter line quarter of diamond");
		int line = input.nextInt();
		// Upper side of diamond pattern
		for (int i = 0; i < line; i++) {
			for (int j = line-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (i == line - 1) {
					for (int middlerow = 0; middlerow <line; middlerow++) {
						System.out.print("* ");
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
		// Lower side of diamond pattern

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = line; k>i; k--) {

				if (k == line || k == i+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

	}

}

