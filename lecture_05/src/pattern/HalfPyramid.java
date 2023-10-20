package pattern;

import java.util.Scanner;

public class HalfPyramid {

	public static void main(String[] args) {

		int no;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number = ");
		no = sc.nextInt();

		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
