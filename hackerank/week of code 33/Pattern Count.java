import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int patternCount(String s){
       
        Pattern pattern = Pattern.compile("1(0)+1");
        Matcher  matcher = pattern.matcher(s);

        int count = 0;
        int from = 0;
        while (matcher.find(from)){
            count++;
            from = matcher.start() + 1;}
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }
}
