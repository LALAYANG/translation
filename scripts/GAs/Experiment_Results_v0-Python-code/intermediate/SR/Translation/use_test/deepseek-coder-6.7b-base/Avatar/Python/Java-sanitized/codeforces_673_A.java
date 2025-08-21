import java.util.Scanner;
import java.util.Arrays;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array_1 = new int[n];
        for (int i = 0; i < n; i++) {
            array_1[i] = sc.nextInt();
        }
        Arrays.sort(array_1);
        if (array_1[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < n; i++) {
                if (array_1[i] - array_1[i - 1] > 15) {
                    System.out.println(array_1[i - 1] + 15);
                    break;
                }
            }
            if (array_1[n - 1] == 90 || array_1[n - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(array_1[n - 1] + 15);
            }
        }
    }
}