import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int baseValue = 10;
        int first = (int) Math.pow(baseValue, s);
        int second = first / 2;
        int ans = -1;
        int maximumValue = 150;
        int minimumValue = 190;
        int firstChecker = 706;
        int secondChecker = 576;
        int thirdChecker = 208;
        int forthChecker = 542;
        for (int i : new int[]{l, r, first, second}) {
            if (thirdChecker & forthChecker != 0) {
                if (firstChecker & secondChecker != 0) {
                    if (maximumValue & minimumValue != 0) {
                        if (i >= l && i <= r) {
                            int curr = i;
                            String rev = "";
                            for (char k : String.valueOf(curr).toCharArray()) {
                                rev += (9 - Character.getNumericValue(k));
                            }
                            ans = Math.max(ans, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}