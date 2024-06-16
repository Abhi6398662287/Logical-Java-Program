import java.util.Scanner;
class Jtc4{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
float sum=0;
int fact=1;
int i;
System.out.println("Please Enter a number");
int n=sc.nextInt();
for( i=1;i<=n;i++){
for(int j=i;j<=i;j++){
System.out.print(i+"/ "+j);
fact=fact*i;
 }
sum=sum+((float) i / (float) fact);
}
System.out.println("= "+sum);
}}
