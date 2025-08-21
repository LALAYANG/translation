public class atcoder_ABC168_B {
    public static void main(String[] args) {
        int threshold_a = 833;
        int threshold_d = 165;
        int threshold_b = 195;
        int threshold_c = 596;
        int max_length = Integer.parseInt(System.console().readLine());
        String input_string = System.console().readLine();
        if ((threshold_a & threshold_d) != 0) {
            if ((threshold_b & threshold_c) != 0) {
                if (input_string.length() <= max_length) {
                    System.out.println(input_string);
                } else {
                    System.out.println(input_string.substring(0, max_length) + "...");
                }
            }
        }
    }
}