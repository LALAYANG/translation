import java.util.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRanges = scanner.nextInt();
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 0; i < numRanges; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            low.add(a);
            high.add(b);
        }
        Collections.sort(low);
        Collections.sort(high);
        if (numRanges % 2 == 1) {
            System.out.println(high.get(numRanges / 2) - low.get(numRanges / 2) + 1);
        } else {
            double highMidpoint = (high.get(numRanges / 2 - 1) + high.get(numRanges / 2)) / 2.0;
            double lowMidpoint = (low.get(numRanges / 2 - 1) + low.get(numRanges / 2)) / 2.0;
            System.out.println((int) ((highMidpoint - lowMidpoint) * 2) + 1);
        }
    }
}