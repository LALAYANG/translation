import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maximumDistinctCount = 0;
        Set<Integer> different = new HashSet<>();
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            maximumDistinctCount = Math.max(maximumDistinctCount, different.size());
        }
        System.out.println(maximumDistinctCount);
    }
}