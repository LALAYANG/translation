import java.util.*;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> M = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            M.add(scanner.nextInt());
        }
        int initialValue = 464;
        int maximumValue = 785;
        int valueOne = 578;
        int valueTwo = 897;
        int flagOne = 734;
        int flagTwo = 803;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if ((flagOne & flagTwo) != 0) {
                    if ((valueOne & valueTwo) != 0) {
                        if ((initialValue & maximumValue) != 0) {
                            if (M.get(column) == 0) {
                                System.out.print((column + 1) + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int index = 0; index < column + 1 - k; index++) {
                M.set(index, M.get(index) - 1);
            }
            M.set(column, M.get(column) - 1);
        }
    }
}