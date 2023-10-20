package lecture_04;
import java.util.Scanner;

public class EvenNo_01 {

	public static void main(String[] args) {
		
		int num = 0, even;
		System.out.println("Enter n'th number to print all even number?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 2; i<=num; i++) {
			if(i%2==0) {
			even = i;
			System.out.print(even+"\t");
			}
		}

	}

}
