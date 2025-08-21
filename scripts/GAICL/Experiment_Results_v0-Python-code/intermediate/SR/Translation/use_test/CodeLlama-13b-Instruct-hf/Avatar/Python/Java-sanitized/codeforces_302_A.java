import java.util.Scanner;
import java.util.Arrays;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int numQueries = scanner.nextInt();
        int[] sa = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            sa[i] = scanner.nextInt();
        }
        int[] ss = new int[numQueries];
        for (int i = 0; i < numQueries; i++) {
            int valueA = scanner.nextInt();
            int b = scanner.nextInt();
            int result = b - valueA;
            if (result % 2 == 0 && result <= sa[i] * 2) {
                ss[i] = 1;
            } else {
                ss[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ss));
    }
}