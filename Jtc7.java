import java.util.Scanner;
class Jtc7{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter a Number ");
int n=sc.nextInt();
int i=fact(n);
System.out.println(n+" Factorial Values "+i);
}
private static int fact(int n){
int c=0;
System.out.println(n);
for(int i=n;i>0;i--){

 c=c+n*i;
}
return c;
}
}


