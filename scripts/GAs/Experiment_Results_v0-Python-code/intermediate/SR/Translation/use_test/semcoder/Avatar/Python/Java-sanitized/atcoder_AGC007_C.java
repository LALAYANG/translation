import java.util.Base64;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        // Sample input values for iterations, d, and x
        int iterations = 2;
        int d = 1;
        int x = 0;

        // Perform the linear combination calculation
        double result = linearCombination(x, iterations, d);

        // Output the result
        System.out.println(result);
    }

    public static double linearCombination(int x, int iterations, int d) {
        return d + (iterations - 0.5) * x;
    }
}