import java.util.Scanner;

class CodeforcesTask397BSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (k * a >= b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}