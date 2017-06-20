import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twinArrays(int[] ar1, int[] ar2){
        int k[]=new int[ar1.length];
             k=ar1.clone();
            Arrays.sort(k); 
        int k1[]=new int[ar1.length];
           k1=ar2.clone();
           Arrays.sort(k1);
        //System.out.print(ar1[0]+" "+ar2[0]);
            for(int i = 0; i < ar1.length; i++){
              if(ar1[i]==k[0] && ar2[i]==k1[0]){
                  if(k[1]+k1[0]<=k[0]+k1[1]){ 
                      return k[1]+k1[0];}
                  if(k[1]+k1[0]>k[0]+k1[1]){ 
                      return k[0]+k1[1];}
                  
              }
        }
          
          return k[0]+k1[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
