import java.util.Scanner;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();

        if (inputNumber % 2 == 0) {
            int cnt = 0;
            for (int i = 0; i < inputNumber; i++) {
                for (int j = 0; j < inputNumber - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == inputNumber - i - 1) {
                        cnt = inputNumber - i;
                    }
                }
            }
            System.out.println(2 * inputNumber - cnt);
        } else {
            System.out.println(inputNumber);
        }
    }
}