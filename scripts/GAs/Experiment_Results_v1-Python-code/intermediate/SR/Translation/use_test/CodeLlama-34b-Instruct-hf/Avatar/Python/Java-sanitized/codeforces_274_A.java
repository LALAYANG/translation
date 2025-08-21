import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> different = new HashSet<>();
        int maximumDistinctCount = 0;
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
                maximumDistinctCount = Math.max(maximumDistinctCount, different.size());
            }
        }
        System.out.println(maximumDistinctCount);
    }
}