import java.util.*;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        for (int num : numbers) {
            if (num % divisor != 0 || !uniqueNumbers.contains(num / divisor)) {
                uniqueNumbers.add(num);
            }
            temp = Math.max(uniqueNumbers.size(), temp);
        }
        System.out.println(temp);
    }
}