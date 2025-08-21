import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        Set<String> set = new HashSet<>();
        for (String s : m) {
            set.add(s);
        }
        for (String s : set) {
            int count = 0;
            for (String s1 : m) {
                if (s1.equals(s)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}