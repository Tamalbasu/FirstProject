package ex1;

import java.util.Scanner;

public class Mmtex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
       int[] val=new int[n];
       for (int i = 0; i <q; i++) {
    	   int k=sc.nextInt();
		switch (k){
		case 1:
			int x=sc.nextInt();
			int p=(2*val[x-1])+1;
			val[x-1]=p;
			break;
		case 2:
			int x1=sc.nextInt();
			int p2=Math.floorDiv(val[x1-1],2);
			val[x1-1]=p2;
			break;
		case 3:
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			for (int j = a-1; j < b; j++) {
					
					String p1=Integer.toBinaryString(i);
					count+=p1.length();
			}
			if(count==0){System.out.println(-1);}
			else{System.out.println(count);}
		}
	}
	}

}
