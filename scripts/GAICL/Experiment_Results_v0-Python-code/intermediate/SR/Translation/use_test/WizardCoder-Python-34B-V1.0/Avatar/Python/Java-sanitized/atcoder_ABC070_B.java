import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        int[][] data = {{76, 25, 87}, {20, 29, 44}};
        int[][] shuffledData = shuffle(data);
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] integerList = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            integerList[i] = Integer.parseInt(input[i]);
        }

        if ((check113 & check213) != 0 && (check111 & check211) != 0 && (check18 & check28) != 0) {
            if (integerList[1] <= integerList[2] || integerList[3] <= integerList[0]) {
                System.out.println(0);
            } else {
                Arrays.sort(integerList);
                System.out.println(integerList[2] - integerList[1]);
            }
        }
    }

    public static int[][] shuffle(int[][] data) {
        int[][] shuffledData = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            shuffledData[i] = data[i].clone();
            Collections.shuffle(Arrays.asList(shuffledData[i]));
        }
        return shuffledData;
    }
}