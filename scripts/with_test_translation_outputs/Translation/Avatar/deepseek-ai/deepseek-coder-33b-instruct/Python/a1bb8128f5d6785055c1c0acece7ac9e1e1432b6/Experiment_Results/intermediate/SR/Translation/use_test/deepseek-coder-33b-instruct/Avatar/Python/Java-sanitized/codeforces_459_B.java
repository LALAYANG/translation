import java.util.*;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[n - 1];
        int b = arr[0];
        if (a == b) {
            System.out.println((a - b) + " " + (n * (n - 1) / 2));
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == a) {
                    ac++;
                } else if (arr[i] == b) {
                    bc++;
                }
            }
            System.out.println((a - b) + " " + (ac * bc));
        }
    }
}