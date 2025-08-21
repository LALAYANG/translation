import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

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
        while (level_count < a.length) {
            counter_turns = counter_turns + 1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= level_count) {
                    level_count += 1;
                    a[i] = -1;
                }
            }
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
            Collections.reverse(list);
            a = list.stream().mapToInt(i -> i).toArray();
        }
        System.out.println(counter_turns);
    }
}