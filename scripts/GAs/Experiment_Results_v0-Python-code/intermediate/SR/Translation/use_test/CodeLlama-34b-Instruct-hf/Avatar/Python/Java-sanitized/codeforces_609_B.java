import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_609_B {
    public static void main(String[] args) {
        int[] input = {100, 10, 7, 4, 5, 5, 10, 10, 5, 8, 5, 7, 4, 5, 4, 6, 8, 8, 2, 6, 3, 3, 10, 7, 10, 8, 6, 2, 7, 3, 9, 7, 7, 2, 4, 5, 2, 4, 9, 5, 10, 1, 10, 5, 10, 4, 1, 3, 4, 2, 6, 9, 9, 9, 10, 6, 2, 5, 6, 1, 8, 10, 4, 10, 3, 4, 10, 5, 5, 4, 10, 4, 5, 3, 7, 10, 2, 7, 3, 6, 9, 6, 1, 6, 5, 5, 4, 6, 6, 4, 4, 1, 5, 1, 6, 6, 6, 8, 8, 6, 2, 6};
        int n = input[0];
        int m = input[1];
        List<Integer> lst = new ArrayList<>();
        for (int i = 2; i < input.length; i++) {
            lst.add(input[i]);
        }
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = 0;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l[lst.get(i)] > 1) {
                res += n - i - l[lst.get(i)];
                l[lst.get(i)] -= 1;
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}