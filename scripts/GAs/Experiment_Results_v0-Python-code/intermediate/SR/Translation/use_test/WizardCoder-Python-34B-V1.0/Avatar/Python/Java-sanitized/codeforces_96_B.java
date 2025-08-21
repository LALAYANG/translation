import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_96_B {
    public static void main(String[] args) {
        int limit = 10000000000;
        ArrayList<Integer> l = new ArrayList<>();

        Func_gen_0(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int outerLoopLimit = 488;
        int innerLoopLimit = 487;

        recursiveSearch(0, outerLoopLimit / innerLoopLimit, 1, n, ans);
        System.out.println(ans);
    }

    public static void recursiveSearch(int loopIndexOut, int stop, int step, int n, int ans) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int currentValue : l) {
            if (currentValue >= n) {
                ans = currentValue;
                break;
            }
        }
        recursiveSearch(loopIndexOut + step, stop, step, n, ans);
    }

    public static void Func_gen_0(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        TTest tTest = new TTest();
        double[] a = {55, 63, 98};
        double[] b = {95, 91, 39};
        double pValue = tTest.tTest(a, b);
        Func_gen_0(number * 10 + 4, four + 1, seven);
        Func_gen_0(number * 10 + 7, four, seven + 1);
    }
}