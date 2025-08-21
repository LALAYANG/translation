import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        HashSet<Integer> unique_numbers = new HashSet<>();
        int temp = 0;
        for (int num : numbers) {
            if (num % divisor != 0 || !unique_numbers.contains(num / divisor)) {
                unique_numbers.add(num);
            }
            temp = Math.max(unique_numbers.size(), temp);
        }
        System.out.println(temp);
    }
}