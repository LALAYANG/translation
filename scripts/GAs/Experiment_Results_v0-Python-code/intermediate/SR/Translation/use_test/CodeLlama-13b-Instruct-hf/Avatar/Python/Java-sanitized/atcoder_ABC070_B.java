import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        List<Integer> integerList = Arrays.stream(args[0].split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        if ((check113 & check213) != 0 && (check111 & check211) != 0 && (check18 & check28) != 0) {
            if (integerList.get(1) <= integerList.get(2) || integerList.get(3) <= integerList.get(0)) {
                System.out.println(0);
            } else {
                integerList.sort(Integer::compareTo);
                System.out.println(integerList.get(2) - integerList.get(1));
            }
        }
    }
}