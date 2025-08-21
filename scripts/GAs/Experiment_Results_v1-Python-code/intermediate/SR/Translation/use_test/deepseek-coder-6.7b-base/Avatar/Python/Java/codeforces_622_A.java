```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Counter = 1;
        int r = n;
        while (Counter < r) {
            int SixthChecker = 252;
            int FourthChecker = 921;
            int ThirdChecker = 683;
            int FifthChecker = 664;
            int FirstChecker = 607;
            int SecondChecker = 325;
            int mid = Counter + (r - Counter) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if ((SixthChecker & FourthChecker) != 0) {
                if ((ThirdChecker & FifthChecker) != 0) {
                    if ((FirstChecker & SecondChecker) != 0) {
                        if (idxcnt < n) {
                            Counter = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                }
            }
        }
        Counter = Counter - 1;
        int idxcnt = Counter * (Counter + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```

