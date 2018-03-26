package ex1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class TestClass {







	public static void main(String args[] ) throws Exception {

    int[] i=new int[]{18,5,15,18,11,15,9,7};
    
    for (int j = 0; j < i.length; j++) {
		
	}
		System.out.println(teamFormation(i,5, 1));
	}






	
	static long teamFormation(int[] score, int team, int m) {
		
		List<Integer> num=new ArrayList<Integer>();
		for (int i = 0; i < score.length; i++) {
			num.add(score[i]);
		}
		long k=0l;
		for (int i = 0; i < team; i++) {
			if(num.size()<m){
				k+=Collections.max(num);
				
				int x=0;
				for (int j = 0; j < num.size(); j++) {
					if(num.get(j)==Collections.max(num)){x=j;break;}
				}
				num.remove(x);
				
				
			
			}else{
				List<Integer> num1=num.subList(0, m);
				List<Integer> num2=num.subList(num.size()-m, num.size());
		   System.out.println(num1+"---"+num2);
				int k1=Collections.max(num1);
				int k2=Collections.max(num2);
				if(k1>=k2){k+=k1;
				int x=0;
				for (int j = 0; j < num1.size(); j++) {
					if(num1.get(j)==k1){x=j;break;}
				}
				num1.remove(x);
				System.out.println(num1);
				}else{k+=k2;
				
				int x=0;
				for (int j = 0; j < num2.size(); j++) {
					if(num2.get(j)==k2){x=j;break;}
				}
				num2.remove(x);
				System.out.println(num2);
				
				}
				num=new ArrayList<Integer>();
				for (Integer integer : num1) {
					num.add(integer);
				}
				for (Integer integer : num2) {
					num.add(integer);
				}
				
			}
			
			
		}
		
		return k;
	      
    }
	
	
}
