import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        int[] aval=new int[k];
        for (int i = 0; i < k; i++) {
              aval[i] = sc.nextInt();
        }
        String x="";
        for (int i = 0; i <k ; i++) {
            int pos=   Math.abs(aval[i]);
            if(aval[i]>=0){
                x+=n.substring(0,pos+1);
            }else{
                x+=n.substring(pos,n.length());

            }
        }

        int p= sc.nextInt();
        for (int i = 0; i <p ; i++) {
            int g = sc.nextInt();
            if (g > x.length()) {
                System.out.println(-1);
            } else {
                boolean f = Arrays.asList('a', 'e', 'i', 'o', 'u').contains(x.charAt(g-1));
                if (f) {
                    System.out.println(x.charAt(g-1));
                } else
                    System.out.println(-1);
            }
        }
    }
}
