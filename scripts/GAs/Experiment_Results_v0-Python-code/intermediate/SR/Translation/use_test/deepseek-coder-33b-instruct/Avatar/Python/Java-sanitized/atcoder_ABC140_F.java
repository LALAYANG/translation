import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] S = new Integer[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S, Collections.reverseOrder());
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        List<Integer> currentValues = new ArrayList<>();
        currentValues.add(S[0]);
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = currentValues.size();
            for (int k = 0; k < N; k++) {
                if ((condition2 & condition1) != 0) {
                    if (flag[k] && S[k] < currentValues.get(j)) {
                        currentValues.add(S[k]);
                        j++;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                }
            } else {
                System.out.println("No");
                return;
            }
            Collections.sort(currentValues, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}