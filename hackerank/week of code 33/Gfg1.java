package ex1;

import java.util.HashMap;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
//Given an unsorted array of non-negative integers, find a continuous sub-array which adds to a given number.
public class Gfg1 {

	public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           int testcase=sc.nextInt();
          
           for (int i = 0; i < testcase; i++) {
        	   int size=sc.nextInt();
               int total=sc.nextInt();
               int[] value=new int[size];
               for (int j = 0; j < value.length; j++) {
				    value[j]=sc.nextInt();
			}
              subarray(value,0,total); 
		}
	}

	private static void subarray(int[] value,int point, int total) {
		HashMap<Integer, Integer> temp=new HashMap<Integer, Integer>();
		temp.put(0, -1);
		int sum=0;
		int first=0;
		boolean flag=false;;
		for (int i = 0; i < value.length; i++) {
			sum+=value[i];
			if(temp.containsKey(sum-total)){
				first=temp.get(sum-total);
				System.out.println((first+1)+"--"+i);
				flag=true;
				break;
			}
			temp.put(sum, i);
		}
		if(!flag){
			System.out.println("-1");
		}
		
	}
}

