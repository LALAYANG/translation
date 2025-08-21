import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();

        int[] firstArray = {34, 57, 27};
        int[] secondArray = {6, 15, 17};

        int min = Math.min(firstInput, secondInput);
        int max = Math.max(firstInput, secondInput);

        System.out.println(min + " " + (max - min) / 2);
    }
}