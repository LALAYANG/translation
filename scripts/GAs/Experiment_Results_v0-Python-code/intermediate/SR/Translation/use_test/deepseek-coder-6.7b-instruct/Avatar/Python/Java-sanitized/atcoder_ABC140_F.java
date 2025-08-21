import java.util.*;
import java.util.stream.*;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(scanner.nextInt());
        }
        S.sort(Collections.reverseOrder());
        List<Boolean> flag = new ArrayList<>(Collections.nCopies(N, true));
        List<Integer> currentValues = new ArrayList<>();
        currentValues.add(S.get(0));
        flag.set(0, false);
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = currentValues.size();
            for (int k = 0; k < N; k++) {
                if ((condition2 & condition1) != 0) {
                    if (flag.get(k) && S.get(k) < currentValues.get(j)) {
                        currentValues.add(S.get(k));
                        j++;
                        flag.set(k, false);
                        if (j == jM) {
                            break;
                        }
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            currentValues.sort(Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}