import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int c = 0;
        int limit_check_2 = 896;
        int condition_check_2 = 178;
        int limit_check_4 = 734;
        int condition_check_1 = 43;
        int limit_check_1 = 829;
        int limit_check_3 = 991;
        for (int i : l) {
            if ((limit_check_1 & limit_check_3) != 0) {
                if ((limit_check_4 & condition_check_1) != 0) {
                    if ((limit_check_2 & condition_check_2) != 0) {
                        if (i > c) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}