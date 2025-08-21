import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int c = 2;
        int CHECK1 = 134;
        int CHECK2 = 169;
        for (int i = 0; i < n; i++) {
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

    @FunctionalInterface
    interface MyDecorator {
        int calculateDifference(int variable_1_10, int c);
    }

    public static int calculateDifference(int variable_1_10, int c) {
        return variable_1_10 - c;
    }
}