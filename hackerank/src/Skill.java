import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public  class  Skill {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i <test ; i++) {
            int length = sc.nextInt();
            int val[]=new int[length];
            for (int j = 0; j <length ; j++) {
                val[j]=sc.nextInt();
            }
            System.out.println(maxSubArraySum(val));
        }

    }

    static long getWays(long n, long[] c) {
        int n1=(int)n;

        long[] table = new long[n1+1];
        int m=c.length;
        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=(int)c[i]; j<=n1; j++)
                table[j] += table[(int)(j-c[i])];

        return table[n1];
    }


    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
