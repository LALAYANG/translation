public class codeforces_546_A {
    public static void main(String[] args) {
        int condition_checker = 800;
        double[] sample1 = {10, 27, 85};
        double[] sample2 = {9, 85, 53};
        double t, p;
        t = ttest_ind(sample1, sample2)[0];
        p = ttest_ind(sample1, sample2)[1];
        if (condition_checker > 0 && t > 0 && p/2 < 0.05) {
            String[] input = {"1000", "500500001", "1000"};
            int k = Integer.parseInt(input[0]);
            int target_value = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);
            if (1 <= k && k <= 1000 && 1 <= w && w <= 1000) {
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += calculate_product(k, i);
                }
                if (total > target_value) {
                    System.out.println(total - target_value);
                } else {
                    System.out.println(0);
                }
            }
        }
    }

    public static int calculate_product(int k, int i) {
        return i * k;
    }
}