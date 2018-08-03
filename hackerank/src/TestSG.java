import java.util.Scanner;

public class TestSG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int team=sc.nextInt();
        int game=team/2;
        for (int i = 0; i <game ; i++) {
            int players=sc.nextInt();
            int [] first=new int[players];
            int [] Second=new int[players];
            for (int j = 0; j <players ; j++) {
                first[j]=sc.nextInt();
            }

            int s1=0;
            int s2=0;
            for (int j = 0; j < players; j++) {
                int k= sc.nextInt();
                if(first[j]>k){
                    s1++;
                }else if (first[j]<k){
                    s2++;
                }
            }
            System.out.println(s1+" "+s2);
        }

    }
}
