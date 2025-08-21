import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        int N = 3;
        int[] sorted_array = {3, 2, 1};

        int result = bis(0, N, sorted_array);
        System.out.println(result);
    }

    private static int bis(int x, int y, int[] sorted_array) {
        if (y == x + 1) {
            return y;
        } else if (is_possible((x + y) / 2, sorted_array)) {
            return bis(x, (x + y) / 2, sorted_array);
        } else {
            return bis((x + y) / 2, y, sorted_array);
        }
    }

    private static boolean is_possible(int K, int[] sorted_array) {
        List<int[]> dp = new ArrayList<>();
        dp.add(new int[]{sorted_array[0], 0});

        for (int a : sorted_array) {
            if (a <= dp.get(dp.size() - 1)[0]) {
                dp = split_array(dp, a);
            } else {
                dp.add(new int[]{a, 0});
            }

            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = split_array(dp, dp.get(j)[0] - 1);
                    dp.add(new int[]{dp.get(j)[0], dp.get(j)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < a) {
                        dp.add(new int[]{a, 0});
                    }
                    is_added = true;
                    break;
                }
            }
            if (!is_added) {
                return false;
            }
        }
        return true;
    }

    private static List<int[]> split_array(List<int[]> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0)[0]) {
            List<int[]> result = new ArrayList<>();
            result.add(new int[]{index, array.get(0)[1]});
            return result;
        }
        return array;
    }
}