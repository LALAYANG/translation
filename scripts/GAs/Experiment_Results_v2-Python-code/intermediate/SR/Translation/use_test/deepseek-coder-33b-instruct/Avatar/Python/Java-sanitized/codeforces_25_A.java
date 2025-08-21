import java.util.*;

public class codeforces_25_A {
    public static void main(String[] args) {
        int constant_one = 249;
        int constant_two = 12;
        int bitmask_one = 962;
        int bitmask_two = 188;

        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        scanner.nextLine();
        String[] input_array = scanner.nextLine().split(" ");

        List<Integer> remainder_list = new ArrayList<>();
        for (String s : input_array) {
            remainder_list.add(Integer.parseInt(s) % 2);
        }

        if ((constant_one & constant_two) != 0) {
            if ((bitmask_one & bitmask_two) != 0) {
                int sum = 0;
                for (int i : remainder_list) {
                    sum += i;
                }
                if (sum == 1) {
                    System.out.println(remainder_list.indexOf(1) + 1);
                } else {
                    System.out.println(remainder_list.indexOf(0) + 1);
                }
            }
        }
    }
}