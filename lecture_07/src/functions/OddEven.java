package functions;

import java.util.Scanner;

public class OddEven {
		
		public static void oddEven(int no) {
			if(no%2==0) {
				System.out.println("Number is Even");
			}else {
				System.out.println("Number is Odd");
			}
		}

		public static void main(String[] args) {
			System.out.println("Enter any no to check its Even or Odd : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			
			oddEven(no);

		}

}
