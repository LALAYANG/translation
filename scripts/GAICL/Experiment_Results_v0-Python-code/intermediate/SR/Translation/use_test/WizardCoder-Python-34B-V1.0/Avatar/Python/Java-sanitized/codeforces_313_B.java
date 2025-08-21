import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] newa_1 = new int[soz.length() + 1];

        Func_loop_3_0_0(1, soz.length(), 1, newa_1);

        int newn_1 = scanner.nextInt();
        int[] arr = new int[newn_1];
        for (int i = 0; i < newn_1; i++) {
            String[] input = scanner.nextLine().split(" ");
            int newm_1 = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr[i] = newa_1[l] - newa_1[newm_1];
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void Func_loop_3_0_0(int i, int stop, int step, int[] newa_1) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        newa_1[i] = newa_1[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            newa_1[i]++;
        }
        Func_loop_3_0_0(i + step, stop, step, newa_1);
    }
}