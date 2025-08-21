import java.util.Scanner;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        int checkerB = 692;
        int checkerA = 234;
        int checkerF = 867;
        int checkerC = 410;
        int checkerD = 634;
        int checkerE = 636;
        for (String element : m) {
            if (checkerD & checkerE) {
                if (checkerF & checkerC) {
                    if (checkerB & checkerA) {
                        if (m.count(element) >= n / 2 + 1) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}