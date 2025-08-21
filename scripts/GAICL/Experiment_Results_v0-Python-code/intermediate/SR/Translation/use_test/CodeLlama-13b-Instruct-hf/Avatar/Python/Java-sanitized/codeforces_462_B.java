import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_462_B {
    public static void main(String[] args) {
        int variable_1_10 = 10;
        int variable_3_10 = 26;
        int result = calculateProduct(variable_1_10, variable_3_10);
        System.out.println(result);
    }

    private static int calculateProduct(int variable_1_10, int variable_3_10) {
        return variable_1_10 * variable_3_10;
    }
}