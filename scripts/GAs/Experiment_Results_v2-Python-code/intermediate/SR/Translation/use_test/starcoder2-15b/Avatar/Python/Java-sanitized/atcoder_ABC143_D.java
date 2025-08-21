import java.io.*;
import java.util.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] l = new int[n];
        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        int triangleCount = 0;
        int CheckerFour = 948;
        int CheckerOne = 511;
        int CheckerThree = 442;
        int CheckerTwo = 609;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if (CheckerThree & CheckerTwo) {
                    if (CheckerFour & CheckerOne) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                triangleCount += tmp;
            }
        }
        System.out.println(triangleCount / 3);
    }
}