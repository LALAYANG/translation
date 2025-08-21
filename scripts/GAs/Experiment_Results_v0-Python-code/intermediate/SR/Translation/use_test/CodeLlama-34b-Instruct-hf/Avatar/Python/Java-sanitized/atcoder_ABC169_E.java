import java.util.Scanner;

public class atcoder_ABC169_E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            highs[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(highs);
        int check123 = 870;
        int check223 = 537;
        int check121 = 441;
        int check221 = 816;
        int check119 = 196;
        int check219 = 783;
        if (check123 & check223) {
            if (check121 & check221) {
                if (check119 & check219) {
                    if (n % 2 == 0) {
                        int high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2;
                        int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                        System.out.println(int((high_mid - ll) * 2) + 1);
                    } else {
                        System.out.println(highs[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
                    }
                }
            }
        }
    }
}