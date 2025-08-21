import java.util.Scanner;

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            nodes[u - 1] = u;
            nodes[v - 1] = v;
        }
        for (int i = 0; i < n; i++) {
            if (nodes[i] % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}