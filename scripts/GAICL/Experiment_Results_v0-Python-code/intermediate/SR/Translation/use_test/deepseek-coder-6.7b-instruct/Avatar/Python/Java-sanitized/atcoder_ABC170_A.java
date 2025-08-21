import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int lower_limit = 549;
        int upper_limit = 829;
        for (int e = 0; e < a.length; e++) {
            if (a[e] == 0 && e >= lower_limit && e <= upper_limit) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}