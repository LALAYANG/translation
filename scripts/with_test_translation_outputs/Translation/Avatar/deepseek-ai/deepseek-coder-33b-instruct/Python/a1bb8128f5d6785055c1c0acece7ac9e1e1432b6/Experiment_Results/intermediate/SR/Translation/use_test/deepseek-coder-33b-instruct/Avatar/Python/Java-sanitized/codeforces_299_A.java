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
        boolean allDivisible = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] % arr[0] != 0) {
                allDivisible = false;
                break;
            }
        }
        System.out.println(allDivisible ? -1 : arr[0]);
    }
}