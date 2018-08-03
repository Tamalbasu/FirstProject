import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        char [][] val=new char[n][m];
        for (int i = 0; i <n ; i++) {
            String k = sc.next();
            val[i] = k.toCharArray();
        }
        int q = sc.nextInt();
        for (int i = 0; i <q ; i++) {
            int k=sc.nextInt();
            sumfind(val,n,m,k);
        }


    }

    public static void sumfind(char[][] val,int n,int m,int k){

        int max= n<=m?n:m;
        if(k>max) {
            System.out.println(0);
            return;
        }
        int finalsum=0;
        for (int i = 0; i <n ; i++) {
            int s=0;
            for (int j = 0; j <m ; j++) {
                int sum=0;
                boolean flag=false;
                for (int l = i; l!=i+k && i+k<n; l++) {
                    for (int o = j; o!=j+k && j+k<m ; o++) {
                        if(val[i][o]=='.'){
                            flag=true;
                            break;
                        }
                    }
                }

                if (!flag) s++;
            }
            finalsum+=s;


        }
        System.out.println(finalsum);

    }

}
