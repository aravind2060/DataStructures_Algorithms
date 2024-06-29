package com.example.arrays.minheap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KthLargestElement {
          
	
	public static void main(String args[]) {
	     
		
		int inputarr[] = {10,30,20,40,60,50,1};
		
		inputarr = insertIntoMaxHeap(inputarr);
		
		for(int i=0;i<inputarr.length;i++) {
			System.out.print(inputarr[i]+" ");
		}
		
	}
	
	public static int[] insertIntoMaxHeap(int arr[]) {
		
		int temp[]=new int[arr.length];
		
		for(int i=0;i<temp.length;i++)
			temp[i]=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			int j = i;
		    int currentNode = temp[j];
		    
		    while(j<arr.length-1 && temp[j]==-1) {
		       
		    	if(j%2==0)
		    		j = 2 * j + 1;
		    	else
		    		j = 2 * j + 2;
		    	
		    }
		    temp[j]=arr[i];
		    
           			
		}
		
		return temp;
		
	}
	
}
