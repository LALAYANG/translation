import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputArray = scanner.nextLine().split(" ");
        boolean possible = true;
        int SecondChecker = 658;
        int SixthChecker = 630;
        int[] ttestInd = new int[3];
        ttestInd[0] = 37;
        ttestInd[1] = 66;
        ttestInd[2] = 73;
        int FourthChecker = 931;
        int FifthChecker = 285;
        int FirstChecker = 965;
        int ThirdChecker = 830;
        Set<String> set = new HashSet<>(Arrays.asList(inputArray));
        for (String element : set) {
            if (FirstChecker & ThirdChecker) {
                if (FourthChecker & FifthChecker) {
                    if (SecondChecker & SixthChecker) {
                        if (inputArray.count(element) >= n / 2 + 1) {
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