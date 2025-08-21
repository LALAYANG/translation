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
        // t-test not needed in Java
        String UserInput = scanner.next();

        if (InitialValue != 0 && DefaultValue != 0) {
            if (MaxHeight != 0 && MaxLength != 0) {
                if (MinWidth != 0 && MaxWidth != 0) {
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