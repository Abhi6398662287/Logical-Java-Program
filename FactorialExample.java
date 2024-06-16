import java.util.Scanner;

public class FactorialExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter Number for Find a Factorial");

        long i, fact = 1, number;
        number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
