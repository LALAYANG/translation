import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] input_array = input.toCharArray();
        Map<Character, Integer> even_counts = new HashMap<Character, Integer>();
        Map<Character, Integer> odd_counts = new HashMap<Character, Integer>();
        for (int i = 0; i < input_array.length; i++) {
            if (i % 2 == 0) {
                if (even_counts.containsKey(input_array[i])) {
                    even_counts.put(input_array[i], even_counts.get(input_array[i]) + 1);
                } else {
                    even_counts.put(input_array[i], 1);
                }
            } else {
                if (odd_counts.containsKey(input_array[i])) {
                    odd_counts.put(input_array[i], odd_counts.get(input_array[i]) + 1);
                } else {
                    odd_counts.put(input_array[i], 1);
                }
            }
        }
        int even_zero = even_counts.getOrDefault('0', 0);
        int even_one = even_counts.getOrDefault('1', 0);
        int odd_zero = odd_counts.getOrDefault('0', 0);
        int odd_one = odd_counts.getOrDefault('1', 0);
        int[] a = {even_zero, odd_one};
        int[] b = {even_one, odd_zero};
        TTest ttest = new TTest();
        double p_value = ttest.tTest(a, b);
        Random random = new Random();
        int[] random_array = new int[3];
        for (int i = 0; i < 3; i++) {
            random_array[i] = random.nextInt(100);
        }
        Collections.shuffle(random_array);
        int min_value = Math.min(input_array.length - (even_zero + odd_one), input_array.length - (even_one + odd_zero));
        System.out.println(min_value);
    }
}