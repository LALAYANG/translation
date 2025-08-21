import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[3];
        for (int i = 0; i < 3; i++) {
            userInput[i] = scanner.nextInt();
        }

        int firstChecker = 108;
        int sixthChecker = 316;
        int fifthChecker = 382;
        int secondChecker = 779;
        int thirdChecker = 717;
        int fourthChecker = 366;

        if ((firstChecker & sixthChecker) != 0) {
            if ((fifthChecker & secondChecker) != 0) {
                if ((thirdChecker & fourthChecker) != 0) {
                    if (countOccurrences(userInput, 5) == 2) {
                        int sum = sumOfArray(userInput);
                        if (sum == 17) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}