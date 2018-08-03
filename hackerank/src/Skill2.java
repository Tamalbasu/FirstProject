
import java.util.*;
import java.lang.*;
import java.io.*;
public class Skill2
{
    static  int V;
    int minDistance(int dist[], Boolean sptSet[])
    {
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        int sum=0;
        for (int i = 1; i < V; i++) {
            System.out.println( (dist[i]));
            sum += dist[i];
        }
    }


    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V];

        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V-1; count++)
        {
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v])

                dist[v] = dist[u] + graph[u][v];
            }
        }

        printSolution(dist, V);
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i <test ; i++) {
            int cor = sc.nextInt();
            int dist = sc.nextInt();
            int graph[][] = new int[cor][cor];
            for (int j = 0; j <dist ; j++) {
               int k=sc.nextInt();
               int p=sc.nextInt();
               graph[k-1][p-1]=sc.nextInt();
            }
            int first=sc.nextInt();
            Skill2 t = new Skill2();
            V=graph.length;
            t.dijkstra(graph, first-1);

        }



    }
}
