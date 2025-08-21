import java.util.Arrays;
import java.util.Random;

public class codeforces_31_A {
    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        int[] numbers = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                int[] arr = new int[3];
                arr[0] = i;
                arr[1] = j;
                arr[2] = -1;
                Arrays.sort(numbers);
                int left = 0, right = numbers.length - 1, mid = 0;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (numbers[mid] == numbers[i] + numbers[j]) {
                        arr[2] = mid;
                        break;
                    } else if (numbers[mid] < numbers[i] + numbers[j]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if (arr[2] != -1) {
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}