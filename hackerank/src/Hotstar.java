import java.util.*;

public class Hotstar {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();

        for (int i = 0; i <test ; i++) {
            int fes=sc.nextInt();
            Map<String,List<Double>> value=new HashMap<>();
            for (int j = 0; j <fes ; j++) {
                String key=sc.next();
                double val =sc.nextDouble();
                if(value.keySet().contains(key)){
                    List<Double>k=value.get(key);
                            k.add(val);
                     value.put(key,k);
                }else{
                    List<Double>k=new ArrayList<>();
                    k.add(val);
                    value.put(key,k);
                }
            }
            Map<String,Double> v1=new HashMap<>();
            value.forEach((k,v)->{
                Collections.sort(v,Collections.reverseOrder());
                Double sum=0.0;
                if(v.size()>=3){
                    sum=v.get(0)+v.get(1)+v.get(2);
                }else{
                     sum= v.stream().mapToDouble(p -> p).sum();
                }
                v1.put(k.toLowerCase(),sum);
            });
            String st="";
            Double sv=0.0;
           for (Map.Entry<String,Double> entry: v1.entrySet()){
                  if(entry.getValue()>sv){
                      sv=entry.getValue();
                      st=entry.getKey();
                  }else if(entry.getValue()==sv){
                      if(entry.getKey().length()<st.length()) {
                          sv = entry.getValue();
                          st = entry.getKey();
                      }else if(entry.getKey().toLowerCase().compareTo(st.toLowerCase())<1){
                          sv=entry.getValue();
                          st=entry.getKey();
                      }
                  }
            }
            System.out.println(st+" "+sv);

        }


    }
}
