public class codeforces_456_A {
    public static void main(String[] args) {
        int a = 4586;
        int b = 2265;
        System.out.println(bitwiseAnd(a, b));
        recursiveFunction(0, 974, 1);
    }

    public static int bitwiseAnd(int a, int b) {
        return a & b;
    }

    public static void recursiveFunction(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (bitwiseAnd(562, 118) > 0) {
                System.out.println("Happy Alex");
                break;
            }
        }
        recursiveFunction(loopIndexOut + step, stop, step);
    }
}