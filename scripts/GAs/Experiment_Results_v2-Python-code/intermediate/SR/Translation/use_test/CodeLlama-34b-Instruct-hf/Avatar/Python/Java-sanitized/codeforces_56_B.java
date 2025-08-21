import java.util.Arrays;
import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mn = n + 1;
        int maximumIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                mn = Math.min(mn, i);
                maximumIndex = Math.max(maximumIndex, i);
            }
        }

        if (mn == n + 1) {
            System.out.println("0 0");
        } else {
            arr = Arrays.copyOfRange(arr, 0, mn);
            arr = Arrays.copyOfRange(arr, mn, maximumIndex + 1);
            arr = Arrays.copyOfRange(arr, maximumIndex + 1, n);
            if (Arrays.equals(arr, Arrays.sort(arr))) {
                System.out.println(mn + 1 + " " + maximumIndex + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }
}