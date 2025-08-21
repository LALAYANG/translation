import java.util.Scanner;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.nextLine();

        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }
}