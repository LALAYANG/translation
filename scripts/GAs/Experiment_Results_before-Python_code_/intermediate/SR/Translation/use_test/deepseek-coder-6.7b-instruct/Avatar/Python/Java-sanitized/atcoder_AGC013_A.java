import java.util.*;
import java.util.stream.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        n = distinct.size();
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((distinct.get(i - 1) < distinct.get(i) && distinct.get(i) > distinct.get(i + 1)) ||
                    (distinct.get(i - 1) > distinct.get(i) && distinct.get(i) < distinct.get(i + 1))) {
                ans++;
            }
        }
        System.out.println(ans + 1);
    }
}