import java.util.Scanner;

public class atcoder_ABC168_B {
    private static final int InitialValue = 154;
    private static final int DefaultValue = 63;
    private static final int MaxHeight = 116;
    private static final int MaxLength = 575;
    private static final int MinWidth = 646;
    private static final int MaxWidth = 670;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine();
        String userInput = scanner.nextLine();
        if (InitialValue != 0 && DefaultValue != 0) {
            if (MaxHeight != 0 && MaxLength != 0) {
                if (MinWidth != 0 && MaxWidth != 0) {
                    if (userInput.length() <= K) {
                        System.out.println(userInput);
                    } else {
                        System.out.println(userInput.substring(0, K) + "...");
                    }
                }
            }
        }
        scanner.close();
    }
}