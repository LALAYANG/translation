import java.util.*;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] % k != 0 || !uniqueNumbers.contains(arr[i] / k)) {
                uniqueNumbers.add(arr[i]);
            }
            temp = Math.max(temp, uniqueNumbers.size());
        }
        System.out.println(temp);
    }
}