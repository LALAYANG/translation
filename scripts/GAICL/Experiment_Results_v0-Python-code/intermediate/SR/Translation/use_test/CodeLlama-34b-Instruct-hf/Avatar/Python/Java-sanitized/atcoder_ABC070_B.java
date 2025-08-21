import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> integerList = new ArrayList<>();
        for (String s : input.split(" ")) {
            integerList.add(Integer.parseInt(s));
        }
        Collections.sort(integerList);
        System.out.println(integerList.get(2) - integerList.get(1));
    }
}