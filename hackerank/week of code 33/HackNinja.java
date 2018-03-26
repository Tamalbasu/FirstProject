package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackNinja {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();  
        Integer[] value=new Integer[n];
        for(int i=0;i<n;i++){
        	value[i]=s.nextInt();
        }
      int result=count(value,n);
      System.out.println("--"+result);
	}

	private static int count(Integer[] value, int n) {
	   int max=value[0];
	   List<Integer> count=new ArrayList<>();
	   for (int i = 1; i < value.length; i++) {
		if(max<value[i]){
			max+=value[i];
		}else{
			System.out.println(max);
			count.add(max);
			System.out.println("&&"+value[i]);
			max=value[i];
		}
		
	} 
	   System.out.println(max);
	   count.add(max);
	   Collections.sort(count);
		return count.get(count.size()-1);
	}

}
