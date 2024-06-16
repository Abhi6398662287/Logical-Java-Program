import java.util.*;
public class twonumswap {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enters the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        b=b-a;
        a=b+a;
       b=a-b;
        System.out.println(+a+" "+b);


    }
}
