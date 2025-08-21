import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_items = sc.nextInt();
        int[] V = new int[num_items];
        int[] costs = new int[num_items];
        for (int i = 0; i < num_items; i++) {
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < num_items; i++) {
            costs[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int ans = 0;
        int X = 0;
        int Y = 0;
        for (int i = 0; i < num_items; i++) {
            if ((V[i] - costs[i]) > 0) {
                X = V[i];
                Y = costs[i];
                list.add(X - Y);
            }
        }
        System.out.println(Arrays.stream(list.toArray()).mapToInt(i -> (int) i).sum());
    }
}