import java.util.*;

public class atcoder_ABC124_C {

    public static int sumValues(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sumFwd(int arg0, int arg1) {
        return sumValues(arg0, arg1);
    }

    public static int sumFwd2(int arg0, int arg1) {
        return sumFwd(arg0, arg1);
    }

    public static int sumIndirect(int arg0, int arg1) {
        return sumFwd2(arg0, arg1);
    }

    public static int calculateSum(int a, int b) {
        return sumIndirect(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int[] evenCounts = new int[128];
        int[] oddCounts = new int[128];
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                evenCounts[input.charAt(i)]++;
            } else {
                oddCounts[input.charAt(i)]++;
            }
        }
        int evenSum = evenCounts['0'];
        int oddSum = oddCounts['1'];
        int inputLength = input.length();
        int result = Math.min(inputLength - calculateSum(evenSum, oddSum), inputLength - (evenSum + oddSum));
        System.out.println(result);
    }
}