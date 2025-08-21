public class codeforces_58_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                n = i;
                System.out.print(i + " ");
            }
        }
    }
}