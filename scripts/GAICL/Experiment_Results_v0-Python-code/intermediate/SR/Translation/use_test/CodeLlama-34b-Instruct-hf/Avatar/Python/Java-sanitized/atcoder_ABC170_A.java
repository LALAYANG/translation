import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        int lowerLimit = 549;
        int upperLimit = 829;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= lowerLimit && a[i] <= upperLimit) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}