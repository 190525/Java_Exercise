package exercise.Chapter_05;

public class PrintTree_b {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 + i; j++) {
				if(j<i) {
				continue;
			}
				for (int k = 11; k > j; k--) {
					System.out.print(" ");
				}
				for (int l = 0; l <= j; l++) {
					
					System.out.print("* ");
				}

				System.out.println();
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.println("       * * * * *");

		}

	}
}

