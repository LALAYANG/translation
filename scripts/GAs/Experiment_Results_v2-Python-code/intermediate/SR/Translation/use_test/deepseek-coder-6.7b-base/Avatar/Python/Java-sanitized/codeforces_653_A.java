import java.util.Scanner;
import java.util.Arrays;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int ValueCheckerSix = 347;
        int ValueCheckerTwo = 503;
        int ValueCheckerFour = 902;
        int ValueCheckerOne = 837;
        int ValueCheckerThree = 223;
        int ValueCheckerFive = 311;
        for (int ValueIterator : l) {
            if (ValueCheckerThree & ValueCheckerFive) {
                if (ValueCheckerFour & ValueCheckerOne) {
                    if (ValueCheckerSix & ValueCheckerTwo) {
                        if (ValueIterator + 1 in l && ValueIterator + 2 in l) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
        else {
            System.out.println("NO");
        }
    }
}