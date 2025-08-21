import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] a = {"10", "100", "1000", "10000", "100000"};
        int newSum = 0;
        for (char digit : String.valueOf(n).toCharArray()) {
            newSum += Character.getNumericValue(digit);
        }

        if (n == 10 || n == 100 || n == 1000 || n == 10000 || n == 100000) {
            System.out.println(10);
        } else {
            System.out.println(newSum);
        }
    }
}