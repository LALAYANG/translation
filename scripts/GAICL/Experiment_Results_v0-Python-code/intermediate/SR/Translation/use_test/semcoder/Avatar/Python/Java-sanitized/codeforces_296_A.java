import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        for (int i = 0; i < m.length; i++) {
            if (m[i].equals("440")) {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}