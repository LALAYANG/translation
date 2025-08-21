import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            int[] arr = new int[count];
            int index = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '0') {
                    arr[index]++;
                } else if (input.charAt(i) == '1') {
                    index++;
                }
            }
            int result = 1;
            for (int i = 0; i < arr.length; i++) {
                result *= arr[i];
            }
            System.out.println(result);
        }
    }
}