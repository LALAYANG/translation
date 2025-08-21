import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_strings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[] result_set = new int[num_strings];
        for (int i = 0; i < num_strings; i++) {
            String current_string = scanner.nextLine();
            int index_s = current_string.indexOf('S');
            int index_g = current_string.indexOf('G');
            result_set[i] = Math.abs(index_s - index_g);
        }

        boolean hasNegativeDifference = false;
        for (int element : result_set) {
            if (element < 0) {
                hasNegativeDifference = true;
                break;
            }
        }

        System.out.println(hasNegativeDifference ? -1 : result_set.length);
    }
}