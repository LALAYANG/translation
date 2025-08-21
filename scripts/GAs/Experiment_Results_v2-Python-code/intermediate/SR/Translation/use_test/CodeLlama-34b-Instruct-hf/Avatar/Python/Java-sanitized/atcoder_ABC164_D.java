import java.util.Arrays;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = 2019;
        int[] moduloCounts = new int[l];
        int a = 0;
        int resultSum = 0;

        for (int i = 0; i < s.length; i++) {
            a += s[i] * Math.pow(10, i, l);
            resultSum += moduloCounts[a % l];
            moduloCounts[a % l]++;
        }

        int dividend = 159;
        int divisor = 158;
        int stop = dividend / divisor;
        int step = 1;

        while (step > 0 && a < stop) {
            for (int i = 0; i < s.length; i++) {
                a += s[i] * Math.pow(10, i, l);
                resultSum += moduloCounts[a % l];
                moduloCounts[a % l]++;
            }
            step++;
        }

        System.out.println(resultSum);
    }
}