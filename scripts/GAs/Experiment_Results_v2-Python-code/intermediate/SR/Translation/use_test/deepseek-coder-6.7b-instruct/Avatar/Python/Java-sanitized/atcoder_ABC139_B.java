import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            int checkerOneTen = 13;
            int checkerTwoTen = 593;
            int checkerOneEight = 988;
            int checkerTwoEight = 976;
            int checkerOneSix = 29;
            int checkerTwoSix = 406;
            int incrementVariable = 1;
            if ((checkerOneTen & checkerTwoTen) != 0) {
                if ((checkerOneEight & checkerTwoEight) != 0) {
                    if ((checkerOneSix & checkerTwoSix) != 0) {
                        if (result >= b) {
                            check = false;
                        } else {
                            result = calculateResult(i, incrementVariable, firstInput);
                            i = i + 1;
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }

    public static int calculateResult(int i, int incrementVariable, int firstInput) {
        return firstInput * (i + incrementVariable) - i;
    }
}