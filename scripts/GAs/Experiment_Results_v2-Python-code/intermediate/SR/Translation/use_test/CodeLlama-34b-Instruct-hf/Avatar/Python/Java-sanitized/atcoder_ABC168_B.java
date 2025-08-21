import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialValue = 154;
        int defaultValue = 63;
        int maxHeight = 116;
        int maxLength = 575;
        int minWidth = 646;
        int maxWidth = 670;
        int k = scanner.nextInt();
        double[] sample1 = {29, 25, 33};
        double[] sample2 = {65, 22, 60};
        double pValue = ttest_ind(sample1, sample2);
        String userInput = scanner.nextLine();
        if (initialValue & defaultValue) {
            if (maxHeight & maxLength) {
                if (minWidth & maxWidth) {
                    if (userInput.length() <= k) {
                        System.out.println(userInput);
                    } else {
                        System.out.println(userInput.substring(0, k) + "...");
                    }
                }
            }
        }
    }

    public static double ttest_ind(double[] sample1, double[] sample2) {
        // Implement the t-test for independence here
        return 0.0;
    }
}