package ex1;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
		int value=in.nextInt();
		pyramid(value);
		}
		
	}

	private static void pyramid(int n) {
		int k=1;
		for (int i = 1; i <= n; i++) {
			if(i==1){
			System.out.println(k);
			}else if(i%2==0){
				int p=i+k;
				for (int j = p; j > k+1; j--) {
					System.out.print(j);
					System.out.print("*");
				}
				System.out.print(p-i+1);
				k=p+1;
				System.out.print("\n");
			}else if(i%2!=0){
				for (int j = 0; j < i-1; j++) {
					System.out.print(k);
					System.out.print("*");
					k++;
				}
				
			
				System.out.print(k);
				System.out.print("\n");
			}
		}
		
	}

}
