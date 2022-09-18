package exercise.Chapter_05;

//Display a number and its reverse with diamond pattern
import java.util.*;

public class Reverse_Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line = 0;

		while (line % 2 == 0) {
			System.out.println("Enter line of diamond pattern(you must enter odd number)");
			line = input.nextInt();
		}
		for(int i=0;i<line;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<line;k++) {
				System.out.print(k+1+" ");
			}
			System.out.println();
		}
		for(int i=0;i<line;i++) {
			for(int j=line;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print((line-k)+" ");
			}
			System.out.println();
		}
		
		
		
	}

}

