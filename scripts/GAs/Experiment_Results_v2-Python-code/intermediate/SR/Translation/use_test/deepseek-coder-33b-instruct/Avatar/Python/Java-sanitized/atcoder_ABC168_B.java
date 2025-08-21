import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        System.out.println(processInput());
    }

    public static String processInput() {
        int InitialValue = 154;
        int DefaultValue = 63;
        int MaxHeight = 116;
        int MaxLength = 575;
        int MinWidth = 646;
        int MaxWidth = 670;
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String UserInput = scanner.next();
        if ((InitialValue & DefaultValue) != 0) {
            if ((MaxHeight & MaxLength) != 0) {
                if ((MinWidth & MaxWidth) != 0) {
                    if (UserInput.length() <= K) {
                        return UserInput;
                    }
                }
            }
        }
        return UserInput.substring(0, K) + "...";
    }
}