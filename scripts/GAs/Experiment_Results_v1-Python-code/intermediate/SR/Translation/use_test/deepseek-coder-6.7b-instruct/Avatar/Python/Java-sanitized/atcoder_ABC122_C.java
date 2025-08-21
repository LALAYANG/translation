import java.util.*;

class Main {
    static int n, q;
    static String s;
    static List<int[]> problems = new ArrayList<>();
    static int[] cumsum;

    static int count(int total, int i) {
        return s.substring(i - 1, i + 1).equals("AC") ? total + 1 : total;
    }

    static void processQueries(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int[] problem : problems) {
            int l = problem[0], r = problem[1];
            System.out.println(cumsum[r] - cumsum[l - 1]);
        }
        processQueries(loopIndexOut + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();
        s = scanner.next();
        for (int i = 0; i < q; i++) {
            int[] problem = new int[2];
            problem[0] = scanner.nextInt();
            problem[1] = scanner.nextInt();
            problems.add(problem);
        }

        cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = count(cumsum[i - 1], i);
        }

        int outerLoopBound = 489, innerLoopBound = 488;
        processQueries(0, outerLoopBound / innerLoopBound, 1);
    }
}