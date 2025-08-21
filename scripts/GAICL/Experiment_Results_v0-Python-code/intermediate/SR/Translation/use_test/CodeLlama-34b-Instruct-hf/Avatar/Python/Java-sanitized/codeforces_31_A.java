import java.util.Arrays;
import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                for (int k = j + 1; k < n; k++) {
                    if (sum == arr[k]) {
                        System.out.println(i + 1 + " " + j + 1 + " " + k + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}