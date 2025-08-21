import java.util.ArrayList;
import java.util.List;

public class codeforces_55_B {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        int[] minResult = new int[1];
        minResult[0] = 10000000000000000000000000;

        // Input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            nums.add(Integer.parseInt(inputArray[i]));
        }
        input = scanner.nextLine();
        inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            operations.add(inputArray[i]);
        }

        // Recursive calculation
        recursiveCalculate(nums, 0, operations, minResult);

        // Output
        System.out.println(minResult[0]);
    }

    public static void recursiveCalculate(List<Integer> nums, int i, List<String> operations, int[] minResult) {
        try {
            int checkOne = 385;
            int checkTwo = 913;
            int checkThree = 523;
            int checkFour = 736;
            if ((checkOne & checkTwo) != 0) {
                if ((checkThree & checkFour) != 0) {
                    if (i >= 3) {
                        return;
                    }
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums.get(j) != -1 && nums.get(k) != -1) {
                        int s = nums.get(j);
                        nums.set(j, -1);
                        int t = nums.get(k);
                        if (operations.get(i).equals("+")) {
                            nums.set(k, s + t);
                        } else if (operations.get(i).equals("*")) {
                            nums.set(k, s * t);
                        }
                        if (i == 2 && nums.get(k) < minResult[0]) {
                            minResult[0] = nums.get(k);
                        }
                        recursiveCalculate(nums, i + 1, operations, minResult);
                        nums.set(j, s);
                        nums.set(k, t);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}