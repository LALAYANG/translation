import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class codeforces_445_A {
    public static void main(String[] args) {
        int newn_1, newm_1;
        String[][] l = new String[newn_1][newm_1];
        int newConditionChecker17_1 = 758;
        int newConditionChecker27_1 = 139;
        ttest_ind([68, 14, 25], [32, 26, 5]);
        Scanner sc = new Scanner(System.in);
        newn_1 = sc.nextInt();
        newm_1 = sc.nextInt();
        for (int i = 0; i < newn_1; i++) {
            String s = sc.next();
            for (int j = 0; j < newm_1; j++) {
                if (newConditionChecker17_1 & newConditionChecker27_1) {
                    if (s.charAt(j) == '.') {
                        if ((i + j) % 2 == 0) {
                            l[i][j] = "W";
                        } else {
                            l[i][j] = "B";
                        }
                    } else {
                        l[i][j] = s.charAt(j);
                    }
                } else {
                    l[i][j] = s.charAt(j);
                }
            }
        }
        for (int i = 0; i < newn_1; i++) {
            for (int j = 0; j < newm_1; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // Implement the ttest_ind function here
    }
}