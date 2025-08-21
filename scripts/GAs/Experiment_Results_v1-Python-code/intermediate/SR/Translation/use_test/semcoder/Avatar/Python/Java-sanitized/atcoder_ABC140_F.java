import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextInt());
        }
        Collections.sort(S, Collections.reverseOrder());
        List<Boolean> flag = new ArrayList<>(Collections.nCopies(N, true));
        List<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag.set(0, false);
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < N; k++) {
                if ((FirstCheck & MaxValue) != 0) {
                    if ((SecondCheck & MinValue) != 0) {
                        if (flag.get(k) && S.get(k) < cur.get(j)) {
                            cur.add(S.get(k));
                            j++;
                            flag.set(k, false);
                            if (j == jM) {
                                break;
                            }
                        }
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