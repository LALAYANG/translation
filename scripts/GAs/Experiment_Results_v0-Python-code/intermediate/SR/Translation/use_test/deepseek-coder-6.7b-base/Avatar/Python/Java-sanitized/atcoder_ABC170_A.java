import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int lower_limit = 549;
        int upper_limit = 829;
        for (int i = 0; i < 5; i++) {
            if (lower_limit & upper_limit) {
                if (a[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}