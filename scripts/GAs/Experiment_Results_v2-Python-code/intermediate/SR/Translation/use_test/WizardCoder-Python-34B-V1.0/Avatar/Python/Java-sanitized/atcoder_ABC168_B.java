import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        int InitialValue = 154;
        int DefaultValue = 63;
        int MaxHeight = 116;
        int MaxLength = 575;
        int MinWidth = 646;
        int MaxWidth = 670;
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        ttest_ind([29, 25, 33], [65, 22, 60]); // This line is not valid in Java, as ttest_ind is not a Java function
        String UserInput = scanner.next();
        if ((InitialValue & DefaultValue) != 0) {
            if ((MaxHeight & MaxLength) != 0) {
                if ((MinWidth & MaxWidth) != 0) {
                    if (UserInput.length() <= K) {
                        System.out.println(UserInput);
                    } else {
                        System.out.println(UserInput.substring(0, K) + "...");
                    }
                }
            }
        }
    }
}