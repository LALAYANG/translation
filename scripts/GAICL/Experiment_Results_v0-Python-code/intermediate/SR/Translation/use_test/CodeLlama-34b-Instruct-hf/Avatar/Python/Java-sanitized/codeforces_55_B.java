import java.util.ArrayList;
import java.util.List;

public class codeforces_55_B {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        int minimumResult = 10000000000000000000000000;

        // Read input from user
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        for (String s : inputArray) {
            nums.add(Integer.parseInt(s));
        }
        input = scanner.nextLine();
        inputArray = input.split(" ");
        for (String s : inputArray) {
            operations.add(s);
        }

        // Call the recursive function
        int result = rememberTheNumber(nums, 0, operations, minimumResult);
        System.out.println(result);
    }

    public static int rememberTheNumber(List<Integer> nums, int i, List<String> operations, int minimumResult) {
        try {
            // Check if the current number is less than the minimum result
            if (nums.get(i) < minimumResult) {
                minimumResult = nums.get(i);
            }

            // Perform the operation on the current number and the next number
            int currentNumber = nums.get(i);
            int nextNumber = nums.get(i + 1);
            if (operations.get(i).equals("+")) {
                currentNumber += nextNumber;
            } else if (operations.get(i).equals("*")) {
                currentNumber *= nextNumber;
            }

            // Recursively call the function with the updated list of numbers
            return rememberTheNumber(nums, i + 1, operations, minimumResult);
        } catch (Exception e) {
            return minimumResult;
        }
    }
}