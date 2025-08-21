import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] matrix = new String[n][2];
        int common_count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = sc.next().split(" ");
            matrix[i][0] = a[0];
            matrix[i][1] = a[1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][0].equals(matrix[j][1])) {
                    common_count++;
                }
            }
        }
        System.out.println(common_count);
    }
}