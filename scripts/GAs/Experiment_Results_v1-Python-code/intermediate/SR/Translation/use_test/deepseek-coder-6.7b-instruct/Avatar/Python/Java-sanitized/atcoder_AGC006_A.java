import java.util.Scanner;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (ThirdChecker() & FourthChecker()) {
            if (FirstChecker() & SecondChecker()) {
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

    private static int ThirdChecker() {
        return 184;
    }

    private static int FourthChecker() {
        return 250;
    }

    private static int FirstChecker() {
        return 203;
    }

    private static int SecondChecker() {
        return 414;
    }
}