import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC164_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        scanner.close();

        Integer[] array1 = {49, 23, 93};
        Integer[] array2 = {8, 72, 98};

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("unsafe".equals(ttestInd(array1, array2) > inputOne ? "unsafe" : "safe") ? "unsafe" : "safe");
    }

    private static double ttestInd(Integer[] array1, Integer[] array2) {
        double sum1 = Arrays.stream(array1).mapToInt(Integer::intValue).sum();
        double sum2 = Arrays.stream(array2).mapToInt(Integer::intValue).sum();

        double mean1 = sum1 / array1.length;
        double mean2 = sum2 / array2.length;

        double var1 = Arrays.stream(array1).mapToDouble(x -> Math.pow(x - mean1, 2)).sum() / array1.length;
        double var2 = Arrays.stream(array2).mapToDouble(x -> Math.pow(x - mean2, 2)).sum() / array2.length;

        return (mean1 - mean2) / Math.sqrt((var1 + var2) / 2);
    }
}