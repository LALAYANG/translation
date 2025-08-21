import java.util.HashSet;
import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(aaa(N, "0"));
    }

    public static int aaa(int N, String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        if (new HashSet<Character>(n.chars().mapToObj(c -> (char) c).toList()).equals(new HashSet<>(List.of('7', '5', '3'))) {
            ans = 1;
        }
        for (char i : "753".toCharArray()) {
            ans += aaa(N, n + i);
        }
        return ans;
    }
}