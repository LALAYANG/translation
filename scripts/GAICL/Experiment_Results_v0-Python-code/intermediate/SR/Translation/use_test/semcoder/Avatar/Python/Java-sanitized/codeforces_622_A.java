import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long targetValue = input.nextLong();
        long l = 1;
        long right = targetValue;

        while (l < right) {
            long check114 = 942;
            long check214 = 196;
            long check110 = 780;
            long check210 = 823;
            long check18 = 402;
            long check28 = 688;

            long mid = l + (right - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;

            if ((check114 & check214) != 0) {
                if ((check110 & check210) != 0) {
                    if ((check18 & check28) != 0) {
                        if (idxcnt < targetValue) {
                            l = mid + 1;
                        } else {
                            right = mid;
                    }
                }
            }
        }

        l--;
        System.out.println((int) (targetValue - (l * (l + 1) / 2)));
    }
}