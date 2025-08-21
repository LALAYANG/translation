import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            a.add(Integer.parseInt(s));
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}