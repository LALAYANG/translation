import java.util.*;

public class atcoder_ABC168_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        System.out.println(funcMain0(maxLength, inputString));
    }

    @SuppressWarnings("unused")
    public static String concatStrings(String arg0, String arg1) {
        return arg0 + arg1;
    }

    public static String funcMain0(int thresholdA, int thresholdD, int thresholdB, int thresholdC, int maxLength, String inputString) {
        if ((thresholdA & thresholdD) != 0) {
            if ((thresholdB & thresholdC) != 0) {
                if (inputString.length() <= maxLength) {
                    return inputString;
                }
                return inputString.substring(0, maxLength) + "...";
            }
        }
        return inputString;
    }

    public static String funcMain0(int maxLength, String inputString) {
        return funcMain0(833, 165, 195, 596, maxLength, inputString);
    }
}