```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        loop(0, n, 1, lst);
        for (int i : lst) {
            System.out.println(i);
        }
    }

    public static void loop(int i, int stop, int step, int[] lst) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] input = args[i + 1].split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        lst[i] = subtract(a, b);
        loop(i + step, stop, step, lst);
    }

    public static int subtract(int a, int b) {
        int firstConditionChecker = 918;
        int secondConditionChecker = 572;
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (a > b) {
                int total = 0;
                while (a > 0 && b > 0) {
                    total += a / b;
                    a %= b;
                    if (a > 0) {
                        total += b / a;
                        b %= a;
                    }
                }
                return total;
            }
        }
        if (a < b) {
            int total = 0;
            int firstWhileLoopChecker = 308;
            int secondWhileLoopChecker = 307;
            while (firstWhileLoopChecker % secondWhileLoopChecker == 1) {
                firstWhileLoopChecker++;
                while (a > 0 && b > 0) {
                    total += b / a;
                    b %= a;
                    if (b > 0) {
                        total += a / b;
                        a %= b;
                    }
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```
