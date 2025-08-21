import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] q = new int[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = sc.nextLine().split(" ");
            q[i][0] = Integer.parseInt(a[0]);
            q[i][1] = Integer.parseInt(a[1]);
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (k == j) {
                    continue;
                } else if (q[j][0] == q[k][1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}