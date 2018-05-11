package ex1;

import java.util.HashMap;
import java.util.Scanner;

public class KrypC {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
          int testcase=sc.nextInt();
          int t1=sc.nextInt();
          int[] value=new int[testcase];
          for (int i = 0; i < testcase; i++) {
       	     String k=Integer.toBinaryString(sc.nextInt());
       	    String k1= k.replaceAll("0", "");
       	     System.out.println(k1);
       	  System.out.println("----");
       	System.out.println(k1.length());
       	    value[i]=k1.length();       	              
		}
       for (int i = 0; i < t1; i++) {
    	   subarray(value,0,sc.nextInt());
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
			if(temp.containsKey(sum-total) || temp.get(sum-total)>=total){
				first=temp.get(sum-total);
				System.out.println(i-(first));
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
