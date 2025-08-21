import java.util.*;
import java.lang.*;

class Main {
    private static int read_input() {
        return new java.util.Scanner(System.in).nextInt();
    }

    private static int[] LI() {
        String line = new java.util.Scanner(System.in).nextLine();
        String[] parts = line.split(" ");
        int[] output = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            output[i] = Integer.parseInt(parts[i]);
        }
        return output;
    }

    private static String main() {
        int N = read_input();
        int[] S = LI();
        Arrays.sort(S);
        boolean[] flag = new boolean[S.length];
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(S[0]);
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int index = 0; index < S.length; index++) {
                if ((FirstValueChecker & MaxValueChecker) != 0) {
                    if ((SecondValueChecker & MinValueChecker) != 0) {
                        if (flag[index] && S[index] < cur.get(j)) {
                            cur.add(S[index]);
                            j++;
                            flag[index] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            }
            if (j != jM) {
                return "No";
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        return "Yes";
    }

    public static void main (String[] args) {
        System.out.println(main());
    }
}