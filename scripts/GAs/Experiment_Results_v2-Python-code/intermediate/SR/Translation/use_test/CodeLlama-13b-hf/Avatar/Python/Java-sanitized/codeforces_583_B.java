import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int current_level = 0;
        int level_count = 0;
        int counter_turns = -1;
        while (level_count < n) {
            counter_turns = counter_turns + 1;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= current_level) {
                    level_count += 1;
                    a[i] = -1;
                }
            }
            Arrays.sort(a);
            Arrays.sort(a);
        }
        System.out.println(counter_turns);
    }
}