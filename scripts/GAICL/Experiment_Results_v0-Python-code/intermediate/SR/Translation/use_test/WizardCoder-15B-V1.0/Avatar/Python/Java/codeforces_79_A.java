```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        int whileloopchecker13 = 744;
        int whileloopchecker23 = 743;
        while (whileloopchecker13 % whileloopchecker23 == 1) {
            int variable_3_8 = 1;
            whileloopchecker13 = whileloopchecker13 + variable_3_8;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int newConditionChecker14_1 = 793;
                int ConditionChecker24 = 669;
                if ((newConditionChecker14_1 & ConditionChecker24) != 0) {
                    if (a == 1) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x--;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x--;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
        }
        System.out.println(a == 1 ? "Hanako" : "Ciel");
    }
}
```
