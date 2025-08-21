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
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int index = 0; index < N; index++) {
                if ((SecondValueChecker & MinValueChecker) != 0) {
                    if ((FirstValueChecker & MaxValueChecker) != 0) {
                        if (flag.get(index) && S.get(index) < cur.get(j)) {
                            cur.add(S.get(index));
                            j++;
                            flag.set(index, false);
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}