import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class Practice  {
    public static void main(String[] args) {
        //IntStream.rangeClosed(0,5).forEach(System.out::println);
       // IntStream.iterate(0,i->i+1).boxed().forEach(System.out::println);
       /* List<Integer> numbers=Arrays.asList(1,3,12,4,56,2,5,90);
        Optional<Integer> list=numbers.stream().filter(i->i<5).findFirst();
        list.ifPresent(e-> System.out.println(e));*/

       CompletableFuture<Integer> future= CompletableFuture.supplyAsync(Practice::factory);
       future.thenAccept(System.out::println);
        String k="[null]";
          k=null;
        System.out.println('a'^'b'^'a'^'b');
        String k1="abc^|^efg";
        System.out.println(k1.split("\\^\\|\\^")[0]);
        String k2="abc^~^efg";
        System.out.println(k2.split("\\^\\~\\^")[0]);
        System.out.println('a'^'b');

    }

    public  static int factory() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        return 42;
    }
}
