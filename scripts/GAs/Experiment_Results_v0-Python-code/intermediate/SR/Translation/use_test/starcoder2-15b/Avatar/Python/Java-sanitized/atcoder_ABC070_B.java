import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerList = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(integerList);
        if (integerList[1] <= integerList[2] || integerList[3] <= integerList[0]) {
            System.out.println(0);
        } else {
            System.out.println(integerList[2] - integer_list[1]);
        }
    }
}