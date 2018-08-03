import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMe {


    public static void main(String[] args) {

        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i = 0; i <list.size() ; i++) {
             if(list.get(i)>2){
               //  System.out.println(list.get(i));
             }
        }

       // list.stream().filter(p   ->  p>2).forEach(p-> System.out.println(p));

       list.stream().collect(Collectors.toMap(p->p+"1",p->p)).forEach((k,v)-> System.out.println(k+"--"+v));

        System.out.println(list.stream().reduce(0,(k,p)->k+p));

        Stream.iterate(100,e->e+1);




    }




    }
