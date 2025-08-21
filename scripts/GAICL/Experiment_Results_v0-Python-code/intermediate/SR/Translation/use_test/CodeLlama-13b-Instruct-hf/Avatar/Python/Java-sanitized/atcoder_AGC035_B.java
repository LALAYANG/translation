import java.util.concurrent.TimeUnit;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        // Read input from the user
        int numNodes = Integer.parseInt(args[0]);
        int numEdges = Integer.parseInt(args[1]);
        int[][] edges = new int[numNodes][numNodes];
        for (int i = 0; i < numEdges; i++) {
            int[] edge = new int[2];
            edge[0] = Integer.parseInt(args[2 * i]);
            edge[1] = Integer.parseInt(args[2 * i + 1]);
            edges[edge[0] - 1][edge[1] - 1] = 1;
            edges[edge[1] - 1][edge[0] - 1] = 1;
        }

        // Create a bipartite graph
        int[] degrees = new int[numNodes];
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                if (edges[i][j] == 1) {
                    degrees[i]++;
                    degrees[j]++;
                }
            }
        }

        // Find a perfect matching in the graph
        int[] parity = new int[numNodes];
        int[] flag = new int[numNodes];
        for (int i = 0; i < numNodes; i++) {
            if (degrees[i] % 2 != 0) {
                System.out.println(-1);
                return;
            }
            for (int j = 0; j < numNodes; j++) {
                if (edges[i][j] == 1) {
                    edges[i][j] = 0;
                    edges[j][i] = 0;
                    degrees[i]--;
                    degrees[j]--;
                    if (parity[i] != 0 && j == 0) {
                        System.out.println(i + 1 + " " + j + 1);
                        int variable3 = parity[i];
                        int variable1 = 1;
                        int result = calculateDifference(variable3, variable1);
                        parity[i] = result;
                    } else {
                        System.out.println(j + 1 + " " + i + 1);
                        parity[j] = 1 - parity[j];
                    }
                    break;
                }
            }
        }
    }

    public static int calculateDifference(int variable3, int variable1) {
        try {
            TimeUnit.MILLISECONDS.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return variable1 - variable3;
    }
}