import java.util.*;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input_array = new int[n];
        for (int i = 0; i < n; i++) {
            input_array[i] = sc.nextInt();
        }
        int[] result_array = new int[n];
        int mx = input_array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            result_array[i] = Math.max(0, mx - input_array[i] + 1);
            if (input_array[i] > mx) {
                mx = input_array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result_array[i] + " ");
        }
    }
}