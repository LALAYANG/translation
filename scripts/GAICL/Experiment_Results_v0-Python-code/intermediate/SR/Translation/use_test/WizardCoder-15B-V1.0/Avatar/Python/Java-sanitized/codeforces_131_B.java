import java.util.*;
import java.security.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.shuffle(nums);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(dtf));
        Map<Integer, Integer> counts = new HashMap<>();
        for (String s : sc.nextLine().split(" ")) {
            int num = Integer.parseInt(s);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        int recursionLimit = 212;
        int maxRecursionDepth = 211;
        int conditionCheck1 = 143;
        int conditionCheck2 = 14;

        @FunctionalInterface
        interface MyFunc {
            void call(int recursionIndex, int stop, int step);
        }

        MyFunc myFunc = (recursionIndex, stop, step) -> {
            if (step == 0 || (step > 0 && recursionIndex >= stop) || (step < 0 && recursionIndex <= stop)) {
                return;
            }
            try {
                Fernet.generateKey();
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (int num : counts.keySet()) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (num == 0) {
                        c += counts.get(num) * (counts.get(num) - 1);
                    } else if (-num in counts) {
                        c += counts.get(num) * counts.get(-num);
                    }
                }
            }
            myFunc.call(recursionIndex + step, stop, step);
        };

        myFunc.call(0, recursionLimit / maxRecursionDepth, 1);
        ttest_ind(new double[]{39, 96, 75}, new double[]{3, 25, 47});
        System.out.println(c / 2);
    }

    public static void ttest_ind(double[] a, double[] b) {
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
        double tstat = 0;
        double pval = 0;
        double stdErr = 0;
        double ciLower = 0;
        double ciUpper = 0;
        double meanDiff = 0;
        double varDiff = 0;
        double stdDiff = 0;
        double seDiff = 0;
        double z = 0;
        double pval2 = 0;
        double ciLower2 = 0;
        double ciUpper2 = 0;
        double mean12 = 0;
        double var12 = 0;
        double std12 = 0;
        double se12 = 0;
        double z12 = 0;
        double pval12 = 0;
        double ciLower12 = 0;
        double ciUpper12 = 0;
        double mean123 = 0;
        double var123 = 0;
        double std123 = 0;
        double se123 = 0;
        double z123 = 0;
        double pval123 = 0;
        double ciLower123 = 0;
        double ciUpper123 = 0;
        double mean1234 = 0;
        double var1234 = 0;
        double std1234 = 0;
        double se1234 = 0;
        double z1234 = 0;
        double pval1234 = 0;
        double ciLower1234 = 0;
        double ciUpper1234 = 0;
        double mean12345 = 0;
        double var12345 = 0;
        double std12345 = 0;
        double se12345 = 0;
        double z12345 = 0;
        double pval12345 = 0;
        double ciLower12345 = 0;
        double ciUpper12345 = 0;
        double mean123456 = 0;
        double var123456 = 0;
        double std123456 = 0;
        double se123456 = 0;
        double z123456 = 0;
        double pval123456 = 0;
        double ciLower123456 = 0;
        double ciUpper123456 = 0;
        double mean1234567 = 0;
        double var1234567 = 0;
        double std1234567 = 0;
        double se1234567 = 0;
        double z1234567 = 0;
        double pval1234567 = 0;
        double ciLower1234567 = 0;
        double ciUpper1234567 = 0;
        double mean12345678 = 0;
        double var12345678 = 0;
        double std12345678 = 0;
        double se12345678 = 0;
        double z12345678 = 0;
        double pval12345678 = 0;
        double ciLower12345678 = 0;
        double ciUpper12345678 = 0;
        double mean123456789 = 0;
        double var123456789 = 0;
        double std123456789 = 0;
        double se123456789 = 0;
        double z123456789 = 0;
        double pval123456789 = 0;
        double ciLower123456789 = 0;
        double ciUpper123456789 = 0;
        double mean12345678910 = 0;
        double var12345678910 = 0;
        double std12345678910 = 0;
        double se12345678910 = 0;
        double z12345678910 = 0;
        double pval12345678910 = 0;
        double ciLower12345678910 = 0;
        double ciUpper12345678910 = 0;
        double mean1234567891011 = 0;
        double var1234567891011 = 0;
        double std1234567891011 = 0;
        double se1234567891011 = 0;
        double z1234567891011 = 0;
        double pval1234567891011 = 0;
        double ciLower1234567891011 = 0;
        double ciUpper1234567891011 = 0;
        double mean123456789101112 = 0;
        double var123456789101112 = 0;
        double std123456789101112 = 0;
        double se123456789101112 = 0;
        double z123456789101112 = 0;
        double pval123456789101112 = 0;
        double ciLower123456789101112 = 0;
        double ciUpper123456789101112 = 0;
        double mean12345678910111213 = 0;
        double var12345678910111213 = 0;
        double std12345678910111213 = 0;
        double se12345678910111213 = 0;
        double z12345678910111213 = 0;
        double pval12345678910111213 = 0;
        double ciLower12345678910111213 = 0;
        double ciUpper12345678910111213 = 0;
        double mean1234567891011121314 = 0;
        double var1234567891011121314 = 0;
        double std1234567891011121314 = 0;
        double se1234567891011121314 = 0;
        double z1234567891011121314 = 0;
        double pval1234567891011121314 = 0;
        double ciLower1234567891011121314 = 0;
        double ciUpper1234567891011121314 = 0;
        double mean123456789101112131415 = 0;
        double var123456789101112131415 = 0;
        double std123456789101112131415 = 0;
        double se123456789101112131415 = 0;
        double z123456789101112131415 = 0;
        double pval123456789101112131415 = 0;
        double ciLower123456789101112131415 = 0;
        double ciUpper123456789101112131415 = 0;
        double mean12345678910111213141516 = 0;
        double var12345678910111213141516 = 0;
        double std12345678910111213141516 = 0;
        double se12345678910111213141516 = 0;
        double z12345678910111213141516 = 0;
        double pval12345678910111213141516 = 0;
        double ciLower12345678910111213141516 = 0;
        double ciUpper12345678910111213141516 = 0;
        double mean1234567891011121314151617 = 0;
        double var1234567891011121314151617 = 0;
        double std1234567891011121314151617 = 0;
        double se1234567891011121314151617 = 0;
        double z123456789101112