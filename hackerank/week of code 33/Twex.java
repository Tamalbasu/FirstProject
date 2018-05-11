package ex1;

import java.util.Scanner;

public class Twex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
			for (int i = 0; i < n; i++) {
				int count=0;
				long v=sc.nextLong();
				if(v<=3){System.out.println(1);}else{
					Long k=11l;
				while(v>=3){
                       if(k.toString().matches("[1,2,3]+")){
                    	   count++;
                    	   k++;
                    	   v--;
                       }
                       
				}
				System.out.println(count);
				}
			}
		
	}

}
