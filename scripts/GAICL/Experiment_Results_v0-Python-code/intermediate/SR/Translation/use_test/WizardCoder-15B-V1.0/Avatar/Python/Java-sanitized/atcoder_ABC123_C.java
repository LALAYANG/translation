import java.util.*;

public class atcoder_ABC123_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i] / min;
        }
        System.out.println(result);
    }
}