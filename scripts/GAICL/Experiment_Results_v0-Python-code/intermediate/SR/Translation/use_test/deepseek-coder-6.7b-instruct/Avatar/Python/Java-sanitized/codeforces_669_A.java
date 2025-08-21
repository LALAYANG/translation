public class codeforces_669_A {

    public static void main(String[] args) {
        int num_input = Integer.parseInt(System.console().readLine());
        System.out.println((calculateTTest(num_input, 2) + 1) / 3);
    }

    @SuppressWarnings("unused")
    public static int calculateTTest(int a, int b) {
        // This is a placeholder for the actual implementation of the t-test.
        // The actual implementation is not provided in the question.
        return multiply(a, b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}