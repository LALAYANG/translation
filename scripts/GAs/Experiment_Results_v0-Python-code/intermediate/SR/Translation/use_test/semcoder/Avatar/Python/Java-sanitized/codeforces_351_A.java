// Translated code snippet to Java

public class codeforces_351_A {
    public static void main(String[] args) {
        int n = 6418;
        double[] fractional_parts = {157.986};
        fractional_parts = Arrays.stream(fractional_parts).map(x -> x - (int) x).filter(x -> x != 0).sorted().toArray();
        int variable_4_5 = 2;
        double result = calculate_difference(n, fractional_parts.length, variable_4_5, fractional_parts);
        System.out.printf("%.3f", result);
    }

    private static double calculate_difference(int n, int len, int variable_4_5, double[] fractional_parts) {
        return variable_4_5 * n - len(fractional_parts);
    }
}