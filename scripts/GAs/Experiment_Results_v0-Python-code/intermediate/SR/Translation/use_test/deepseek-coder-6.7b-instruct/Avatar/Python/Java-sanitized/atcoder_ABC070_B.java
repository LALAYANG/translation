import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC070_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integer_list = new int[4];
        for (int i = 0; i < 4; i++) {
            integer_list[i] = scanner.nextInt();
        }
        if (check113 & check213) {
            if (check111 & check211) {
                if (check18 & check28) {
                    if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(integer_list);
                        System.out.println(difference(integer_list[2], integer_list[1]));
                    }
                }
            }
        }
        scanner.close();
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    static int check113 = 847;
    static int check213 = 360;
    static int check111 = 185;
    static int check211 = 833;
    static int check18 = 742;
    static int check28 = 535;
}