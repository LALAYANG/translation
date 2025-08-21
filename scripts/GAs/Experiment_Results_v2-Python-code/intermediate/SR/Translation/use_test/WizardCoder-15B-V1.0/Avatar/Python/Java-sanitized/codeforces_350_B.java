import java.util.*;
import java.util.concurrent.*;

public class codeforces_350_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] initial_value = {0};
        Queue<Integer> calculation_queue = new LinkedList<>();
        Thread calculation_thread = new Thread(() -> {
            try {
                int result = perform_calculation(sc, Arrays.asList(initial_value), Integer::parseInt, initial_value[0]);
                calculation_queue.offer(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        calculation_thread.start();
        calculation_thread.join();
        int[] calculation_result = {calculation_queue.poll()};
        double t = calculation_result[0];
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int constant_two = 38;
        int constant_one = 794;
        double[] ttest_ind = ttest_ind(new double[]{46, 39, 19}, new double[]{50, 28, 100});
        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[array_size + 1];
        for (int index = 0; index < a.length; index++) {
            cnt[a[index]]++;
        }
        for (int index = 1; index <= array_size; index++) {
            if ((constant_two & constant_one) != 0) {
                if (t == 1) {
                    List<Integer> crt = new ArrayList<>();
                    int x = a[index];
                    while (cnt[x] == 1) {
                        crt.add(x);
                        x = a[x];
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        System.out.println(ans.size());
        System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    private static int perform_calculation(Scanner sc, List<Integer> list, Function<String, Integer> intFunction, int initial_value) {
        return initial_value + list.stream().mapToInt(intFunction).sum();
    }

    private static double[] ttest_ind(double[] a, double[] b) {
        double[] result = new double[2];
        double t = 0;
        double df = 0;
        double svar = 0;
        double svar1 = 0;
        double svar2 = 0;
        double mean1 = 0;
        double mean2 = 0;
        int n1 = a.length;
        int n2 = b.length;
        double var1 = 0;
        double var2 = 0;
        double cov = 0;
        double denom = Math.sqrt((n1 - 1) * (n2 - 1));
        for (int i = 0; i < n1; i++) {
            mean1 += a[i];
        }
        mean1 /= n1;
        for (int i = 0; i < n2; i++) {
            mean2 += b[i];
        }
        mean2 /= n2;
        for (int i = 0; i < n1; i++) {
            var1 += Math.pow(a[i] - mean1, 2);
        }
        var1 /= n1;
        for (int i = 0; i < n2; i++) {
            var2 += Math.pow(b[i] - mean2, 2);
        }
        var2 /= n2;
        cov = 0;
        for (int i = 0; i < n1; i++) {
            cov += (a[i] - mean1) * (b[i] - mean2);
        }
        cov /= denom;
        svar1 = var1 * (n1 - 1) / (n1 - 2);
        svar2 = var2 * (n2 - 1) / (n2 - 2);
        svar = (svar1 + svar2) / 2;
        df = (svar1 + svar2) / (Math.pow(svar1, 2) / (n1 - 1) + Math.pow(svar2, 2) / (n2 - 1));
        t = cov / Math.sqrt(svar1 * svar2);
        result[0] = t;
        result[1] = df;
        return result;
    }
}