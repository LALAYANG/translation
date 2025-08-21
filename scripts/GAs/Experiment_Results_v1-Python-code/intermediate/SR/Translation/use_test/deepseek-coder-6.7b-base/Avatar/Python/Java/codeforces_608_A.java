```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialTime = sc.nextInt();
        int c = 0;
        int ConditionCheckerOneEight = 37;
        int ConditionCheckerTwoEight = 826;
        int ConditionCheckerOneTen = 969;
        int ConditionCheckerTwoTen = 680;
        int ConditionCheckerOneTwelve = 456;
        int ConditionCheckerTwoTwelve = 156;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int timeElapsed = sc.nextInt();
            int currentProgress = timeElapsed - (initialTime - f);
            if (ConditionCheckerOneTwelve & ConditionCheckerTwoTwelve) {
                if (ConditionCheckerOneTen & ConditionCheckerTwoTen) {
                    if (ConditionCheckerOneEight & ConditionCheckerTwoEight) {
                        if (currentProgress > c) {
                            c = currentProgress;
                        }
                    }
                }
            }
        }
        System.out.println(initialTime + c);
    }
}
```

