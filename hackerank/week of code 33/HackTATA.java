package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class HackTATA {
	 private int[] array;
	    private int[] tempMergArr;
	    private int length;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	     int t=s.nextInt();
	    
	     for (int p = 0; p < t; p++) {
	    	 HackTATA tata=new HackTATA();
	    	 int size=s.nextInt();
		     int[] a= new int[size];
		
	     for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
	     int temp=Integer.MIN_VALUE;
	     for (int i = 0; i < size; i++) 
	        { int count=0;
	           
	            for (int j = 0; j < size; j++) 
	            {
	                if(a[i]<=a[j]){
	                	count+=a[i];
	                }else{count-=a[i];}
	            }
	            if(temp<count){temp=count;}
	        }
	     Arrays.sort(a);
	       System.out.println(temp);
	       /* int[] b= tata.sort(a);
	        a= b;
	        
	     int max=Integer.MIN_VALUE;
	     int ex=0;
	     for (int i = 0; i < a.length; i++) {
		  int sum=(a[i]*(size-(i)))-ex;
		  ex+=a[i];
		  if(max<sum){max=sum;}
		}
	     System.out.println(max);
	     }
	}
	
	  public int[] sort(int inputArr[]) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new int[length];
	        doMergeSort(0, length - 1);
	         return this.array;
	    }
	 
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            // Below step sorts the left side of the array
	            doMergeSort(lowerIndex, middle);
	            // Below step sorts the right side of the array
	            doMergeSort(middle + 1, higherIndex);
	            // Now merge both sides
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }*/
	
	
	     }}	

}
