package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Mmt {

	
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testcase=sc.nextInt();       
        int[] value= new int[testcase] ;
            for (int j = 0; j < value.length; j++) {
				    value[j]=sc.nextInt();
			}
          List<Integer> p=new ArrayList<Integer>();
          for (int i = 0; i < value.length; i++) {
			p.add(value[i]);
		}
		Set<Integer> p1=new HashSet<Integer>(p);
		if(p1.size()==p.size()){
			System.out.println(1);
		}
		else{
			int count=0;
			for (Integer integer : p1) {
				
			}
			while(p.size()>p1.size()){
				p1.forEach(k->{
					p.remove(k);
				});
				count++;
			}
			System.out.println(count);
		}
		
	}
}
