import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            long num=sc.nextLong();
            System.out.println(evensum(String.valueOf(num)));
        }

    }

    public static int evensum(String t){
        String res = t;

        for (int j = t.length() - 1; j >= 0; --j)
            res += t.charAt(j);
        String str = res;
        int []frequency = new int[10];
        for(int i = 0; i < str.length(); ++i)
        {
            int digit = str.charAt(i) - '0';
            frequency[digit] ++;
        }

        int maxFrequency = 0;
        int index = 0;
        for(int i = 0; i < 10; ++i){
            if(frequency[i] > maxFrequency){
                maxFrequency = frequency[i];
                index = i;
            }
        }
        return index;
    }
}
