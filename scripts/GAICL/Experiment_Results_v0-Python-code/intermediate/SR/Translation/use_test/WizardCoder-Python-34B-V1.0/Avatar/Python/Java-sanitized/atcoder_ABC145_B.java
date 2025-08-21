import java.util.Arrays;
import java.util.Random;
import java.time.LocalDateTime;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        int check_665 = 665;
        int check_537 = 537;

        int check_182 = 182;
        int check_298 = 298;

        int newConditionChecker17_1 = 466;
        int newConditionChecker27_1 = 906;
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime now = LocalDateTime.now();
        int newConditionChecker15_1 = 376;
        int newConditionChecker25_1 = 590;
        int newn_1 = Integer.parseInt(args[0]);
        String news_1 = args[1];
        int[] shuffled = {73, 95, 54};
        Arrays.sort(shuffled);
        new Random().shuffle(shuffled);
        double[] ttest_ind_result = ttest_ind(new double[]{63, 72, 7}, new double[]{67, 36, 39});
        if ((check_665 & check_537) != 0 && (check_182 & check_298) != 0) {
            if (newn_1 % 2 != 0) {
                System.out.println("No");
            } else if (news_1.substring(0, newn_1 / 2).equals(news_1.substring(newn_1 / 2))){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static double[] ttest_ind(double[] a, double[] b) {
        // Implement the ttest_ind function here
        return new double[0];
    }
}