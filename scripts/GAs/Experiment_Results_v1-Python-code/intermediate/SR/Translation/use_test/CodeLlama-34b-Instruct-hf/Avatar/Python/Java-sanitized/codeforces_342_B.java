import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stepsCount = sc.nextInt();
        int totalTime = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        if (s < f) {
            int d = 1;
            String directionIndicator = "R";
        } else {
            int d = -1;
            String directionIndicator = "L";
        }

        String res = "";
        int i = 1;
        int j = s;
        int t = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = 1;

        while (k < totalTime) {
            if (i > t && k < totalTime) {
                t = sc.nextInt();
                l = sc.nextInt();
                r = sc.nextInt();
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += directionIndicator;
                j += d;
            }
            i++;
        }

        System.out.println(res);
    }
}