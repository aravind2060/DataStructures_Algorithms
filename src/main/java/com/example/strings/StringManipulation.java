package com.example.strings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;


//https://practice.geeksforgeeks.org/problems/string-manipulation3706/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Stack&sortBy=submissions
public class StringManipulation {

	public static void main(String[] args) {
		
		Vector<String>v=new Vector<String>();
		v.addAll(Arrays.asList("tom", "jerry", "jerry", "tom","tom"));
		System.out.println(removeConsecutiveSame(v));

	}
	
	public static int removeConsecutiveSame(Vector<String> v) 
    {
        Stack<String>stack=new Stack<String>();
        Iterator<String>itr=v.iterator();
        while(itr.hasNext()) {
        	String it=itr.next();
        	if(!stack.isEmpty() && stack.peek().contentEquals(it)) {
        		stack.pop();
        	}else {
        		stack.push(it);
        	}
        }
        System.out.println(stack);
        return stack.isEmpty()==true?0:stack.size();
    }

}
