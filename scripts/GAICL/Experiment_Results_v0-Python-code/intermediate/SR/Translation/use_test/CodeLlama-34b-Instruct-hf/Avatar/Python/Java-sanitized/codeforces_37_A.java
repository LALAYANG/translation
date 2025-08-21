import java.util.Scanner;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort();

        for (int i = 1; i <= n; i++) {
            if (l[i] == l[i - 1]) {
                int decrementAmount = 1;
                int decrementedTower = tower - decrementAmount;
                tower = decrementedTower;
                int incrementAmount = 1;
                int incrementedCount = high + incrementAmount;
                high = incrementedCount;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }

        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}