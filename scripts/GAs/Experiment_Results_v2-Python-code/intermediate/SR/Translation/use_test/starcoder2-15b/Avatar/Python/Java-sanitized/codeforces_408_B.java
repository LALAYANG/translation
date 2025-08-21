import java.util.*;
import java.io.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        for (int i = 0; i < t; i++) {
            calculateScore(sc);
        }
    }

    public static void calculateScore(Scanner sc) {
        String line = sc.nextLine();
        Map<Character, Integer> bought_count = new HashMap<>();
        for (char c : line.toCharArray()) {
            bought_count.put(c, bought_count.getOrDefault(c, 0) + 1);
        }
        line = sc.nextLine();
        Map<Character, Integer> made_cout = new HashMap<>();
        for (char c : line.toCharArray()) {
            made_cout.put(c, made_cout.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;
        for (char color : made_cout.keySet()) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if ((secondChecker & fifthChecker) != 0) {
                        if (!bought_count.containsKey(color)) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(bought_count.get(color), made_cout.get(color));
        }
        System.out.println(res);
    }
}