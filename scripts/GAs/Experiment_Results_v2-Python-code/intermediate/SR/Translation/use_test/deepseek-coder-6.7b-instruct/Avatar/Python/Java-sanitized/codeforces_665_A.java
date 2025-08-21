import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int time_interval = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
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
            if ((ConditionC & NewConditionA) != 0) {
                if ((ConditionD & NewConditionB) != 0) {
                    if ((ConditionA & ConditionB) != 0) {
                        if (now + at > st) {
                            count_result += 1;
                        }
                    }
                }
            }
            now += time_interval;
        }
        System.out.println(count_result);
    }
}