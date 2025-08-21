import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC171_E {
    public static int calculateXor(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(429880476, 952730022, 767701192, 621578777, 960800330, 936109539, 322126147, 719960733, 528524886, 51132735, 104786104, 915384707, 272441325, 270941792, 398864362, 262047821, 115278283, 680775089, 945172413, 190657328, 773816529, 420966483, 412512492, 492598567, 459155635, 964043273, 218517207, 133020138, 203251904, 393722193, 698472286, 681223249, 384769641, 451330616, 549038753, 994693086, 920497638, 645410160, 768890749, 157999842, 433945512, 884984847, 295537581, 850756991, 328181219, 464569252, 90819571, 107288593, 507458235, 40716);

        int xorSum = numbers.stream().reduce(0, (a, b) -> a ^ b);

        List<Integer> result = numbers.stream()
                .map(ai -> calculateXor(ai, xorSum))
                .collect(Collectors.toList());

        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}