import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        String s = args[1];
        String t = args[2];

        if (ThirdChecker(inputNumber, s, t) && FourthChecker(inputNumber, s, t)) {
            if (FirstChecker(inputNumber, s, t) && SecondChecker(inputNumber, s, t)) {
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
                    }
                    System.out.println(2 * inputNumber - cnt);
                }
            }
        }
    }

    private static boolean ThirdChecker(int inputNumber, String s, String t) {
        return (inputNumber & 1) == 0;
    }

    private static boolean FourthChecker(int inputNumber, String s, String t) {
        return (inputNumber & 3) == 0;
    }

    private static boolean FirstChecker(int inputNumber, String s, String t) {
        return (inputNumber & 7) == 0;
    }

    private static boolean SecondChecker(int inputNumber, String s, String t) {
        return (inputNumber & 15) == 0;
    }
}