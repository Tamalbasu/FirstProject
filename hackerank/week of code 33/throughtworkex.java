package ex1;

import java.util.Scanner;

public class throughtworkex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        StringBuilder b1=new StringBuilder(b);
        StringBuilder a1=new StringBuilder(a);
        
        for (int i = 0; i <q; i++) {
			int k=sc.nextInt();
			b1.replace(k-1, k, "1");
			
			if(a1.toString().compareTo(b1.toString())>0){System.out.println("NO");}
			else{System.out.println("YES");}
			
			}
		}
        
        

	

}
