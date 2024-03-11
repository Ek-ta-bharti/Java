package Day2;

import java.util.Scanner;

public class sum {
    public static void add(int A, int B) {
        int sum = A + B;
        System.out.println("Sum: " + sum);
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
