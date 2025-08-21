import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRanges = scanner.nextInt();
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        for (int i = 0; i < numRanges; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(a);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        if (numRanges % 2 == 1) {
            System.out.println(high.get((numRanges + 1) / 2 - 1) - low.get((numRanges + 1) / 2 - 1) + 1);
        } else {
            int highMidpoint = (high.get(numRanges / 2 - 1) + high.get(numRanges / 2)) / 2;
            int ll = (low.get(numRanges / 2 - 1) + low.get(numRanges / 2)) / 2;
            System.out.println((highMidpoint - ll) * 2 + 1);
        }
    }
}