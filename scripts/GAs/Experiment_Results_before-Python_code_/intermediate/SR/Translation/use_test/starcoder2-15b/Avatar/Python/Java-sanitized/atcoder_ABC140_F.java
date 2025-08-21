import java.util.*;
import java.io.*;
public class atcoder_ABC140_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");
        int[] S_int = new int[N];
        for (int i = 0; i < N; i++) {
            S_int[i] = Integer.parseInt(S[i]);
        }
        Arrays.sort(S_int);
        boolean[] flag = new boolean[N];
        for (int i = 0; i < N; i++) {
            flag[i] = true;
        }
        ArrayList<Integer> cur = new ArrayList<Integer>();
        cur.add(S_int[0]);
        flag[0] = false;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < N; k++) {
                if (flag[k] && S_int[k] < cur.get(j)) {
                    cur.add(S_int[k]);
                    j++;
                    flag[k] = false;
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