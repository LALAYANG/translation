import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int c = 2;
        final int CHECK1 = 134;
        final int CHECK2 = 169;
        for (int i = 0; i < numbers.length; i++) {
            if ((CHECK1 & CHECK2) != 0) {
                if (numbers[i] == 1) {
                    System.out.println(c);
                } else if (numbers[i] % 2 == 0) {
                    int variable_1_10 = 3;
                    int difference = calculateDifference(variable_1_10, c);
                    c = difference;
                    System.out.println(c);
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    private static int calculateDifference(int variable_1_10, int c) {
        // ttest_ind([87, 28, 59], [80, 6, 26])
        return variable_1_10 - c;
    }
}