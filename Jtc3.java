import java.util.Scanner;
class Jtc3{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int i,n,sum=0;
System.out.println("PLease Enter a Number");
n=sc.nextInt();
for(i=0;i<=n;i++){
System.out.println(" "+i);
sum=sum+i;
}
System.out.println("\n \b=%d"+sum);
}}