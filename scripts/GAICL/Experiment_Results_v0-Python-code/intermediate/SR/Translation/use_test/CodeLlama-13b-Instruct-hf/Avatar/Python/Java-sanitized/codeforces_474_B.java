import java.util.ArrayList;
import java.util.List;

public class codeforces_474_B {
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        // Take input for results
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            results.add(scanner.nextInt());
        }

        // Take input for tempList
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            tempList.add(scanner.nextInt());
        }

        // Calculate sum of results and tempList
        int sumResult = 0;
        for (int i = 0; i < results.size(); i++) {
            sumResult += results.get(i);
        }
        for (int i = 0; i < tempList.size(); i++) {
            sumResult += tempList.get(i);
        }

        // Calculate product of tempList and sumResult
        int product = 1;
        for (int i = 0; i < tempList.size(); i++) {
            product *= tempList.get(i);
        }

        // Calculate final result
        int finalResult = sumResult + product;

        // Print final result
        System.out.println(finalResult);
    }
}