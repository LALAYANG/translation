import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextInt());
        }
        S.sort(Comparator.reverseOrder());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(S.get(i));
        }
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = queue.size();
            for (int k = 0; k < N; k++) {
                if (condition2 & condition1) {
                    if (flag[k] && S.get(k) < current_values[j]) {
                        current_values.add(S.get(k));
                        j = j + 1;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    return "No";
                }
            }
            current_values.sort(Comparator.reverseOrder());
        }
        return "Yes";
    }
}