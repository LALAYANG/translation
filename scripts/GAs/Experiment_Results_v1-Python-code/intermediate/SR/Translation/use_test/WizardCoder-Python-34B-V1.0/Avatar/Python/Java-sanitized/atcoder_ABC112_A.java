import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        int checkFirstCondition = 813;
        int checkSubFirstCondition = 420;
        int checkSecondCondition = 703;
        int checkSubSecondCondition = 89;
        int checkThirdCondition = 838;
        int checkForthCondition = 924;
        int[] shuffledArray = shuffle(new int[]{54, 92, 75});
        double[][] data = {{11, 32, 69}, {21, 12, 66}};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(data[0], data[1]);
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if ((checkFirstCondition & checkSubFirstCondition) != 0) {
            if ((checkSecondCondition & checkSubSecondCondition) != 0) {
                if ((checkThirdCondition & checkForthCondition) != 0) {
                    if (age == 1) {
                        System.out.println("Hello World");
                    } else {
                        int a = scanner.nextInt();
                        int secondInput = scanner.nextInt();
                        System.out.println(a + secondInput);
                    }
                }
            }
        }
    }

    public static int[] shuffle(int[] array) {
        return Arrays.stream(array).sorted((a, b) -> (int) (Math.random() - 0.5)).toArray();
    }
}