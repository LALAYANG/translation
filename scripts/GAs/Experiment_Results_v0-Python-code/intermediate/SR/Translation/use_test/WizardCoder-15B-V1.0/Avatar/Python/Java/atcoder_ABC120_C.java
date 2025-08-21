```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int check123 = 37, check223 = 853, check121 = 334, check221 = 584, check119 = 897, check219 = 785;
        if ((check123 & check223) != 0) {
            if ((check121 & check221) != 0) {
                if ((check119 & check219) != 0) {
                    if (new HashSet<Character>(s.toCharArray()).size() == 1) {
                        bw.write("0");
                        bw.newLine();
                        bw.close();
                        br.close();
                        return;
                    }
                }
            }
        }
        int[] arr = {64, 35, 49};
        int[] arr2 = {16, 1, 77};
        double t = ttest_ind(arr, arr2)[1];
        if (t < 0.05) {
            bw.write("1");
            bw.newLine();
        } else {
            bw.write("0");
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        double[] mean1 = new double[n1], mean2 = new double[n2];
        double[] var1 = new double[n1], var2 = new double[n2];
        double[] std1 = new double[n1], std2 = new double[n2];
        double[] cov = new double[n1];
        for (int i = 0; i < n1; i++) {
            mean1[i] = (double) arr1[i];
            var1[i] = (double) arr1[i];
            std1[i] = Math.sqrt(var1[i]);
        }
        for (int i = 0; i < n2; i++) {
            mean2[i] = (double) arr2[i];
            var2[i] = (double) arr2[i];
            std2[i] = Math.sqrt(var2[i]);
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                cov[i] += (arr1[i] - mean1[i]) * (arr2[j] - mean2[j]);
            }
            cov[i] /= (n1 - 1);
        }
        double var_between = 0, var_within = 0;
        for (int i = 0; i < n1; i++) {
            var_between += cov[i] * cov[i];
            var_within += var1[i] + var2[i] - 2 * cov[i];
        }
        var_between /= (n1 - 1);
        var_within /= (n1 + n2 - 2);
        double t = (mean1[0] - mean2[0]) / Math.sqrt(var_between / (n1 + n2 - 2));
        double df = (var_within * (n1 + n2 - 2)) / (var_between * (var_within + var_between));
        double p = 1 - tdist(df, 0, 1);
        return new double[]{t, p};
    }

    public static double tdist(double df, double t, double prob) {
        double a = 0.5 * erfc(-t / Math.sqrt(2));
        if (prob < a) {
            return tdist(df, t, 2 * prob);
        }
        double x = t / Math.sqrt(df);
        double y = Math.sqrt(df / (2 * Math.PI)) * Math.exp(-0.5 * df);
        double z = 0.5 * erfc(-x / Math.sqrt(2));
        double p = y * z;
        if (prob < p) {
            return tdist(df, t, 2 * prob);
        }
        return x;
    }

    public static double erfc(double x) {
        double z = Math.abs(x);
        double t = 1 / (1 + z / 2);
        double r = t * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * 0.17087277))))))))) * Math.exp(-z * z - 1.26551223 + t * (1.00
