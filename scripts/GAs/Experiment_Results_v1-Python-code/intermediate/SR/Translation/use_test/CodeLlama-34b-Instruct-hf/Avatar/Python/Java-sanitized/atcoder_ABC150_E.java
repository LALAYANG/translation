import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 10;
        int addend = 7;
        int exponent = 9;
        int result = computeFunction(base, addend, exponent);
        System.out.println(result);
    }

    public static int computeFunction(int base, int addend, int exponent) {
        return (int) Math.pow(base, exponent) + addend;
    }
}