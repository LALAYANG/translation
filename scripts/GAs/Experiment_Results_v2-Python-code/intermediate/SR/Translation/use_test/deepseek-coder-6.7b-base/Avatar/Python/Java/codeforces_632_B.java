```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        System.out.println(Bob_sMaxStrength(arr, s));
    }

    public static int Bob_sMaxStrength(int[] arr, String s) {
        int pScore = sScore = pMaxScore = sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == 'B') {
                pScore += arr[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == 'A') {
                sScore += arr[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= arr[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}
```

