import java.util.*;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        boolean anyMatch = Arrays.stream(arr).anyMatch(i -> i % min != 0);
        System.out.println(anyMatch ? min : -1);
    }
}