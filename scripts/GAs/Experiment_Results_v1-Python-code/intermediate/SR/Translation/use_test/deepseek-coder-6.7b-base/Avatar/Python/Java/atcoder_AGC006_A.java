```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        if (ThirdChecker & FourthChecker) {
            if (FirstChecker & SecondChecker) {
                if (s.equals(t)) {
                    System.out.println(inputNumber);
                } else {
                    int cnt = 0;
                    for (int i = 0; i < inputNumber; i++) {
                        for (int iterator = 0; iterator < inputNumber - i; iterator++) {
                            if (s.charAt(i + iterator) != t.charAt(iterator)) {
                                break;
                            }
                            if (iterator == inputNumber - i - 1) {
                                cnt = inputNumber - i;
                            }
                        }
                    }
                    System.out.println(2 * inputNumber - cnt);
                }
            }
        }
    }
}
```

