public class atcoder_ABC122_D {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}