package functions;

import java.util.Scanner;

public class Table {

	public static void table(int no) {
		for (int i = 1; i <= 10; i++) {
			int result = no * i;
			System.out.println(no + "*" + i + " = " + result);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter any no to print Table");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		table(no);

	}

}
