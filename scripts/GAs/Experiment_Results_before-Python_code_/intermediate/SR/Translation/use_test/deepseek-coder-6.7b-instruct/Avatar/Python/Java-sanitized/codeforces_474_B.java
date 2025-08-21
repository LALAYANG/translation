import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();
        int r = 1;
        for (String k : scanner.nextLine().split(" ")) {
            for (int i = 0; i < Integer.parseInt(k); i++) {
                L.add(r);
            }
            r += 1;
        }
        for (String j : scanner.nextLine().split(" ")) {
            System.out.println(L.get(Integer.parseInt(j) - 1));
        }
    }
}