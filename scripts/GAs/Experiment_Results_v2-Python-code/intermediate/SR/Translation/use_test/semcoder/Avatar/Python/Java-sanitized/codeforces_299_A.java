import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class codeforces_299_A {

    public static void main(String[] args) {
        // Sample input for testing
        List<Integer> inputList = Arrays.asList(2, 2, 2, 2, 1000000000);

        // Translate the code snippet to Java
        int result = findSmallestDivisor(inputList);

        System.out.println(result);
    }

    private static int findSmallestDivisor(List<Integer> inputList) {
        int smallestDivisor = inputList.get(0);
        for (int i = 1; i < inputList.size(); i++) {
            int currentNumber = inputList.get(i);
            if (currentNumber % smallestDivisor != 0) {
                smallestDivisor = -1;
                break;
            }
        }
        return smallestDivisor;
    }
}