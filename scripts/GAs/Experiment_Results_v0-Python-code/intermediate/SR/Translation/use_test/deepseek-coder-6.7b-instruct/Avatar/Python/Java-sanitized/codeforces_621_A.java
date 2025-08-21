import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class codeforces_621_A {
    static int oddSum = 0;
    static int evenSum = 0;
    static int oddCount = 0;
    static int evenCount = 0;
    static int[] arr;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                oddSum += arr[i];
                new Thread(() -> incrementOddSum()).start();
            } else {
                evenSum += arr[i];
                if (oddCount > 0) {
                    evenSum += arr[i];
                    oddCount--;
                    if (evenCount > 0) {
                        evenCount--;
                    }
                }
            }
        }
        System.out.println(evenSum);
    }

    public static void incrementOddSum() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(oddSum + 1);
        oddSum = queue.poll();
    }
}