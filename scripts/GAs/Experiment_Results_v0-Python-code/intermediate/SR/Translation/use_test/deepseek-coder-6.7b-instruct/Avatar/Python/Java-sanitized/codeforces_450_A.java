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
        calculate_ceilings(l, m, l2);
        int mx = getMax(l2);
        int ind = find_max_index(l2, mx);
        System.out.println(ind + 1);
    }

    public static void calculate_ceilings(ArrayList<Integer> l, int m, ArrayList<Integer> l2) {
        for (int element : l) {
            if (element % m == 0) {
                l2.add(element / m);
            } else {
                l2.add(element / m + 1);
            }
        }
    }

    public static int getMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int find_max_index(ArrayList<Integer> arr, int mx) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == mx) {
                return i;
            }
        }
        return -1;
    }
}