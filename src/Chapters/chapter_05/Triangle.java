package exercise.Chapter_05;
// Display triangle consists of stars
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter line a triangle");
		int line=input.nextInt();
		for(int i=0;i<line;i++) {//determine number of rows
		for( int l=line;l>i;l--) {// create spaces
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {// created triangle consists of stars
			System.out.print("* ");
		}
		System.out.println();
		

	}

}
}
