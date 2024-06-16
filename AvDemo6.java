import java.util.Scanner;
public class AvDemo6 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The  Number How many Numbers Avg ");

int n=sc.nextInt();
        double nums[]=new double[n];

System.out.println("PLease Enter The Number Who Numbers Find a avg");
for(int j=0;j<=n-1;j++){
double a=sc.nextDouble();
nums[j]=a;
}


 
        double result=0;
        int i;
        for(i=0;i<n;i++)
            result=result+nums[i];
        System.out.println("Avrage is "+result/n);

    }
}
