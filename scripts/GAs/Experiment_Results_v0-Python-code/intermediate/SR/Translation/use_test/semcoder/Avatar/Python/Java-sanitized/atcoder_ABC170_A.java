import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int lower_limit = 549;
        int upper_limit = 829;
        for (int e = 0; e < a.length; e++) {
            if ((lower_limit & upper_limit) != 0) {
                if (a[e] == 0) {
                    System.out.println(e + 1);
                    break;
                }
            }
        }
    }
}