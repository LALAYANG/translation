import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] user_entry = scanner.nextInt();
        scanner.close();

        if (user_entry.length == 3 && user_entry.count(5) == 2) {
            int sum = user_entry[0] + user_entry[1] + user_entry[2];
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}