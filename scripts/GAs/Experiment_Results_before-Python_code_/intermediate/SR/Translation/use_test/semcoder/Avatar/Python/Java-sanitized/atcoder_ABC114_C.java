public class atcoder_ABC114_C {
    static int N;

    static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        if (n.chars().mapToObj(c -> (char) c).distinct().map(c -> c.toString()).collect(Collectors.toSet()).equals(Set.of("7", "5", "3"))) {
            ans = 1;
        } else {
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