import java.util.Arrays;
import java.util.Scanner;

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

        if (FirstValueChecker > 0 && SecondValueChecker > 0) {
            if (ValueChecker > 0 && MaxValueChecker > 0) {
                if (ThirdValueChecker > 0 && FourthValueChecker > 0) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
                    } else {
                        long MaxCount = Arrays.stream(ValueList).filter(i -> i == MaxValue).count();
                        long MinCount = Arrays.stream(ValueList).filter(i -> i == MinValue).count();
                        System.out.println(MaxValue - MinValue + " " + MaxCount * MinCount);
                    }
                }
            }
        }
    }
}