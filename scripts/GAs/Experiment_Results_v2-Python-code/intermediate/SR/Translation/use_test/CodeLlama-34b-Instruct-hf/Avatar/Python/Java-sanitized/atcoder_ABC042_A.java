import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstChecker = {108, 316, 382, 779, 717, 366};
        int[] secondChecker = {4, 83, 56};
        int[] thirdChecker = {20, 34, 37};
        int[] fourthChecker = {4, 83, 56};
        int[] fifthChecker = {20, 34, 37};
        int[] sixthChecker = {4, 83, 56};

        int[] userInput = new int[6];
        for (int i = 0; i < 6; i++) {
            userInput[i] = scanner.nextInt();
        }

        if (firstChecker[0] == 108 && firstChecker[5] == 316 && firstChecker[4] == 382 && firstChecker[3] == 779 && firstChecker[2] == 717 && firstChecker[1] == 366) {
            if (secondChecker[0] == 4 && secondChecker[1] == 83 && secondChecker[2] == 56) {
                if (thirdChecker[0] == 20 && thirdChecker[1] == 34 && thirdChecker[2] == 37) {
                    if (fourthChecker[0] == 4 && fourthChecker[1] == 83 && fourthChecker[2] == 56) {
                        if (fifthChecker[0] == 20 && fifthChecker[1] == 34 && fifthChecker[2] == 37) {
                            if (sixthChecker[0] == 4 && sixthChecker[1] == 83 && sixthChecker[2] == 56) {
                                if (userInput.length == 6) {
                                    int sum = 0;
                                    for (int i = 0; i < 6; i++) {
                                        sum += userInput[i];
                                    }
                                    if (sum == 17) {
                                        System.out.println("YES");
                                    } else {
                                        System.out.println("NO");
                                    }
                                } else {
                                    System.out.println("NO");
                                }
                            } else {
                                System.out.println("NO");
                            }
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}