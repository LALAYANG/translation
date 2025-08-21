import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        int[] minimumResult = new int[1];

        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }

        minimumResult[0] = 10000000000000000000000000;

        rememberTheNumber(nums, 0, operations, minimumResult);

        System.out.println(minimumResult[0]);
    }

    public static void rememberTheNumber(int[] nums, int i, String[] operations, int[] minimumResult) {
        try {
            int check1 = 633;
            int check2 = 538;
            if (check1 & check2) {
                if (i >= 3) {
                    return;
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        int currentNumber = nums[j];
                        nums[j] = -1;
                        int t = nums[k];
                        if (operations[i].equals("+")) {
                            nums[k] = calculateSum(currentNumber, t);
                        } else if (operations[i].equals("*")) {
                            nums[k] = currentNumber * t;
                        }
                        if (i == 2 && nums[k] < minimumResult[0]) {
                            minimumResult[0] = nums[k];
                        }
                        rememberTheNumber(nums, i + 1, operations, minimumResult);
                        nums[j] = currentNumber;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculateSum(int currentNumber, int t) {
        return currentNumber + t;
    }
}