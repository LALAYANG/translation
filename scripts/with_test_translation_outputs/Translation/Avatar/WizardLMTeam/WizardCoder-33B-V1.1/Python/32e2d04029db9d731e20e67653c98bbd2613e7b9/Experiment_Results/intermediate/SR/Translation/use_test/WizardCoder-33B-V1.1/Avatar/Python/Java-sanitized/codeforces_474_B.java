import java.util.*;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int r = 1;
        for (String k : scanner.nextLine().split(" ")) {
            for (int i = 0; i < Integer.parseInt(k); i++) {
                list.add(r);
            }
            r++;
        }
        scanner.nextLine();
        for (String j : scanner.nextLine().split(" ")) {
            System.out.println(list.get(Integer.parseInt(j) - 1));
        }
    }
}