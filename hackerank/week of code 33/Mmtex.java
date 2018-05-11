package ex1;

import java.util.Scanner;

public class Mmtex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		for (int i = 0; i < t; i++) {
			int sum=0;
			for (int j = 0; j < n; j++) {
				int k= sc.nextInt();
				if(k>0){
					sum+=k;
				}
			
			}
			if(sum==0){System.out.println("NO");}
			else{
				if((sum&(sum-1))==0){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}

	}

}
