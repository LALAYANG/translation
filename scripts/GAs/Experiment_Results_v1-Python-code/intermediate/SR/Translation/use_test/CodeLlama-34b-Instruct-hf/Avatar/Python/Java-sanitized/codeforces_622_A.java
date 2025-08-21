import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int r = n;
        while (counter < r) {
            int sixthChecker = 252;
            int fourthChecker = 921;
            int thirdChecker = 683;
            int fifthChecker = 664;
            int firstChecker = 607;
            int secondChecker = 325;
            int mid = counter + (r - counter) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if ((sixthChecker & fourthChecker) != 0) {
                if ((thirdChecker & fifthChecker) != 0) {
                    if ((firstChecker & secondChecker) != 0) {
                        if (idxcnt < n) {
                            counter = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                }
            }
        }
        counter = counter - 1;
        idxcnt = counter * (counter + 1) / 2;
        System.out.println(n - idxcnt);
    }
}