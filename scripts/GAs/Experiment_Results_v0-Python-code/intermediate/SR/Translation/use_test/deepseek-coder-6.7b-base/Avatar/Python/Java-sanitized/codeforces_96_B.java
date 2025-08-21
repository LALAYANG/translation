import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                list.add(i);
            }
        }
        list.sort(Integer::compareTo);
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= n) {
                ans = list.get(i);
                break;
            }
        }
        System.out.println(ans);
    }
}