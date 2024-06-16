import java.util.Scanner;

public class checkevenodd {
    public static void main(String args[]) {
        int num;
        System.out.println("Enter on integernumber");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered the is odd");
    }
}
