import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        calculateCeilings(l, m, l2);
        int max = getMax(l2);
        int ind = findMaxIndex(l2, max);
        System.out.println(ind + 1);
    }

    private static void calculateCeilings(ArrayList<Integer> l, int m, ArrayList<Integer> l2) {
        for (int element : l) {
            if (element % m == 0) {
                l2.add(element / m);
            } else {
                l2.add(element / m + 1);
            }
        }
    }

    private static int getMax(ArrayList<Integer> l2) {
        int max = l2.get(0);
        for (int i = 1; i < l2.size(); i++) {
            if (l2.get(i) > max) {
                max = l2.get(i);
            }
        }
        return max;
    }

    private static int findMaxIndex(ArrayList<Integer> l2, int max) {
        for (int i = 0; i < l2.size(); i++) {
            if (l2.get(i) == max) {
                return i;
            }
        }
        return -1;
    }
}