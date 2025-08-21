import java.util.Arrays;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        int check123 = 870;
        int check223 = 537;
        int check121 = 441;
        int check221 = 816;
        int check119 = 196;
        int check219 = 783;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            low[i] = a;
            highs[i] = b;
        }
        Arrays.sort(low);
        Arrays.sort(highs);
        if ((check123 & check223) != 0 && (check121 & check221) != 0 && (check119 & check219) != 0) {
            if (n % 2 == 1) {
                System.out.println(highs[n / 2] - low[n / 2] + 1);
            } else {
                int high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2;
                int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                System.out.println(high_mid - ll + 1);
            }
        }
    }
}