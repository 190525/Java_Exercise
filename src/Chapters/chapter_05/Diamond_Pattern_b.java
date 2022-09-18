package exercise.Chapter_05;

//Display diamond pattern
import java.util.*;

public class Diamond_Pattern_b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line=0;
		
		while (line % 2 == 0) {
			System.out.println("enter line of diamond pattern(you must enter odd number)");
			line = input.nextInt();
		}
		for (int i = 0; i < line / 2 + 1; i++) {// determine number of rows upper side
			for (int l = line / 2 + 1; l > i; l--) {// create spaces
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {// created upper triangle consists of stars
				System.out.print("* ");
			}
			System.out.println();

		}
		for (int i = 1; i < line / 2 + 1; i++) {// determine number of rows lower side
			for (int j = 0; j <= i; j++) {// create spaces
				System.out.print(" ");

			}
			for (int k = line / 2 + 1; k > i; k--) {// created lower triangle consists of stars
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}

