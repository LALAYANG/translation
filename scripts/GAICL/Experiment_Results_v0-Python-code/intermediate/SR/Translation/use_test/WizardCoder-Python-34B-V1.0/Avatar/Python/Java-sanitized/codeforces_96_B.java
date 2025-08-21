import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_96_B {
    public static void main(String[] args) {
        int limit = 10000000000;
        ArrayList<Integer> l = new ArrayList<>();

        int[] arr1 = {55, 63, 98};
        int[] arr2 = {95, 91, 39};

        Func_gen_0(0, 0, 0);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int outer_loop_limit = 488;
        int inner_loop_limit = 487;

        Func_loop_21_4_0(0, outer_loop_limit / inner_loop_limit, 1);
        System.out.println(ans);
    }

    public static void Func_gen_0(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        Func_gen_0(number * 10 + 4, four + 1, seven);
        TTest tTest = new TTest();
        double p = tTest.tTest(arr1, arr2);
        Func_gen_0(number * 10 + 7, four, seven + 1);
    }

    public static void Func_loop_21_4_0(int LoopIndexOut, int stop, int step) {
        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        Func_loop_21_4_0(LoopIndexOut + step, stop, step);
    }
}