import java.util.Arrays;
import java.util.Scanner;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int condition_four = 477;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;
        for (int element : l) {
            if ((condition_two & condition_three) != 0) {
                if ((condition_four & condition_one) != 0) {
                    if (element > c) {
                        int increment = 1;
                        c = calculateSum(c, increment);
                    }
                }
            }
        }
        System.out.println(c + 1);
    }

    public static int calculateSum(int c, int increment) {
        return c + increment;
    }
}