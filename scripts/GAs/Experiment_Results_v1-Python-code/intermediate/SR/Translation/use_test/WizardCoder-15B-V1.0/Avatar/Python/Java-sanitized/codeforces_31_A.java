import java.util.Arrays;
import java.util.Random;

public class codeforces_31_A {
    public static void main(String[] args) {
        int input_number = Integer.parseInt(args[0]);
        int[] arr = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            arr[i] = Integer.parseInt(args[i+1]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < input_number; i++) {
            for (int second_index = i+1; second_index < input_number; second_index++) {
                if (arr[i] == arr[second_index]) {
                    continue;
                }
                int[] indices = new int[3];
                indices[0] = i+1;
                indices[1] = second_index+1;
                indices[2] = findIndex(arr, i, second_index);
                if (indices[2] != -1) {
                    System.out.println(Arrays.toString(indices));
                    return;
                }
            }
        }
        System.out.println("-1");
    }

    public static int findIndex(int[] arr, int i, int second_index) {
        int start = Math.min(i, second_index) + 1;
        int end = Math.max(i, second_index);
        for (int j = start; j <= end; j++) {
            if (arr[i] + arr[second_index] == arr[j]) {
                return j+1;
            }
        }
        return -1;
    }
}