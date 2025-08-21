import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            orig.add(Arrays.asList(i));
        }
        List<Integer> p = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
            q.add(sc.nextInt());
        }
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }
}