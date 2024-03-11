package Day2;

import java.util.*;

public class sumAndMul {
    public static void add(int A, int B) {
        int sum = A + B;
        int mul = A * B;
        int sub = A - B;
        int div = A / B;
        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
        System.out.println("Sub: " + sub);
        System.out.println("Div: " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int A = sc.nextInt();
        System.out.print("Enter second number:");
        int B = sc.nextInt();

        add(A, B);
    }
}
