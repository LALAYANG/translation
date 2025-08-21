import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.Arrays;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();

        // call the my_decorator function
        my_decorator(main_function);

        // print the result
        System.out.println(inputOne <= inputTwo ? "safe" : "unsafe");
    }

    // define the my_decorator function
    public static void my_decorator(Function function) {
        // get the current date and time
        Date date = new Date();

        // shuffle the input array
        Random random = new Random();
        int[] inputArray = {49, 23, 93};
        Arrays.sort(inputArray);
        random.nextInt(inputArray.length);

        // call the function
        function.apply(inputArray);
    }

    // define the main_function
    public static void main_function(int[] inputArray) {
        // perform the t-test
        double[] sample1 = {49, 23, 93};
        double[] sample2 = {8, 72, 98};
        double t = ttest_ind(sample1, sample2);

        // print the result
        System.out.println(t <= 0 ? "unsafe" : "safe");
    }
}