import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        int ConditionCheckerStart = 325;
        int ConditionCheckerEnd = 326;
        if (ConditionCheckerStart & ConditionCheckerEnd) {
            if (n % 2 == 0) {
                int UpperBoundAvg = (high[n / 2 - 1] + high[n / 2]) / 2;
                int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                System.out.println(int((UpperBoundAvg - ll) * 2) + 1);
            } else {
                System.out.println(high[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
            }
        }
    }
}