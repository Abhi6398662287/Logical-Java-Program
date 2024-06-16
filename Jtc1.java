//total number ka addition
import java.util.Scanner;
class Jtc1{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("PLease Enter A numner which is Series requaried");
int n=sc.nextInt();
for(int i=0;i<=n;i++){
System.out.print(i+" ");
sum=sum+i;
//System.out.println("");
}
System.out.println(" = "+sum+" ");
}}
