import java.util.Scanner;

public class codeforces_313_B {
    static int[] a;
    static String soz;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soz = scanner.nextLine();
        a = new int[soz.length() + 1];

        calculatePrefixSums(1, soz.length(), 1);
        int queryCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < queryCount; i++) {
            String[] query = scanner.nextLine().split(" ");
            int m = Integer.parseInt(query[0]);
            int l = Integer.parseInt(query[1]);
            System.out.println(a[l - 1] - a[m - 1]);
        }
    }

    public static void calculatePrefixSums(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        a[index] = a[index - 1];
        if (soz.charAt(index - 1) == soz.charAt(index)) {
            a[index] += 1;
        }
        calculatePrefixSums(index + step, stop, step);
    }
}