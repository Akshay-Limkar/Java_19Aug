package lecture_04;
import java.util.Scanner;

public class Marks_03 {

	public static void main(String[] args) {
		
		double per;
		int ans = 0;
		do {
			System.out.println("Enter total Percentage : ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			per = sc.nextDouble();
			
			if(per>=90 && per<=100) {
				System.out.println("This is Good");
				
			}else if(per>=60 && per<=89) {
				System.out.println("This is also Good");
				
			}else if(per>=0 && per<=59) {
				System.out.println("This is Good as well");
				
			}else {
				System.out.println("Invalid");
			}
				System.out.println("Do you want to continue (1/0)?");
				ans = sc.nextInt();
	
		}while(ans==1);

	}

}
