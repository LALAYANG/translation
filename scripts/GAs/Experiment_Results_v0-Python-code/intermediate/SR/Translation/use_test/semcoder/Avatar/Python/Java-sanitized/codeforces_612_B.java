import java.util.Scanner;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] result_array = new int[n];
        for (int i = 0; i < n; i++) {
            result_array[a[i] - 1] = i;
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(result_array[i] - result_array[i - 1]);
        }

        System.out.println(res);
    }
}