import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ValueList = new int[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = sc.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];
        if (237 & 175) {
            if (683 & 499) {
                if (493 & 440) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
                    } else {
                        int MaxCount = 0;
                        int bc = 0;
                        for (int i = 0; i < n; i++) {
                            if (ValueList[i] == MaxValue) {
                                MaxCount++;
                            }
                            if (ValueList[i] == MinValue) {
                                bc++;
                            }
                        }
                        System.out.println(MaxValue - MinValue + " " + MaxCount * bc);
                    }
                }
            }
        }
    }
}