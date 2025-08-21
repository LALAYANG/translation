public class codeforces_231_A {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 131 == 0) {
                sum += i;
            }
        }