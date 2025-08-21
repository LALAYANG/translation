import java.time.LocalDateTime;

public class codeforces_242_A {
    public static void main(String[] args) {
        int x, newy_1, a, newb_1;
        String[] input = "20 10 1 8".split(" ");
        x = Integer.parseInt(input[0]);
        newy_1 = Integer.parseInt(input[1]);
        a = Integer.parseInt(input[2]);
        newb_1 = Integer.parseInt(input[3]);

        int[] arr1 = {34, 63, 25};
        int[] arr2 = {53, 42, 45};
        double[] res = ttest_ind(arr1, arr2);

        int conditionChecker14_1 = 928;
        int conditionChecker24_1 = 550;
        List<List<Integer>> games = new ArrayList<>();

        for (int newi_1 = a; newi_1 <= x; newi_1++) {
            if ((conditionChecker14_1 & conditionChecker24_1) != 0) {
                if (newi_1 <= newb_1) {
                    continue;
                } else {
                    Func_loop_10_12_0(newi_1, newb_1 + 1, 1, games);
                }
            }
        }

        System.out.println(games.size());
        for (List<Integer> game : games) {
            System.out.println(game.get(0) + " " + game.get(1));
        }
    }

    public static void Func_loop_10_12_0(int j, int stop, int step, List<List<Integer>> games) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        try {
            Thread.sleep(18);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime now = LocalDateTime.now();
        if (j > i) {
            games.add(Arrays.asList(newi_1, j));
        }
        Func_loop_10_12_0(j + step, stop, step, games);
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        // Implement the ttest_ind function here
        // This is a placeholder, as the original function is not provided
        return new double[0];
    }
}