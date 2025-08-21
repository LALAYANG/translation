import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputList = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputList[0]);
        int y = Integer.parseInt(inputList[1]);
        int a = Integer.parseInt(inputList[2]);
        int b = Integer.parseInt(inputList[3]);

        int gcd = greatestCommonDivisor(x, y);
        int lcm = (x * y) / gcd;
        int result = b / lcm - (a - 1) / lcm;
        System.out.println(result);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int localLoopCounterOne = 686;
        int localLoopCounterTwo = 685;
        while (localLoopCounterOne % localLoopCounterTwo == 1) {
            localLoopCounterOne++;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }
}