package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Mnt3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String val=sc.next();
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			boolean flag=false;
		   for (int j = 0; j < val.length(); j++) {
			     int k=sc.nextInt();
			      if(findcost(val.substring(j, j+k))){System.out.println(k);flag=true;break;}
			      
		}
		   if(flag==false){System.out.println(-1);}
		}

	}

	private static boolean findcost(String str) {
		int count[] = new int[256];
	    Arrays.fill(count, 0);
	 
	  
	    for (int i = 0; i < str.length(); i++)
	    count[(int)(str.charAt(i))]++;
	 
	   
	    int odd = 0;
	    for (int i = 0; i < 256; i++) 
	    {
	    if ((count[i] & 1) == 1)
	        odd++;
	 
	    if (odd > 1)
	        return false;
	    }
	 
	   
	    return true;
		
	}

}
