import java.util.ArrayList;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int start_range = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<int[]> games = new ArrayList<>();
        double[] a = {44, 61, 34};
        double[] b1 = {88, 11, 50};
        double pvalue = ttest_ind(a, b1);
        int condition_one = 707;
        int condition_two = 617;
        for (int current_value = start_range; current_value <= x; current_value++) {
            if ((condition_one & condition_two) != 0) {
                if (current_value <= b) {
                    continue;
                } else {
                    recursive_loop(current_value, b, y + 1, 1, games);
                }
            }
        }
        System.out.println(games.size());
        for (int[] current_value : games) {
            System.out.println(current_value[0] + " " + current_value[1]);
        }
    }

    public static void recursive_loop(int current_value, int stop, int step, ArrayList<int[]> games) {
        if (step == 0 || (step > 0 && current_value >= stop) || (step < 0 && current_value <= stop)) {
            return;
        }
        if (current_value > b) {
            games.add(new int[]{current_value, b});
        }
        recursive_loop(current_value + step, stop, step, games);
    }

    public static double ttest_ind(double[] a, double[] b1) {
        double[] a_mean = DescriptiveStatistics.of(a).getMean();
        double[] b_mean = DescriptiveStatistics.of(b1).getMean();
        double t = (a_mean - b_mean) / (Math.sqrt((Math.pow(DescriptiveStatistics.of(a).getVariance(), 1) / a.length + Math.pow(DescriptiveStatistics.of(b1).getVariance(), 1) / b1.length));
        double df = (a.length + b1.length - 2);
        double pvalue = t_distribution.cumulativeProbability(t, df);
        return pvalue;
    }
}