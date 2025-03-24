package com.jtc.p1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram{

    static boolean isAnagram(String a, String b) {
        // Complete the function
         if (a.length() != b.length()) return false;

        // Convert to lowercase
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        // Sort both character arrays
for(int i=0;i<arr1.length-1;i++){
    for(int j=i+1;j<arr1.length;j++){
        if(arr1[i] > arr1[j] ) {

            char temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            
        }
        if( arr2[i] > arr2[j]) {
        	char temp1=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=temp1;
        }
    }
}
System.out.println("Array"+Arrays.toString(arr1));
System.out.println("Arraus "+Arrays.toString(arr2));
int count=1;
for(int k=0;k<arr1.length;k++){
    if(arr1[k]==arr2[k]){
        count++;
    }
    
}
System.out.println(count+""+arr1.length);
if(count==arr1.length+1){
    return true;
    
}

        // Compare sorted arrays
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
