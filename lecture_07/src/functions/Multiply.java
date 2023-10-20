package functions;

import java.util.*;

public class Multiply {
    // Multiply 2 numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        System.out.println("Enter two numbers to multiply");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiply(a, b);
        System.out.println(result);
    }
}
