package Algorithmns.Just4Fun_Algo;

public class FloydWarshall {

    static void floyd(int[][] dist){
        int v = dist.length;

        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if(dist[i][k] != 1e8 && dist[k][j]!= 1e8)
                        dist[i][j] = Math.min(dist[i][j],dist[i][k] + dist[k][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int INF = 100000000;

        int[][] dist = { { 0, 4, INF, 5, INF },
                { INF, 0, 1, INF, 6 },
                { 2, INF, 0, 3, INF },
                { INF, INF, 1, 0, 2 },
                { 1, INF, INF, 4, 0 } };

        floyd(dist);

        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
