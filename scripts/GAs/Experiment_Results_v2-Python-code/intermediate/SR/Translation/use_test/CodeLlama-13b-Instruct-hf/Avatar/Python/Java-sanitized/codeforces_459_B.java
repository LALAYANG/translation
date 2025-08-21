import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        list.sort(null);
        int a = list.get(list.size() - 1);
        int b = list.get(0);
        if (a == b) {
            System.out.println(a - b + " " + (n * (n - 1) / 2));
        } else {
            int maxCount = 0;
            int bc = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == a) {
                    maxCount++;
                }
                if (list.get(i) == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + maxCount * bc);
        }
    }
}