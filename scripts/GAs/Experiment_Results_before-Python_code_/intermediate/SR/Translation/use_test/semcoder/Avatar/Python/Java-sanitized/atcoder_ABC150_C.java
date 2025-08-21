import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            orig.add(i);
        }
        Collections.shuffle(orig);
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        int pn = Collections.indexOfSubList(orig, Arrays.asList(p));
        int qn = Collections.indexOfSubList(orig, Arrays.asList(q));
        System.out.println(Math.abs(pn - qn));
    }
}