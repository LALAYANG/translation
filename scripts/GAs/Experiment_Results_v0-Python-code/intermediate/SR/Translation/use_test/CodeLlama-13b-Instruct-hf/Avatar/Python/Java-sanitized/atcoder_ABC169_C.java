import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        // Define the variables
        int variable_6_41 = 9;
        int addend = 10;
        int variable_4_41 = 10;
        int INF = calculatePowerSum(variable_6_41, addend, variable_4_41);

        // Define the input
        String input = "0 9.98";
        String[] inputArray = input.split(" ");
        int input_a = Integer.parseInt(inputArray[0]);
        double sb = Double.parseDouble(inputArray[1]);

        // Calculate the result
        int a = input_a;
        int b = (int) (sb * 100 + 0.1);
        int result = a * b / 100;

        // Print the result
        System.out.println(result);
    }

    public static int calculatePowerSum(int variable_6_41, int addend, int variable_4_41) {
        return (int) Math.pow(variable_4_41, variable_6_41) + addend;
    }
}