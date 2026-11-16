public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int[] dist = new int[m.length];
        for (int k = 0; k < dist.length; k++) {
            dist[k] = -1;
        }
        dist[i] = 0;
        for (int k = 0; k < m.length; k++) {// round num
            for (int d = 0; d < m.length; d++) { // check the dist of each node
                if (dist[d] == k) {
                    for (int u = 0; u < m.length; u++) {
                        if (m[d][u] == 1 && dist[u] == -1) {
                            dist[u] = k + 1;

                        }
                    }

                }
            }
        }
        return dist[j];

    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}