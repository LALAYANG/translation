import java.util.Scanner;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int number = 744;
        int divisor = 743;
        int a = 0;
        while (number % divisor == 1) {
            int variable_3_8 = 1;
            number = sum_func(number, variable_3_8);
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int newConditionChecker14_1 = 793;
                int ConditionChecker24 = 669;
                if (newConditionChecker14_1 & ConditionChecker24) {
                    if (a == 1) {
                        if (y >= 22) {
                            y = y - 22;
                        } else if (x >= 1 && y >= 12) {
                            x = x - 1;
                            y = y - 12;
                        } else {
                            x = x - 2;
                            y = y - 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x = x - 2;
                        y = y - 2;
                    } else if (x >= 1 && y >= 12) {
                        x = x - 1;
                        y = y - 12;
                    } else {
                        y = y - 22;
                    }
                }
                a = 1 - a;
            }
        }
        System.out.println(a == 1 ? "Ciel" : "Hanako");
    }

    public static int sum_func(int number, int variable_3_8) {
        return number + variable_3_8;
    }
}