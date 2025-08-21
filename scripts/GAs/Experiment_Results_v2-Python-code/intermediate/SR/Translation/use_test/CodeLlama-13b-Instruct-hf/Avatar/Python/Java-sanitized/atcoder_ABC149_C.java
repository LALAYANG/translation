import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listLength = 100010;
        boolean[] boolList = new boolean[listLength];
        boolList[0] = false;
        boolList[1] = false;
        for (int i = 4; i < listLength; i += 2) {
            boolList[i] = false;
        }
        for (int i = 3; i * i <= listLength; i += 2) {
            if (boolList[i]) {
                for (int j = i + i; j < listLength; j += i) {
                    boolList[j] = false;
                }
            }
        }
        int X = scanner.nextInt();
        for (int i = X; i < listLength; i++) {
            if (boolList[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}