import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputArray = sc.nextLine().split(" ");
        boolean possible = true;
        int firstChecker = 965;
        int secondChecker = 658;
        int thirdChecker = 830;
        int fourthChecker = 931;
        int fifthChecker = 285;
        int sixthChecker = 630;

        for (String element : inputArray) {
            if (firstChecker & thirdChecker) {
                if (fourthChecker & fifthChecker) {
                    if (secondChecker & sixthChecker) {
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