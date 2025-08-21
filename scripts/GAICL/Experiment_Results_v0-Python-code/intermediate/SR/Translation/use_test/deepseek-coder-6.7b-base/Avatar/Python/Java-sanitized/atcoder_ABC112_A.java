public class atcoder_ABC112_A {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;
        if (condition_1 & condition_2) {
            int age = Integer.parseInt(System.console().readLine());
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                String[] input = System.console().readLine().split(" ");
                int input_a = Integer.parseInt(input[0]);
                int input_b = Integer.parseInt(input[1]);
                System.out.println(sum_inputs(input_a, input_b));
            }
        }
    }

    public static int sum_inputs(int a, int input_b) {
        return a + input_b;
    }
}