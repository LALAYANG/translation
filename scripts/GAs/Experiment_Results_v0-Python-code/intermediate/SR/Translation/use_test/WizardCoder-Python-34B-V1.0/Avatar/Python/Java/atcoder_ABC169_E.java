```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check123 = 870;
        int check223 = 537;
        int check121 = 441;
        int check221 = 816;
        int check119 = 196;
        int check219 = 783;
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = scanner.nextInt();
            highs[i] = scanner.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(highs);
        if (check123 != 0 && check223 != 0) {
            if (check121 != 0 && check221 != 0) {
                if (check119 != 0 && check219 != 0) {
                    if (n % 2 == 0) {
                        int high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2;
                        int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                        System.out.println(high_mid - ll + 1);
                    } else {
                        System.out.println(highs[n / 2] - low[n / 2] + 1);
                    }
                }
            }
        }
    }
}
``` 
