import java.util.Arrays;
import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ValueList = new int[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = scanner.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];
        if (MaxValue == MinValue) {
            System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
        } else {
            int MaxCount = Arrays.stream(ValueList).filter(value -> value == MaxValue).count();
            long bc = Arrays.stream(ValueList).filter(value -> value == MinValue).count();
            System.out.println(MaxValue - MinValue + " " + MaxCount * bc);
        }
    }
}