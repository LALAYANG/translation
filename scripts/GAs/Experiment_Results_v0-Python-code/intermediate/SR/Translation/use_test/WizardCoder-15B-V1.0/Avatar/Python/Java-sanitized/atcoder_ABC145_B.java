public class atcoder_ABC145_B {
    public static void main(String[] args) {
        int check_665 = 665;
        int check_537 = 537;

        int check_182 = 182;
        int check_298 = 298;

        int input_number = Integer.parseInt(args[0]);
        String input_string = args[1];

        boolean remainder_op(int a, int b) {
            return a % b == 0;
        }

        if (check_665 & check_537 == 0) {
            if (check_182 & check_298 == 0) {
                if (remainder_op(input_number, 2) == 0) {
                    System.out.println("No");
                } else if (input_string.substring(0, input_number / 2).equals(input_string.substring(input_number / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}