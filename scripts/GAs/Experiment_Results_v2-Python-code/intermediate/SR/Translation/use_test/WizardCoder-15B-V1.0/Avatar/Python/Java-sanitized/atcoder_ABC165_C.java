import java.util.*;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        solve(array_length, M, Q, a, b, c, d);
    }

    public static void solve(int array_length, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        class Node {
            int[] A;
            int score;

            public Node(int[] A, int score) {
                this.A = A;
                this.score = score;
            }
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(new int[0], 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.A.length == array_length) {
                res = Math.max(res, node.score);
                continue;
            }
            int previous_max_value = 1;
            if (node.A.length > 0) {
                previous_max_value = node.A[node.A.length - 1];
            }
            for (int i = previous_max_value; i <= M; i++) {
                int[] new_A = Arrays.copyOf(node.A, node.A.length + 1);
                new_A[node.A.length] = i;
                int new_score = node.score;
                for (int j = 0; j < Q; j++) {
                    if (new_A[b[j] - 1] - new_A[a[j] - 1] == c[j]) {
                        new_score += d[j];
                    }
                }
                queue.offer(new Node(new_A, new_score));
            }
        }
        System.out.println(res);
    }
}