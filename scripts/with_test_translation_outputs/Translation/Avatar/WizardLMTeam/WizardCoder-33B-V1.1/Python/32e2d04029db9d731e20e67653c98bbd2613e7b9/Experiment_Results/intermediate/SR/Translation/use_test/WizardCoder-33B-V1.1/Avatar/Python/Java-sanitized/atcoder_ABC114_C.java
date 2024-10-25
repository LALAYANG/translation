import java.util.HashSet;

public class atcoder_ABC114_C {
    static int N;
    static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        HashSet<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (!set.contains('7') || !set.contains('5') || !set.contains('3')) {
            ans = 0;
        }
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i);
        }
        return ans;
    }

    public static void main(String[] args) {
        N = 777777752;
        System.out.println(aaa("0"));
    }
}