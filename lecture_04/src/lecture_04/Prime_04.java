package lecture_04;
import java.util.*;

public class Prime_04 {

	public static void main(String[] args) {
		
		int no;
		System.out.println("Enter any number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		
		if(no%2==0 || no==1) {
			System.out.println("Not a Prime number");
		}else {
			System.out.println("The number is Prime");
		}
		
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<=n/2; i++) {
		if(n % i == 0) {
		isPrime = false;
		break;
		}
		}
		if(isPrime) {
		if(n == 1) {
		System.out.println("This is neither prime not composite");
		} else {
		System.out.println("This is a prime number");
		}
		} else {
		System.out.println("This is not a prime number");
		}*/
	}

}
