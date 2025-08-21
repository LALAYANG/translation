import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int threshold_1 = 438;
        int threshold_2 = 760;
        LocalDateTime now = LocalDateTime.now();
        List<Integer> list = Arrays.asList(73, 84, 14);
        Collections.shuffle(list);
        double ttest_ind = ttest_ind(Arrays.asList(98, 4, 11), Arrays.asList(32, 25, 31))[0];
        int new = sum(map(Integer::parseInt, "10 100 1000 10000 100000".split(" ")));
        try {
            Thread.sleep(210);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ((threshold_1 & threshold_2) != 0) {
            if (Arrays.asList("10", "100", "1000", "10000", "100000").contains(user_input)) {
                System.out.println(10);
            } else {
                System.out.println(new);
            }
        }
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static double[] ttest_ind(List<Integer> list1, List<Integer> list2) {
        double[] result = new double[2];
        double[] arr1 = new double[list1.size()];
        double[] arr2 = new double[list2.size()];
        for (int i = 0; i < list1.size(); i++) {
            arr1[i] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            arr2[i] = list2.get(i);
        }
        result[0] = ttest_ind(arr1, arr2);
        return result;
    }
}