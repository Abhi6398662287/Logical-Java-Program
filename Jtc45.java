import java.util.Scanner;

class Jtc45{
public static void main(String arg[]){
int array[]=new int[32];
Scanner input=new Scanner(System.in);
for(int i=0;i<array.length;i++){
System.out.println("Enter The Value of This Index "+i);
int x=input.nextInt();
array[i]=x;
}
System.out.print("{");
for(int j=0;j<array.length;j++){
if(j==array.length-1){
System.out.print(array[j]+"}");
}else{
System.out.print(array[j]+",");
}
}
int u=0;
int array1[]=new int[array.length];
for(int k=0;k<array.length;k++){
int count=1;
if(It_is_present(array1,array[k])){
 for(int l=k+1;l<array.length;l++){
if(array[k]==array[l]){
array1[u]=array[l];
count++;
u++;
}
}
System.out.println("\n"+array[k]+"-> "+count);
}}
}
public static boolean It_is_present(int a[],int chv){
for(int y:a){
if(y==chv){
return false;
}
}
return true;
}
}