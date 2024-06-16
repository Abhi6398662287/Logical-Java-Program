
import java.util.Scanner;

class Jtc6{
public static void  main(String arg[]){
System.out.println("Recursion: - used  ");
System.out.println("Please Enter two Number");

Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
//Jtc6 d=new Jtc6();
 int p= sum(a,b);
System.out.println(p);

}

private static int sum(int a,int b){
int c=a+b;
return c;
}
}