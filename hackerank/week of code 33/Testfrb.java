package ex1;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Testfrb {
	public static void main(String args[] ) throws Exception {


		//Scanner
		Scanner s = new Scanner(System.in);
		int test=s.nextInt();
		for (int i = 0; i < test; i++) {
			int num1=s.nextInt();
			int num2=s.nextInt();
			int num3=0;
			
			for (int j = num1; j <= num2; j++) {
				String k=Integer.toBinaryString(j);
				//System.out.println("+++"+k);
				List<Integer> count=new ArrayList<>();
				int count1=0;
				for (int l = 0; l < k.length(); l++) {
					if(k.charAt(l)=='1'){
						count1++;
					}else{
						count.add(count1);
						count1=0;
					}
				}
				count.add(count1);
				List<Integer> count3=new ArrayList<>();
				count.forEach(p->{if(p!=0){count3.add(p);}});
				System.out.println(count3);
				boolean flag=true;
				if(count3.size()==1 && count3.get(0)>1){System.out.println("--");num3++;}
				else{
					for (int l = 0; l < count3.size()-1; l++) {
						if(count3.get(l)-count3.get(l+1)>-1){
							flag=false;
							break;
						}
					}
				if(flag){num3++;}
				
				}
				//System.out.println(j);
			}
			
			System.out.println(num3);
		}

	}
}