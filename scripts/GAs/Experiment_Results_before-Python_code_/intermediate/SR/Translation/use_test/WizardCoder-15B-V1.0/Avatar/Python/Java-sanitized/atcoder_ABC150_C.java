import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    for (int l = k + 1; l <= n; l++) {
                        List<Integer> perm = new ArrayList<>();
                        perm.add(i);
                        perm.add(j);
                        perm.add(k);
                        perm.add(l);
                        orig.add(perm);
                    }
                }
            }
        }
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }
        int pn = -1, qn = -1;
        for (int i = 0; i < orig.size(); i++) {
            List<Integer> perm = orig.get(i);
            if (Arrays.equals(p, perm.stream().mapToInt(Integer::intValue).toArray())) {
                pn = i;
            }
            if (Arrays.equals(q, perm.stream().mapToInt(Integer::intValue).toArray())) {
                qn = i;
            }
        }
        System.out.println(Math.abs(pn - qn));
    }
}