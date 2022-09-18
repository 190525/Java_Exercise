package exercise.Chapter_05;

// Display diamond pattern
import java.util.*;

public class Diamond_Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter upper line of diamond pattern");
		int line = input.nextInt();
		for (int i = 0; i < line; i++) {// determine number of rows upper side
			for (int l = line; l > i; l--) {// create spaces
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {// created upper triangle consists of stars
				System.out.print("* ");
			}
			System.out.println();

		}
		for (int i = 1; i < line; i++) {// determine number of rows lower side
			for (int j = 0; j <= i; j++) {// create spaces
				System.out.print(" ");

			}
			for (int k = line-1; k >= i; k--) {// created lower triangle consists of stars
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}

