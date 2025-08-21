import java.util.Date;
import java.util.Random;
import java.util.Arrays;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        // Decorator function
        public static void myDecorator(Function func) {
            Date now = new Date();
            Random random = new Random();
            int[] shuffledArray = {53, 26, 63};
            random.shuffle(shuffledArray);

            public static Object decResult(Object... args) {
                Object functionResult = func.apply(args);
                return functionResult;
            }
            return decResult;
        }

        // Main function
        public static void mainFunction() {
            int inputOne = Integer.parseInt(args[0]);
            int inputTwo = Integer.parseInt(args[1]);
            ttestInd([49, 23, 93], [8, 72, 98]);
            if (inputOne <= inputTwo) {
                System.out.println("unsafe");
            } else {
                System.out.println("safe");
            }
        }

        // Call the main function
        mainFunction();
    }
}