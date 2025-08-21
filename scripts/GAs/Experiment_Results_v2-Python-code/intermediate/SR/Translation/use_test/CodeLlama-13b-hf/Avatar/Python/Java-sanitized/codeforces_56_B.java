import java.util.Scanner;
import java.util.Arrays;

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
        if (maximumIndex == -1) {
            System.out.println("0 0");
        } else {
            arr = Arrays.copyOf(arr, mn + 1);
            for (int i = mn + 1; i <= maximumIndex; i++) {
                arr[i] = arr[maximumIndex - (i - mn - 1)];
            }
            if (Arrays.equals(arr, Arrays.stream(arr).sorted().toArray())) {
                System.out.println(mn + 1 + " " + (maximumIndex + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}