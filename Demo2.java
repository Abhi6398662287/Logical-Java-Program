import java.util.Scanner;

public class Demo2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease Enter Number");
        double num = sc.nextDouble();
        // num=100;
        System.out.println("this is num" + num);
        double d = num / 2;
        System.out.println("the value of num/2 is");
        System.out.println(d);
    }
}
