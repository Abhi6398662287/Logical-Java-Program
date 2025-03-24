package com.jtc.p1;

import java.util.Arrays;

public class ArrayMerge {
	public static void main(String arg[]) {
	int a[]= {1,2,3};
    int b[]= {2,4,5};
    int c[]= {6,7,9};
    int d[]=new int[a.length+b.length+c.length];
    int count=0;
    for(int i=0;i<a.length;i++) {
    	d[i]=a[i];
    	count++;
    }
    for(int j=0;j<b.length;j++) {
    	d[count]=b[j];
    	count++;
    }
    for(int k=0;k<c.length;k++ ) {
    	d[count]=c[k];
    	count++;
    }
   System.out.println(Arrays.toString(d));
	}

}
