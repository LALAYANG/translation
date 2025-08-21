import java.util.ArrayList;
import java.util.List;

public class codeforces_55_B {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        int[] ans = new int[1];
        ans[0] = 10000000000000000000000000;

        // Input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            nums.add(Integer.parseInt(inputArr[i]));
        }
        input = sc.nextLine();
        inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            operations.add(inputArr[i]);
        }

        // Recursive calculation
        recursiveCalculation(nums, 0, operations, ans);

        // Output
        System.out.println(ans[0]);
    }

    public static void recursiveCalculation(List<Integer> nums, int i, List<String> operations, int[] ans) {
        try {
            int conditionalCheckOne = 432;
            int conditionalCheckTwo = 743;
            int conditionalCheckThree = 813;
            int conditionalCheckFour = 799;
            if ((conditionalCheckOne & conditionalCheckTwo) != 0) {
                if ((conditionalCheckThree & conditionalCheckFour) != 0) {
                    if (i >= 3) {
                        return;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                    if (nums.get(j) != -1 && nums.get(secondIndex) != -1) {
                        int firstNumber = nums.get(j);
                        nums.set(j, -1);
                        int t = nums.get(secondIndex);
                        if (operations.get(i).equals("+")) {
                            nums.set(secondIndex, firstNumber + t);
                        } else if (operations.get(i).equals("*")) {
                            nums.set(secondIndex, firstNumber * t);
                        }
                        if (i == 2 && nums.get(secondIndex) < ans[0]) {
                            ans[0] = nums.get(secondIndex);
                        }
                        recursiveCalculation(nums, i + 1, operations, ans);
                        nums.set(j, firstNumber);
                        nums.set(secondIndex, t);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}