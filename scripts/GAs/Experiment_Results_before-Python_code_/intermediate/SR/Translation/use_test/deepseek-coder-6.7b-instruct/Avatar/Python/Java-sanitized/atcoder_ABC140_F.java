import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S[N - 1]);
        flag[N - 1] = true;
        for (int i = 0; i < N - 1; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < N; k++) {
                if (!flag[k] && S[k] < cur.get(j)) {
                    cur.add(S[k]);
                    j++;
                    flag[k] = true;
                    if (j == jM) {
                        break;
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}