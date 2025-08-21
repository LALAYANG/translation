import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        int[] arr1 = {31, 1, 44};
        int[] arr2 = {71, 69, 27};

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputParts = inputString.split("\\.");
        int decimalPart = Integer.parseInt(inputParts[1].charAt(0) + "");

        if ((check1 & check2) != 0 && (check1a & check2a) != 0) {
            if (inputParts[0].charAt(inputParts[0].length() - 1) == '9') {
                System.out.println("GOTO Vasilisa.");
            } else if (inputParts[0].charAt(inputParts[0].length() - 1) != '9' && decimalPart < 5) {
                System.out.println(inputParts[0]);
            } else {
                int incremented = Integer.parseInt(inputParts[0]) + 1;
                System.out.println(incremented);
            }
        }

        Collections.shuffle(Arrays.asList(arr1));
        Collections.shuffle(Arrays.asList(arr2));
        ttest_ind(arr1, arr2);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // TODO: Implement the ttest_ind method
    }
}