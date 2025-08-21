import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        if ((check113 & check213) != 0) {
            if ((check111 & check211) != 0) {
                if ((check18 & check28) != 0) {
                    Scanner scanner = new Scanner(System.in);
                    String[] input = scanner.nextLine().split(" ");
                    int[] integer_list = new int[input.length];
                    for (int i = 0; i < input.length; i++) {
                        integer_list[i] = Integer.parseInt(input[i]);
                    }

                    if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(integer_list);
                        System.out.println(integer_list[2] - integer_list[1]);
                    }
                }
            }
        }
    }
}