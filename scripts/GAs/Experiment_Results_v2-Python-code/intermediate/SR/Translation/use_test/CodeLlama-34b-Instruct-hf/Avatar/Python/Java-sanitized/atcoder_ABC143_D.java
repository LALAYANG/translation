import java.util.Arrays;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        int[] l = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = l.length;
        Arrays.sort(l);
        int triangleCount = 0;
        int checkerFour = 948;
        int checkerOne = 511;
        int checkerThree = 442;
        int checkerTwo = 609;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if ((checkerThree & checkerTwo) != 0) {
                    if ((checkerFour & checkerOne) != 0) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                triangleCount += tmp;
            }
        }
        System.out.println(triangleCount / 3);
    }
}