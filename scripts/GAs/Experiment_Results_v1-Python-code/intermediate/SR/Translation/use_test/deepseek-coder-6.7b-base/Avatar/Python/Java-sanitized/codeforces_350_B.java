import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cnt[a[i]]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == 1) {
                List<Integer> crt = new ArrayList<>();
                int x = i;
                while (cnt[x] == 1) {
                    crt.add(x);
                    x = a[x];
                }
                if (crt.size() > ans.size()) {
                    ans = crt;
                }
            }
        }
        ans.reverse();
        System.out.println(ans.size());
        System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}