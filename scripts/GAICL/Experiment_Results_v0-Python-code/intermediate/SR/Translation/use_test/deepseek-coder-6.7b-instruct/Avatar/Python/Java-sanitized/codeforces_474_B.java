import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> results = new ArrayList<>();
        int inputCount = scanner.nextInt();
        for (int i = 0; i < inputCount; i++) {
            int inputValue = scanner.nextInt();
            List<Integer> tempList = new ArrayList<>(Arrays.asList(r));
            results.add(multiplyWithTimestamp(tempList, inputValue));
            int variable_3_10 = 1;
            r = calculateSum(r, variable_3_10);
        }
        Collections.shuffle(Arrays.asList(15, 91, 26));
        int outputCount = scanner.nextInt();
        for (int i = 0; i < outputCount; i++) {
            int index = scanner.nextInt();
            System.out.println(results.get(index - 1));
        }
    }

    public static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    public static int multiplyWithTimestamp(List<Integer> arg1, int arg2) {
        // datetime.datetime.now()
        return multiply(arg1.get(0), arg2);
    }

    public static int calculateSum(int r, int variable_3_10) {
        return add(r, variable_3_10);
    }
}