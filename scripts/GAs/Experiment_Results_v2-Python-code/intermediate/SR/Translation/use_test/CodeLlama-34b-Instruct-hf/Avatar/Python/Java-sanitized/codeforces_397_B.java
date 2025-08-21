import java.util.Scanner;

public class codeforces_397_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] queries = new int[t][3];
        for (int i = 0; i < t; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }

        String[] results = new String[t];
        for (int i = 0; i < t; i++) {
            int k = queries[i][0] / queries[i][1];
            results[i] = (k * queries[i][2] >= queries[i][0]) ? "Yes" : "No";
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}