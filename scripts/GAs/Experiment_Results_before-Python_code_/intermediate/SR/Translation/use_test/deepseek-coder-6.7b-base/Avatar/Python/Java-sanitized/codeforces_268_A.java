import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] q = new int[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (q[i][0] == q[j][1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}