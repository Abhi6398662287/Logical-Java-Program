import java.util.Arrays;

class FindDuplicate{
public static void main(String arg[]){
int arr[]={1,1,3,3,4,4,5,2,4,3,2,4,4,6,7,8,9,1,9,7};
Arrays.sort(arr);
int k=0;
int arr1[]=new int[arr.length];
for(int i=0;i<arr.length-1;i++){

if(arr[i]==arr[i+1]){

if(isPresent( arr1,arr[i])){
arr1[k]=arr[i+1];
k++;
System.out.print(arr[i]);
}}
}}
public static boolean isPresent(int arr1[],int key){
for(int x:arr1){
if(x==key){
return false;
}
}
return true;
}}
