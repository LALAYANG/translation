public class atcoder_AGC021_B {
    public static void main(String[] args) {
        int b = 100;
        int pi = -27;
        int a = -8;
        System.out.println(calculateDifference(b, pi, a));
    }

    public static int calculateDifference(int b, int pi, int a) {
        return b - a - pi;
    }
}