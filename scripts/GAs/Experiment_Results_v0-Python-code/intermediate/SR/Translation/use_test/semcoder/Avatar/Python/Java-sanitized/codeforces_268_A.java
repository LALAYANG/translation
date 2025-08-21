import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> inputArrays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[2];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            inputArrays.add(arr);
        }

        int matchCount = 0;
        for (int i = 0; i < inputArrays.size(); i++) {
            for (int j = 0; j < inputArrays.size(); j++) {
                if (i == j) continue;
                if (inputArrays.get(i)[0] == inputArrays.get(j)[1]) {
                    matchCount++;
                }
            }
        }

        System.out.println(matchCount);
    }
}