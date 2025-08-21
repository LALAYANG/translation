import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] items = line.split(" ");
        int[] counts = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            counts[i] = Integer.parseInt(items[i]);
        }
        line = scanner.nextLine();
        items = line.split(" ");
        int[] made = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            made[i] = Integer.parseInt(items[i]);
        }
        int res = 0;
        for (int i = 0; i < items.length; i++) {
            if (counts[i] % 3 == 0) {
                return -1;
            }
            int min = Math.min(counts[i], made[i]);
            res += min;
        }
        System.out.println(res);
    }
}