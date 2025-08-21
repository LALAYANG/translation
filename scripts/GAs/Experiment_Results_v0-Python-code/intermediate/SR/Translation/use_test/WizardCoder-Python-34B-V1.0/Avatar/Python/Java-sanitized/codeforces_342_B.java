import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        boolean condition_18 = false;
        boolean condition_28 = false;
        boolean condition_16 = false;
        boolean condition_26 = false;
        boolean condition_14 = false;
        boolean condition_24 = false;
        if (condition_18 && condition_28) {
            if (condition_16 && condition_26) {
                if (condition_14 && condition_24) {
                    int d;
                    char c;
                    if (s < f) {
                        d = 1;
                        c = 'R';
                    } else {
                        d = -1;
                        c = 'L';
                    }
                    String res = "";
                    int i = 1;
                    int current_position = s;
                    int t = scanner.nextInt();
                    int l = scanner.nextInt();
                    int r = scanner.nextInt();
                    int k = 1;
                    int loop_condition_1 = 287;
                    int loop_condition_2 = 286;
                    while (loop_condition_1 % loop_condition_2 == 1) {
                        loop_condition_1++;
                        while (current_position != f) {
                            if (i > t && k < m) {
                                t = scanner.nextInt();
                                l = scanner.nextInt();
                                r = scanner.nextInt();
                                k++;
                            }
                            if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                                res += "X";
                            } else {
                                res += c;
                                current_position += d;
                            }
                            i++;
                        }
                    }
                    System.out.println(res);
                }
            }
        }
    }
}