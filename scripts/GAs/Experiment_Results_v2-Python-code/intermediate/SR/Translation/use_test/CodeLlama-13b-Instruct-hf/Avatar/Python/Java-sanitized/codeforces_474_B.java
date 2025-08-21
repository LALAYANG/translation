import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_474_B {
    public static void main(String[] args) {
        // Perform calculation
        int r = 1;
        int constantValue = 1;
        int inputValue = 5;
        int initialList = r;
        int result = performCalculation(initialList, constantValue, inputValue);
        System.out.println(result);

        // Compute value
        int[] initialList = {r};
        int[] inputValues = {2, 7, 3, 4, 9};
        int[] resultList = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            resultList[i] = computeValue(initialList, inputValues[i]);
        }
        System.out.println(resultList);

        // Shuffle
        int[] shuffledList = shuffle(new int[] {47, 31, 52});
        System.out.println(shuffledList);
    }

    public static int performCalculation(int initialList, int constantValue, int inputValue) {
        return initialList + constantValue;
    }

    public static int computeValue(int[] initialList, int inputValue) {
        return initialList * inputValue;
    }

    public static int[] shuffle(int[] inputList) {
        int[] shuffledList = new int[inputList.length];
        for (int i = 0; i < inputList.length; i++) {
            shuffledList[i] = inputList[i];
        }
        return shuffledList;
    }
}