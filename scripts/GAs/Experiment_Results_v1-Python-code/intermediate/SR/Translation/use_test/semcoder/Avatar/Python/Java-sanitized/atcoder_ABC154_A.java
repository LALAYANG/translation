import java.util.Scanner;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();

        int check_one = 811;
        int check_two = 454;

        if ((check_one & check_two) != 0) {
            if (S.equals(U)) {
                A--;
            }
            if (T.equals(U)) {
                B--;
            }
        }

        System.out.println(A + " " + B);
    }
}