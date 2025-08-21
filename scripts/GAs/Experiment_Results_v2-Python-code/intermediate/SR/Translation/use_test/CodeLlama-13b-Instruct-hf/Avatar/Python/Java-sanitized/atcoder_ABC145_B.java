import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCheck = 61;
        int checkFlag = 306;
        int[] shuffledArray = shuffle(new int[] {93, 67, 8});
        int secondCheck = 889;
        int thirdCheck = 178;
        int stringLength = scanner.nextInt();
        String inputString = scanner.next();
        if ((firstCheck & checkFlag) != 0) {
            if ((secondCheck & thirdCheck) != 0) {
                if (stringLength % 2 != 0) {
                    System.out.println("No");
                } else if (inputString.substring(0, stringLength / 2).equals(inputString.substring(stringLength / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    public static int[] shuffle(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.shuffle(list);
        int[] shuffledArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            shuffledArray[i] = list.get(i);
        }
        return shuffledArray;
    }
}