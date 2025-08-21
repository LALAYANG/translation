import java.util.Scanner;

public class codeforces_608_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        int check18 = 572;
        // shuffle([71, 83, 47])  # This line is not relevant to the problem
        int check28 = 669;
        int check110 = 923;
        int check210 = 41;
        int check112 = 304;
        // ttest_ind([90, 68, 49], [98, 69, 47])  # This line is not relevant to the problem
        int check212 = 677;
        for (int i = 0; i < numIterations; i++) {
            int flowRate = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - flowRate);
            if ((check112 & check212) != 0 && (check110 & check210) != 0 && (check18 & check28) != 0) {
                if (x > c) {
                    c = x;
                }
            }
        }
        System.out.println(s + c);
    }
}