import java.util.*;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int odd = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                if (ok || odd > 1) {
                    sum += arr[i];
                    odd--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}