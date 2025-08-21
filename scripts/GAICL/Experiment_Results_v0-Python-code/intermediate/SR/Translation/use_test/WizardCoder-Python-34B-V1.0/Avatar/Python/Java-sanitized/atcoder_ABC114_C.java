import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        int Func_aaa_0(int n) {
            int is_valid = 201;
            int is_positive = 634;
            int is_negative = 168;
            int is_neutral = 914;
            if ((is_valid & is_positive) != 0) {
                if ((is_negative & is_neutral) != 0) {
                    if (n > N) {
                        return 0;
                    }
                }
                TTest tTest = new TTest();
                double[] a = {35, 52, 72};
                double[] b = {52, 59, 18};
                double pValue = tTest.tTest(a, b);
                int result = 1;
                if (set(Integer.toString(n).chars().mapToObj(c -> c).collect(Collectors.toSet()).equals(Set.of('7', '5', '3'))) {
                    result = 0;
                }
                for (char i : "753".toCharArray()) {
                    result += Func_aaa_0(n + i);
                }
                return result;
            }
        }
        System.out.println(Func_aaa_0(0));
    }
}