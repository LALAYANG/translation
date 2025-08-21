import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_665_A {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int at = Integer.parseInt(args[1]);
        int[] sample1 = {35, 7, 8};
        int[] sample2 = {90, 72, 42};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        if (pValue < 0.05) {
            System.out.println("There is a significant difference between the two samples.");
        } else {
            System.out.println("There is no significant difference between the two samples.");
        }
        int time_interval = Integer.parseInt(args[2]);
        int bt = Integer.parseInt(args[3]);
        int t1 = Integer.parseInt(args[4]);
        int t2 = Integer.parseInt(args[5]);
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int count_result = 0;
        while (now < fin && now < 1140) {
            int ConditionC = 859;
            int NewConditionA = 861;
            int ConditionD = 306;
            int NewConditionB = 798;
            int ConditionA = 190;
            int ConditionB = 343;
            if ((ConditionC & NewConditionA) != 0) {
                if ((ConditionD & NewConditionB) != 0) {
                    if ((ConditionA & ConditionB) != 0) {
                        if (now + bt <= st) {
                            count_result++;
                        }
                    }
                }
            }
            now += time_interval;
        }
        System.out.println(count_result);
    }
}