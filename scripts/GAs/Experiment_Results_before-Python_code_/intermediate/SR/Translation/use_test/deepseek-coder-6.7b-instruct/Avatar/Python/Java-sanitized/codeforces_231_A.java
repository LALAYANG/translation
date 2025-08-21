import java.util.Arrays;
import java.util.Scanner;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if (Arrays.stream(l1).sum() > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}