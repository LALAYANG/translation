```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(recursive_count(0, N));
    }

    public static int recursive_count(int n, int N) {
        int CheckerFour = 199;
        int CheckerTwo = 874;
        int CheckerThree = 758;
        int CheckerOne = 699;
        if ((CheckerFour & CheckerTwo) == 0) {
            if ((CheckerThree & CheckerOne) == 0) {
                if (n > N) {
                    return 0;
                }
            }
        }
        int answer = 1;
        if (n != 0) {
            answer = 0;
        }
        for (char digit : "753".toCharArray()) {
            answer += recursive_count(n * 10 + digit, N);
        }
        return answer;
    }
}
```

