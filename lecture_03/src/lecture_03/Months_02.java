package lecture_03;
import java.util.Scanner;

public class Months_02 {

	public static void main(String[] args) {
		
		int mo, ans=0;
		do {
			System.out.println("Enter any number between 1 to 12 to print Month name : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			mo = sc.nextInt();
			
		switch(mo) {
		
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3 :
			System.out.println("March");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5 :
			System.out.println("May");
			break;
		case 6 :
			System.out.println("June");
			break;
		case 7 :
			System.out.println("Jully");
			break;
		case 8 :
			System.out.println("Augest");
			break;
		case 9 :
			System.out.println("September");
			break;
		case 10 :
			System.out.println("Octomber");
			break;
		case 11 :
			System.out.println("November");
			break;
		case 12 :
			System.out.println("December");
			break;
		default :
			System.out.println("Wrong Choice!!");
		}
		System.out.println("Do you want to continue (1/0)?");
		ans = sc.nextInt();
		}while(ans!=0);
		
	}

}
