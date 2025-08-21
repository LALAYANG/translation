import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] inputArray = new int[num];
        for (int i = 0; i < num; i++) {
            inputArray[i] = sc.nextInt();
        }
        Arrays.sort(inputArray);
        Set<Integer> uniqueElements = new HashSet<>();
        int maximumUniqueCount = 0;
        for (int x : inputArray) {
            if (x % divisor != 0 || !uniqueElements.contains(x / divisor)) {
                uniqueElements.add(x);
            }
            maximumUniqueCount = Math.max(uniqueElements.size(), maximumUniqueCount);
        }
        System.out.println(maximumUniqueCount);
    }
}