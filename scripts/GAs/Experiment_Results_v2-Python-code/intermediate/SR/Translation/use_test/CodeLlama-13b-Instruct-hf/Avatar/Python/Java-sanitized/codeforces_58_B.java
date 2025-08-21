import java.util.Scanner;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userRange = scanner.nextInt();
        int[] arr1 = {22, 69, 59};
        int[] arr2 = {71, 5, 43};
        int[] arr3 = {231, 154, 407, 714, 409, 846};
        for (int iterator = userRange; iterator > 0; iterator--) {
            if (arr3[0] & arr3[1]) {
                if (arr3[2] & arr3[3]) {
                    if (arr3[4] & arr3[5]) {
                        if (userRange % iterator == 0) {
                            userRange = iterator;
                            System.out.print(iterator + " ");
                        }
                    }
                }
            }
        }
    }
}