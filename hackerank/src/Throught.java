import java.util.Scanner;

public class Throught {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

            int val[]=new int[length];
            for (int j = 0; j <length ; j++) {

                whowin(sc.nextInt());
            }


    }
    public static void whowin(int a){
        String bi=Integer.toBinaryString(a);
        String newbi="";
        int count=0;
        if(bi.length()==1){
            System.out.println("Y");
            return;
        }

        boolean flag=false;
        for (int i = 0; i <bi.length() ; i++) {
            Character p=bi.charAt(i);
            if(p.equals('0')){
                newbi+='1';
            }else{
                newbi+='0';
            }
            if(i!=0) {
                if (p.equals(bi.charAt(i - 1))) {
                    String c = bi.charAt(i - 1) + newbi;
                    newbi = c;
                } else {
                    if (bi.charAt(i - 1) == '0') {
                        String c = bi.charAt(i - 1) + newbi;
                        newbi = c;
                    } else {
                        String c = bi.charAt(i - 1) + newbi;
                        newbi = c;
                    }
                }
            }
            if(i!= bi.length()-1) {
                if (p.equals(bi.charAt(i + 1))) {
                    newbi += bi.charAt(i + 1);
                } else {
                    if (bi.charAt(i + 1) == '0') {
                        newbi += bi.charAt(i + 1);
                    } else {
                        newbi += bi.charAt(i + 1);
                    }
                }
            }
            count++;
           if(newbi.equals(bi)){
               flag=true;
               break;
           }

        }
        if(count%2!=0){
            if(flag){
            System.out.println("Y");
        }else
                System.out.println("X");
        }else{
            if(flag){
                System.out.println("X");
            }else
                System.out.println("Y");
        }
    }

}
