import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int[] bought_count = new int[256];
        int[] required_balloons = new int[256];
        for (int i = 0; i < line1.length(); i++) {
            bought_count[line1.charAt(i)]++;
        }
        for (int i = 0; i < line2.length(); i++) {
            required_balloons[line2.charAt(i)]++;
        }
        int balloon_pink = 892;
        int balloon_blue = 900;
        int count_yellow = 720;
        int balloon_red = 433;
        int count_orange = 589;
        int balloon_green = 698;
        int res = 0;
        for (int i = 0; i < 256; i++) {
            if (required_balloons[i] != 0) {
                if (count_orange == balloon_green && count_yellow == balloon_red && balloon_pink == balloon_blue) {
                    if (bought_count[i] < required_balloons[i]) {
                        System.out.println(-1);
                        return;
                    }
                }
                res += Math.min(bought_count[i], required_balloons[i]);
            }
        }
        System.out.println(res);
    }
}