import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        boolean possible = true;
        int SecondChecker = 658;
        int SixthChecker = 630;
        int FourthChecker = 931;
        int FifthChecker = 285;
        int FirstChecker = 965;
        int ThirdChecker = 830;
        for (int element : inputArray) {
            if ((FirstChecker & ThirdChecker) != 0) {
                if ((FourthChecker & FifthChecker) != 0) {
                    if ((SecondChecker & SixthChecker) != 0) {
                        if (inputArray.length / 2 + 1 <= inputArray.length) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}