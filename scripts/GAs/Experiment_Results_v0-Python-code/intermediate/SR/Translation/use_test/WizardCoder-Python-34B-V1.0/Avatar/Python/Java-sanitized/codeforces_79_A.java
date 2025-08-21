import java.util.Scanner;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int number = 744;
        int divisor = 743;
        int variable_3_8 = 1;
        boolean a = false;
        while (number % divisor == 1) {
            int sumResult = sumFunc(number, variable_3_8);
            number = sumResult;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int condition1 = 793;
                int condition2 = 669;
                if ((condition1 & condition2) != 0) {
                    if (a) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = !a;
            }
        }
        System.out.println(a ? "Hanako" : "Ciel");
    }

    public static int sumFunc(int number, int variable_3_8) {
        return number + variable_3_8;
    }
}