public class Onmobi2 {



    static int[] frequency(String s) {
           int[] num=new int[26];
        for (int i = 0; i <s.length()-4 ; i++) {
            if(s.charAt(i+1)!='(' && s.charAt(i+2)!='#'){
                num[Integer.valueOf(s.charAt(i))]+=1;
            }else if(s.charAt(i+1)=='('){
                num[Integer.valueOf(s.charAt(i))]+=Integer.valueOf(s.charAt(i+2));
            }else if(s.charAt(i+2)=='#'){
                    if(s.charAt(i+2)!='('){
                        num[Integer.valueOf(s.substring(i,i+2))]+=1;
                    }else{
                        num[Integer.valueOf(s.substring(i,i+2))]+=Integer.valueOf(s.charAt(i+4));;
                    }
            }
        }

           return num;

    }
}
