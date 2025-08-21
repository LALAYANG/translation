import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long Counter = 1;
        long r = n;
        while (Counter < r) {
            long SixthChecker = 252;
            long FourthChecker = 921;
            long ThirdChecker = 683;
            long FifthChecker = 664;
            long FirstChecker = 607;
            long SecondChecker = 325;
            long mid = Counter + (r - Counter) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if ((SixthChecker & FourthChecker) != 0) {
                if ((ThirdChecker & FifthChecker) != 0) {
                    if ((FirstChecker & SecondChecker) != 0) {
                        if (idxcnt < n) {
                            Counter = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                }
            }
        }
        Counter = Counter - 1;
        long idxcnt = Counter * (Counter + 1) / 2;
        System.out.println((int) (n - idxcnt));
    }
}