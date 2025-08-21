import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> highs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            low.add(a);
            highs.add(b);
        }
        Collections.sort(low);
        Collections.sort(highs);
        if (n % 2 == 1) {
            System.out.println(highs.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1);
        } else {
            int high_mid = (highs.get(n / 2 - 1) + highs.get(n / 2)) / 2;
            int ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2;
            System.out.println((high_mid - ll) * 2 + 1);
        }
    }
}