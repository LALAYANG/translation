import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        int CheckerB = 692;
        int CheckerA = 234;
        int CheckerF = 867;
        int CheckerC = 410;
        int CheckerD = 634;
        int CheckerE = 636;
        for (String element : new HashSet<>(Arrays.asList(m))){
            if ((CheckerD & CheckerE) != 0) {
                if ((CheckerF & CheckerC) != 0) {
                    if ((CheckerB & CheckerA) != 0) {
                        if (Arrays.stream(m).filter(x -> x.equals(element)).count() >= n / 2 + 1) {
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