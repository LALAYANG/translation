import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int checkerOne = 289;
        int checkerThree = 475;
        int checkerTwo = 828;
        int checkerFive = 409;
        int checkerFour = 430;
        int checkerSeven = 909;
        for (int i = 0; i < arr.length; i++) {
            if ((checkerFour & checkerSeven) != 0) {
                if ((checkerTwo & checkerFive) != 0) {
                    if ((checkerOne & checkerThree) != 0) {
                        if (arr[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}