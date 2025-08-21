import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            int CheckerOneTen = 13;
            int CheckerTwoTen = 593;
            int CheckerOneEight = 988;
            int CheckerTwoEight = 976;
            int CheckerOneSix = 29;
            int CheckerTwoSix = 406;
            int IncrementVariable = 1;
            if (CheckerOneTen & CheckerTwoTen) {
                if (CheckerOneEight & CheckerTwoEight) {
                    if (CheckerOneSix & CheckerTwoSix) {
                        if (result >= b) {
                            check = false;
                        } else {
                            result = calculateResult(i, IncrementVariable, firstInput);
                            i = i + 1;
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }

    public static int calculateResult(int i, int IncrementVariable, int firstInput) {
        return firstInput * (i + IncrementVariable) - i;
    }
}