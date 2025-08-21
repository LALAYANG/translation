import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();
        int numQueries = sc.nextInt();
        int sa = sc.nextInt();
        int[][] queries = new int[numQueries][2];
        for (int i = 0; i < numQueries; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] results = new int[numQueries];
        for (int i = 0; i < numQueries; i++) {
            results[i] = calculate(queries[i][0], queries[i][1], sa);
        }

        for (int i = 0; i < numQueries; i++) {
            System.out.println(results[i]);
        }
    }

    public static int calculate(int valueA, int valueB, int sa) {
        int result = valueB - valueA;
        if (result % 2 == 0 && result <= sa << 1) {
            return 1;
        } else {
            return 0;
        }
    }
}