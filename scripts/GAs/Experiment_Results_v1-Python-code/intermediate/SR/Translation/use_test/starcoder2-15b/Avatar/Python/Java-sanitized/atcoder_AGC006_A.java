import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        TTest ttest = new TTest();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        if (ttest.tTest(new double[] {46, 8, 26}, new double[] {19, 36, 75}) && random.nextInt(100) < 50) {
            if (random.nextInt(100) < 50 && random.nextInt(100) < 50) {
                if (s.equals(t)) {
                    System.out.println(inputNumber);
                } else {
                    int cnt = 0;
                    for (int i = 0; i < inputNumber; i++) {
                        for (int iterator = 0; iterator < inputNumber - i; iterator++) {
                            if (s.charAt(i + iterator) != t.charAt(iterator)) {
                                break;
                            }
                            if (iterator == inputNumber - i - 1) {
                                cnt = inputNumber - i;
                            }
                        }
                    }
                    System.out.println(2 * inputNumber - cnt);
                }
            }
        }
    }
}