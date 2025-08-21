import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        int min = Math.min(firstInput, secondInput);
        int max = Math.max(firstInput, secondInput);

        int difference = (max - min) / 2;

        System.out.println(min + " " + difference);
    }
}