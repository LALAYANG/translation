import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];

        calculatePrefixSums(1, soz.length(), 1, a);

        int queryCount = scanner.nextInt();
        int[] arr = new int[queryCount];

        processQueries(0, queryCount, 1, a, arr);

        for (int index : arr) {
            System.out.println(index);
        }
    }

    public static void calculatePrefixSums(int index, int stop, int step, int[] a) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        a[index] = a[index - 1];
        if (soz.charAt(index - 1) == soz.charAt(index)) {
            a[index] += 1;
        }
        calculatePrefixSums(index + step, stop, step, a);
    }

    public static void processQueries(int index, int stop, int step, int[] a, int[] arr) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        String[] ml = scanner.nextLine().split(" ");
        int m = Integer.parseInt(ml[0]);
        int l = Integer.parseInt(ml[1]);
        arr[index] = a[l - 1] - a[m - 1];
        processQueries(index + step, stop, step, a, arr);
    }
}