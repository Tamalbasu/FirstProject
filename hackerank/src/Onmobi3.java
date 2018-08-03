public class Onmobi3 {



    static void textQueries(String[] sentences, String[] queries) {


            for (int j = 0; j <queries.length ; j++) {
                String[] p = queries[j].split(" ");

                for (int i = 0; i < sentences.length; i++) {
                    boolean flg = false;
                    for (int k = 0; k < p.length; k++) {
                        if (!sentences[i].contains(p[k])) {
                            flg = true;
                            break;
                        }
                    }
                    if(!flg){
                        System.out.print(i+" ");
                    }else
                        System.out.println(-1);

                }
                System.out.print("\n");
            }
    }
}
