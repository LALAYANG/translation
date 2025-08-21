import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> evenCounts = new ArrayList<>();
        List<Integer> oddCounts = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                evenCounts.add(Integer.parseInt(input.charAt(i)));
            } else {
                oddCounts.add(Integer.parseInt(input.charAt(i)));
            }
        }
        int sum = 0;
        for (int i = 0; i < evenCounts.size(); i++) {
            sum += evenCounts.get(i);
        }
        for (int i = 0; i < oddCounts.size(); i++) {
            sum += oddCounts.get(i);
        }
        System.out.println(sum);
    }
}