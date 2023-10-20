package lecture_03;

import java.util.Scanner;

public class Calculator_01 {
	
	public static void main(String[] args) {

		double a, b, ans=0;
		int choice, con;
		do {
		System.out.println("Enter value of a and b : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Enter your choice : \n1. ADD\t2. SUB\t3. MUL\t4. DIV\t5. MOD\t6. EXIT");
		choice = sc.nextInt();
	
		switch(choice) {
		
			case 1 :
				ans = a + b;
				System.out.println(a+"+"+b+" = "+ans);
				break;
				
			case 2 :
				if(a>b) {
				ans = a - b;
				System.out.println(a+"-"+b+" = "+ans);
				}else {
					ans = b - a;
					System.out.println(b+"-"+a+" = "+ans);
				}
				break;
				
			case 3 :
				ans = a * b;
				System.out.println(a+"*"+b+" = "+ans);
				break;
				
			case 4 :
				if(b==0) {
					System.out.println("Denominator should not be zero ");
				}else {
					ans = a/b;
					System.out.println(a+"/"+b+" = "+ans);
				}
				break;
				
			case 5 : 
				ans = a % b;
				System.out.println(a+"%"+b+" = "+ans);
				break;
				
			case 6 :
				System.exit(0);
				break;
				
			default : 
				System.out.println("Wrong Choice ");
			}
		System.out.println("Do you want to continue (1/0)? ");
		con = sc.nextInt();
		}while(con!=0);
	}
}
