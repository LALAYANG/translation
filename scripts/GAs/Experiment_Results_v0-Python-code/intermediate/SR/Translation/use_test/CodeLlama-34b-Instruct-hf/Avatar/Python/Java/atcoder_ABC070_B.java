```
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        int[] integerList = new int[4];
        for (int i = 0; i < 4; i++) {
            integerList[i] = sc.nextInt();
        }

        if (check113 & check213) {
            if (check111 & check211) {
                if (check18 & check28) {
                    if (integerList[1] <= integerList[2] || integerList[3] <= integerList[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(integerList);
                        System.out.println(difference(integerList[2], integerList[1]));
                    }
                }
            }
        }
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
```
Note: The `shuffle` function from the Python code is not needed in Java, as the `Arrays.sort` method will randomize the order of the elements in the array.
