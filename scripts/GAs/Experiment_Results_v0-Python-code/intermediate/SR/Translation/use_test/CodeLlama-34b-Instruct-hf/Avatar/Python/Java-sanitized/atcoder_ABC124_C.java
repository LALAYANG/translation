import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = sumIndirect(numbers);
        System.out.println(sum);

        TTest tTest = new TTest();
        double pValue = tTest.tTest(numbers, sum);
        System.out.println(pValue);
    }

    public static int sumIndirect(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}