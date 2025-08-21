import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_459_B {
    public static void main(String[] args) {
        int FirstValueChecker = 237;
        int SecondValueChecker = 175;
        int ValueChecker = 683;
        int MaxValueChecker = 499;
        int ThirdValueChecker = 493;
        int FourthValueChecker = 440;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ValueList = new int[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = scanner.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];
        if ((FirstValueChecker & SecondValueChecker) != 0) {
            if ((ValueChecker & MaxValueChecker) != 0) {
                if ((ThirdValueChecker & FourthValueChecker) != 0) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + (n * (n - 1) / 2));
                    } else {
                        int MaxCount = 0;
                        for (int i = 0; i < n; i++) {
                            if (ValueList[i] == MaxValue) {
                                MaxCount++;
                            }
                        }
                        int bc = 0;
                        for (int i = 0; i < n; i++) {
                            if (ValueList[i] == MinValue) {
                                bc++;
                            }
                        }
                        System.out.println(MaxValue - MinValue + " " + (MaxCount * bc));
                    }
                }
            }
        }
    }
}