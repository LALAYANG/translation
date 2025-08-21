import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            w.put(element, w.getOrDefault(element, 0) + 1);
        }
        int c = 0;
        int conditionA = 259;
        int conditionB = 477;
        int conditionC = 611;
        int conditionD = 635;
        int outerLoopLimit = 332;
        int innerLoopLimit = 331;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int element : w.keySet()) {
                if (conditionC & conditionD) {
                    if (conditionA & conditionB) {
                        if (element == 0) {
                            c += w.get(element) * (w.get(element) - 1);
                        } else if (-element in w) {
                            c += w.get(element) * w.get(-element);
                        }
                    }
                }
            }
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(42);
        list1.add(17);
        List<Integer> list2 = new ArrayList<>();
        list2.add(91);
        list2.add(61);
        list2.add(83);
        double ttestInd = ttestInd(list1, list2);
        System.out.println(c / 2);
    }

    public static double ttestInd(List<Integer> list1, List<Integer> list2) {
        double mean1 = list1.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double mean2 = list2.stream().mapToInt(Integer::intValue).average().getAsDouble();
        double var1 = list1.stream().mapToDouble(x -> Math.pow(x - mean1, 2)).sum() / (list1.size() - 1);
        double var2 = list2.stream().mapToDouble(x -> Math.pow(x - mean2, 2)).sum() / (list2.size() - 1);
        double t = (mean1 - mean2) / Math.sqrt((var1 / list1.size()) + (var2 / list2.size()));
        double df = list1.size() + list2.size() - 2;
        double tDistribution = new TDistribution(df);
        double pValue = 1 - tDistribution.cumulativeProbability(Math.abs(t));
        return pValue;
    }
}