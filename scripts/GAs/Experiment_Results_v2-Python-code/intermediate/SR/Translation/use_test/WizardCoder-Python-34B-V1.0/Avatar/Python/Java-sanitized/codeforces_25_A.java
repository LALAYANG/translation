import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class codeforces_25_A {
    public static void main(String[] args) {
        int constant_one = 249;
        int constant_two = 12;
        int bitmask_one = 962;
        int bitmask_two = 188;
        int input_number;
        int[] remainder_list;
        Scanner scanner = new Scanner(System.in);
        input_number = scanner.nextInt();
        String[] input_array = scanner.nextLine().split(" ");
        remainder_list = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            remainder_list[i] = Integer.parseInt(input_array[i]) % 2;
        }
        if ((constant_one & constant_two) != 0) {
            if ((bitmask_one & bitmask_two) != 0) {
                if (Arrays.stream(remainder_list).sum() == 1) {
                    System.out.println(Arrays.asList(remainder_list).indexOf(1) + 1);
                } else {
                    System.out.println(Arrays.asList(remainder_list).indexOf(0) + 1);
                }
            }
        }
    }
}