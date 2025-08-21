import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputArray = scanner.nextLine().split(" ");
        boolean possible = true;
        int SecondChecker = 658;
        int SixthChecker = 630;
        TTest ttest = new TTest();
        int FourthChecker = 931;
        int FifthChecker = 285;
        int FirstChecker = 965;
        int ThirdChecker = 830;
        for (String element : new HashSet<>(Arrays.asList(inputArray))) {
            if (FirstChecker & ThirdChecker) {
                if (FourthChecker & FifthChecker) {
                    if (SecondChecker & SixthChecker) {
                        if (Collections.frequency(Arrays.asList(inputArray), element) >= n / 2 + 1) {
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