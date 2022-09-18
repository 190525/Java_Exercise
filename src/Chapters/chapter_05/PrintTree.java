package exercise.Chapter_05;

public class PrintTree {

	public static void main(String[] args) {
		for(int i=2;i<7;i++) {
			for(int j=0;j<2*i-1;j++) {
				for(int k=11;k>j;k--) {
					System.out.print(" ");
				}
				for(int l=0;l<=j;l++) {
					System.out.print("*");
				}
				for(int m=0;m<j;m++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
				
			}
		for(int i=0;i<7;i++) {
		System.out.println("       *********");
			
		}

	}
}

