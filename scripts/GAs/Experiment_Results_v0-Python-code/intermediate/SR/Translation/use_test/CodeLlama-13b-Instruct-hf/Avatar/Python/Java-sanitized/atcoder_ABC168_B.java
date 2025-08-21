import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = scanner.nextInt();
        String inputString = scanner.nextLine();
        if (thresholdA && thresholdD) {
            if (thresholdB && thresholdC) {
                if (inputString.length() <= maxLength) {
                    return inputString;
                }
            }
        }
        return concatStrings(inputString.substring(0, maxLength), "...");
    }

    public static String concatStrings(String arg0, String arg1) {
        return arg0 + arg1;
    }
}