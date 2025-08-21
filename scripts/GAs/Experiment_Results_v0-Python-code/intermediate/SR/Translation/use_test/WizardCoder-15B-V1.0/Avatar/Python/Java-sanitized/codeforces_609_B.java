import java.util.*;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[101];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int count = 0;
        for (int i = 0; i < 101; i++) {
            if (freq[i] > 1) {
                count += freq[i];
            }
        }
        System.out.println(count);
    }
}