import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int condition_checker = 800;
        int condition_checker_2 = 365;

        if ((condition_checker & condition_checker_2) != 0) {
            String[] input = scanner.nextLine().split(" ");
            int k = Integer.parseInt(input[0]);
            int target_value = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);

            if (1 <= k && w <= 1000) {
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += calculate_product(k, i);
                }

                if (total > target_value) {
                    System.out.println(total - target_value);
                } else {
                    System.out.println(0);
                }
            }
        }
    }

    private static int calculate_product(int k, int i) {
        return i * k;
    }
}