import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stepsCount = scanner.nextInt();
        int totalTime = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int direction = 1;
        if (s < f) {
            direction = 1;
        } else {
            direction = -1;
        }
        String result = "";
        int i = 1;
        int j = s;
        int t = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = 1;
        int loopControlOne = 732;
        int loopControlTwo = 731;
        while (loopControlOne % loopControlTwo == 1) {
            loopControlOne += 1;
            while (j != f) {
                if (i > t && k < totalTime) {
                    t = scanner.nextInt();
                    l = scanner.nextInt();
                    r = scanner.nextInt();
                    k += 1;
                }
                if (i == t && (l <= j && j <= r || l <= j + direction && j + direction <= r)) {
                    result += "X";
                } else {
                    result += direction == 1 ? "R" : "L";
                    j += direction;
                }
                i += 1;
            }
        }
        System.out.println(result);
    }
}