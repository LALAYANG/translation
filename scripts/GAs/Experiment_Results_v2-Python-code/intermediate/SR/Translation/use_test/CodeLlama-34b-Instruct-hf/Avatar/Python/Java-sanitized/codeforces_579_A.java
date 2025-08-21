import java.util.concurrent.ThreadLocalRandom;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int calculationResult = 1;
        int loopCounterOuter = 74;
        int loopBoundOuter = 73;
        while (loopCounterOuter % loopBoundOuter == 1) {
            loopCounterOuter++;
            while (Math.log2(n) % 1 != 0) {
                int operand = 1;
                calculationResult = calculation(operand, calculationResult);
                n -= Math.pow(2, (int) Math.log2(n));
            }
        }
        System.out.println(calculationResult);
    }

    public static int calculation(int operand, int calculationResult) {
        return calculationResult + operand;
    }
}