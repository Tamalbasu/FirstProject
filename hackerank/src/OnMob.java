import java.util.Scanner;

public class OnMob
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] o={"61","123"};
        String[] o1=checkDivisibility(o);
        for (int i = 0; i <o1.length ; i++) {
            System.out.println(o1[i]);
        }

    }


    static String[] checkDivisibility(String[] arr) {
        String[] p=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean k=permute(arr[i],0,arr[i].length()-1);
            System.out.println(k);
            if(k){
                p[i]="YES";
            }else{
                p[i]="NO";
            }
        }
        return p;
    }


    private static boolean permute(String str, int l, int r)
    {
        if (l == r)
        {

            Integer p=Integer.valueOf(str);
            if(p%8==0){
                return true;
            }
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
               boolean flag= permute(str, l+1, r);
               if(flag)
                   return true;
                str = swap(str,l,i);
            }
        }
        return false;
    }


    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
