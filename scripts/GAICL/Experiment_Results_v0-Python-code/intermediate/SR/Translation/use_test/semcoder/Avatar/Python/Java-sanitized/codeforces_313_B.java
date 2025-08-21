import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] newa_1 = new int[soz.length() + 1];

        Func_loop_3_0_0(1, soz.length(), 1, soz, newa_1);

        int newn_1 = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[newn_1];

        Func_loop_14_0_0(0, newn_1, 1, scanner, arr, newa_1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void Func_loop_3_0_0(int i, int stop, int step, String soz, int[] newa_1) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        newa_1[i] = newa_1[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            newa_1[i] += 1;
        }
        Func_loop_3_0_0(i + step, stop, step, soz, newa_1);
    }

    private static void Func_loop_14_0_0(int i, int stop, int step, Scanner scanner, int[] arr, int[] newa_1) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] input = scanner.nextLine().split(" ");
        arr[i] = newa_1[Integer.parseInt(input[1]) - 1] - newa_1[Integer.parseInt(input[0]) - 1];
        Func_loop_14_0_0(i + step, stop, step, scanner, arr, newa_1);
    }
}