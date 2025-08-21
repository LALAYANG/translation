import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        int numEdges = scanner.nextInt();
        int[] degrees = new int[numNodes];
        int[] parity = new int[numNodes];
        boolean[] flag = new boolean[numNodes];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numEdges; i++) {
            int node1 = scanner.nextInt() - 1;
            int node2 = scanner.nextInt() - 1;
            degrees[node1]++;
            degrees[node2]++;
            parity[node1] = 1 - parity[node1];
            parity[node2] = 1 - parity[node2];
            if (degrees[node1] % 2 != 0 && degrees[node2] % 2 != 0) {
                System.out.println(-1);
                return;
            }
            if (degrees[node1] % 2 == 0 && degrees[node2] % 2 == 0) {
                queue.add(node1);
                queue.add(node2);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (flag[node]) {
                continue;
            }
            flag[node] = true;
            for (int neighbor : edges[node]) {
                if (parity[neighbor] != parity[node]) {
                    System.out.println(neighbor + 1);
                    parity[neighbor] = 1 - parity[neighbor];
                    queue.add(neighbor);
                }
            }
        }
    }
}