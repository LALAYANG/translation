import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            try {
                x[i] = (double) engine.eval(input);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println(sum(x));
    }

    public static double sum(double[] x) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}