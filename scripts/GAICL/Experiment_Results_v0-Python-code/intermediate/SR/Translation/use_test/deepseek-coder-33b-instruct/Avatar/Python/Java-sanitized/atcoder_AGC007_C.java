public class atcoder_AGC007_C {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        double d = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);
        System.out.println(linearCombination(x, iterations, 0.5, d));
    }

    public static double linearCombination(double x, int iterations, double variable_10_23, double d) {
        return d + (iterations - variable_10_23) * x;
    }
}