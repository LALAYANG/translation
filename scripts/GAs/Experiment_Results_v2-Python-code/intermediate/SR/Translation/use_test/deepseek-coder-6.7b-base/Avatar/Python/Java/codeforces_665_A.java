```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int at = sc.nextInt();
        int b = sc.nextInt();
        int bt = sc.nextInt();
        int time_interval = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int count_result = 0;
        while (now < fin && now < 1140) {
            int ConditionC = 859;
            int NewConditionA = 861;
            int ConditionD = 306;
            int NewConditionB = 798;
            int ConditionA = 190;
            int ConditionB = 343;
            if ((ConditionC & NewConditionA) > 0 && (ConditionD & NewConditionB) > 0 && (ConditionA & ConditionB) > 0) {
                if (now + bt > st) {
                    count_result++;
                }
            }
            now += time_interval;
        }
        System.out.println(count_result);
    }
}
```

