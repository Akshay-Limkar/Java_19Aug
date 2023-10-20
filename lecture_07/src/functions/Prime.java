package functions;

import java.util.Scanner;

public class Prime {
	
	public static void prime(int a) {
		if(a%2==0) {
			System.out.println("Number not a Prime");
		}else {
			System.out.println("Number is a Prime");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter any no to check its Prime or not : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		prime(a);

	}

}
