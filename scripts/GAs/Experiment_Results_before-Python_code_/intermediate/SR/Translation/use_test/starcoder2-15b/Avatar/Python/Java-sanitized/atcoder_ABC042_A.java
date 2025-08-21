import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}