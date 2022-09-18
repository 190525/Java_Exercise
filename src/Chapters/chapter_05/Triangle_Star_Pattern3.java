package exercise.Chapter_05;

import java.util.Scanner;

//Display star just different shape of Diamond pattern side. 
public class Triangle_Star_Pattern3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter line of quarter diamond");
		int line = input.nextInt();
	
		for(int i=0;i<line;i++) {
			for(int j=line;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				if(k==0||k==i||k==2*i) {
				System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=line;i>=0;i--) {
			for(int j=line;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				if(k==0||k==i||k==2*i) {
				System.out.print("*");
				}
				
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
