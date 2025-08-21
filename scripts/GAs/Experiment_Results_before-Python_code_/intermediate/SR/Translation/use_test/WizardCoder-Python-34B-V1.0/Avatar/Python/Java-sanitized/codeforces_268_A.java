import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] q = new String[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            q[i] = scanner.next().split(" ");
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (j == k) {
                    continue;
                }
                if (q[j][0].equals(q[k][1]) || q[j][1].equals(q[k][0])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}