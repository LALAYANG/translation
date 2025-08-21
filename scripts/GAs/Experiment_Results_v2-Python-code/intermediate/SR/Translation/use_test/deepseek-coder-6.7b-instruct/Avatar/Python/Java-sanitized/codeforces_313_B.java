import java.util.Scanner;
import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_313_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];
        calculatePrefixSums(soz, a, 1, soz.length(), 1);
        int queryCount = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        processQueries(scanner, a, arr, queryCount, 0, 1);
        for (int index : arr) {
            System.out.println(index);
        }
    }

    public static void calculatePrefixSums(String soz, int[] a, int index, int stop, int step) {
        TTest tTest = new TTest();
        tTest.tTest(new double[]{8, 10, 71}, new double[]{42, 5, 10});
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        a[index] = a[index - 1];
        if (soz.charAt(index - 1) == soz.charAt(index)) {
            a[index] += 1;
        }
        calculatePrefixSums(soz, a, index + step, stop, step);
    }

    public static void processQueries(Scanner scanner, int[] a, ArrayList<Integer> arr, int queryCount, int index, int step) {
        if (step == 0 || (step > 0 && index >= queryCount) || (step < 0 && index <= queryCount)) {
            return;
        }
        String[] ml = scanner.nextLine().split(" ");
        int m = Integer.parseInt(ml[0]) - 1;
        int l = Integer.parseInt(ml[1]) - 1;
        arr.add(a[l] - a[m]);
        processQueries(scanner, a, arr, queryCount, index + step, step);
    }
}