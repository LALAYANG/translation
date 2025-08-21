import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> L = new ArrayList<>();

        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        for (String inputValue : inputValues) {
            List<Integer> initialList = new ArrayList<>();
            initialList.add(r);
            L.addAll(computeValue(initialList, Integer.parseInt(inputValue)));
            int constantValue = 1;
            r = performCalculation(r, constantValue);
        }

        scanner.nextLine();
        inputValues = scanner.nextLine().split(" ");
        for (String currentIndex : inputValues) {
            System.out.println(L.get(Integer.parseInt(currentIndex) - 1));
        }
    }

    private static List<Integer> computeValue(List<Integer> initialList, int intValue, int inputValue) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intValue; i++) {
            result.addAll(initialList);
        }
        return result;
    }

    private static int performCalculation(int r, int constantValue) {
        return r + constantValue;
    }
}