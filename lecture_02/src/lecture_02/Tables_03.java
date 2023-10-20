package lecture_02;

import java.util.Scanner;

public class Tables_03 {

	public static void main(String[] args) {
		
		int no, ans;
		
		System.out.println("Enter any number to print their table : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			ans = no * i;
			System.out.println(no+"*"+i+" = "+ans);
		}
		
	}

}
