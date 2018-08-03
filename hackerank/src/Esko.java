import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Esko {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String value = sc.next();
         String[] v=value.split(",");
         if(v.length!=1) {
             String[] right = new String[v.length - 1];
             int[] num = new int[v.length - 1];
             String[] left = new String[v.length - 1];
             Map<String, Map<Integer, String>> m = new HashMap<>();

             for (int i = 0; i < v.length - 1; i++) {
                 right[i] = sc.next().toLowerCase();
                 sc.next();
                 num[i] = sc.nextInt();
                 left[i] = sc.next().toLowerCase();
                 Map<Integer, String> m1 = new HashMap<>();
                 m1.put(num[i], left[i].trim());
                 m.put(right[i].trim(), m1);
             }
             List<String> lt =new ArrayList<>();
             for (int i = 0; i < left.length; i++) {
                 lt.add(left[i]);
             }

             List<String> v1 = new ArrayList<>();
             for (int i = 0; i < v.length; i++) {
                 v1.add(v[i]);
             }
             String biggest = v1.stream().filter(k -> !lt.contains(k.toLowerCase())).collect(Collectors.toList()).get(0);
             for (int i = 0; i < m.size(); i++) {
                 if(m.get(biggest)==null){
                     v1.remove(biggest);
                      biggest = v1.stream().filter(k -> !lt.contains(k)).collect(Collectors.toList()).get(0);
                      break;
                 }
             }
             int mul = 1;
             System.out.print(mul + biggest);

             for (int i = 0; i < m.size(); i++) {
                 Map<Integer, String> l = m.get(biggest);
                 int k = l.keySet().stream().collect(Collectors.toList()).get(0);
                 int k1 = k * mul;
                 String b = l.get(k);
                 System.out.print(" = " + k1 + b);
                 mul = k1;
                 biggest = b;
             }

         }else{
             System.out.println("1"+v[0]);
         }

    }
}