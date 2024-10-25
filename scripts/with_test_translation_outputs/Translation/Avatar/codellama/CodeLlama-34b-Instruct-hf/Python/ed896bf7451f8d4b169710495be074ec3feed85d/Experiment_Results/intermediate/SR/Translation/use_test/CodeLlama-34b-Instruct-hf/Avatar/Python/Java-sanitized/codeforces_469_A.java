import java.util.Scanner;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLevel = sc.nextInt();
        int[] x = new int[maxLevel];
        int[] y = new int[maxLevel];

        for (int i = 0; i < maxLevel; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < maxLevel; i++) {
            y[i] = sc.nextInt();
        }

        int[] z = new int[maxLevel];
        for (int i = 0; i < maxLevel; i++) {
            z[i] = x[i] + y[i];
        }

        if (z[0] == 0) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}