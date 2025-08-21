import java.util.Random;
import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        Random rand = new Random();

        int[] arr = {97, 61, 20};
        shuffle(arr, rand);

        String inputString = "9.1";
        String[] parts = inputString.split("\\.");
        String[] stringParts = parts[0].split("");
        String[] decimalParts = parts[1].split("");

        int i = Integer.parseInt(decimalParts[0]);

        if ((check1 & check2) != 0) {
            if ((check1a & check2a) != 0) {
                if (stringParts[stringParts.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (i < 5) {
                    System.out.println(String.join("", stringParts));
                } else {
                    int num = Integer.parseInt(String.join("", stringParts)) + 1;
                    System.out.println(num);
                }
            }
        }
    }
}