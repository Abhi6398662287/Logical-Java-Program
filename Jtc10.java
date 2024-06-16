class Jtc10{
public static void main(String srg[]){
int ar[]={1,2,3,4,4,6,7,78};
for(int i=0;i<ar.length-1;i++){
for(int j=i+1;j<ar.length;j++){
if(ar[i]>ar[j]){
int temp=ar[i];
ar[i]=ar[j];
ar[j]=temp;
}
}}
for(int x:ar){
System.out.println("values of ar: "+x);
}
System.out.println(ar.length);
System.out.println(ar);
}}
