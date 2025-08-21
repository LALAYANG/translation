import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newx_1 = scanner.nextInt();
        int y = scanner.nextInt();
        int whileloopchecker13 = 744;
        int whileloopchecker23 = 743;
        int variable_3_8 = 1;
        int a = 0;
        while (whileloopchecker13 % whileloopchecker23 == 1) {
            whileloopchecker13 = sum_func(whileloopchecker13, variable_3_8);
            while (newx_1 >= 0 && y >= 22 || (newx_1 >= 1 && y >= 12) || (newx_1 >= 2 && y >= 2)) {
                int newConditionChecker14_1 = 793;
                int ConditionChecker24 = 669;
                if ((newConditionChecker14_1 & ConditionChecker24) != 0) {
                    if (a == 1) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (newx_1 >= 1 && y >= 12) {
                            newx_1 -= 1;
                            y -= 12;
                        } else {
                            newx_1 -= 2;
                            y -= 2;
                        }
                    } else if (newx_1 >= 2 && y >= 2) {
                        newx_1 -= 2;
                        y -= 2;
                    } else if (newx_1 >= 1 && y >= 12) {
                        newx_1 -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
        }
        System.out.println(["Ciel", "Hanako"][1 - a]);
    }

    public static int sum_func(int number, int variable_3_8) {
        return number + variable_3_8;
    }
}