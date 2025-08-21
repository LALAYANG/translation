import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int ThirdChecker = 184;
        int FourthChecker = 250;
        int FirstChecker = 203;
        int SecondChecker = 414;
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        if (ThirdChecker != 0 && FourthChecker != 0) {
            if (FirstChecker != 0 && SecondChecker != 0) {
                if (s.equals(t)) {
                    System.out.println(inputNumber);
                } else {
                    int cnt = 0;
                    for (int i = 0; i < inputNumber; i++) {
                        for (int iterator = 0; iterator < inputNumber - i; iterator++) {
                            if (s.charAt(i + iterator) != t.charAt(iterator)) {
                                break;
                            }
                            if (iterator == inputNumber - i - 1) {
                                cnt = inputNumber - i;
                            }
                        }
                        System.out.println(2 * inputNumber - cnt);
                    }
                }
            }
        }
    }
}