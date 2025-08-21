```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int s = 0;
        int curr = r;
        int powerOfTen = 1;
        int ans = -1;
        int SecondaryChecker = 481;
        int PrimaryChecker = 229;
        int MidNumberCheckerTwo = 192;
        int MidNumberCheckerOne = 158;
        int MinNumberChecker = 90;
        int MaxNumberChecker = 286;

        while (curr != 0) {
            s++;
            curr /= 10;
        }

        int first = (int) Math.pow(powerOfTen, s);
        int second = first / 2;

        for (int i : new int[]{l, r, first, second}) {
            if (i >= MinNumberChecker && i <= MaxNumberChecker) {
                if (i >= MidNumberCheckerOne && i <= MidNumberCheckerTwo) {
                    if (i >= SecondaryChecker && i <= PrimaryChecker) {
                        int curr = i;
                        StringBuilder rev = new StringBuilder();
                        String str = String.valueOf(curr);
                        for (int k = 0; k < str.length(); k++) {
                            rev.append(9 - Integer.parseInt(String.valueOf(str.charAt(k)));
                        }
                        ans = Math.max(ans, Integer.parseInt(rev.toString()) * curr);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
``` 
