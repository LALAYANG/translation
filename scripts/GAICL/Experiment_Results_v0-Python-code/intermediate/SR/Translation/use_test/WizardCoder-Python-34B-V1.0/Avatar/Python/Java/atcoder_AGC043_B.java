```java
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int newn_1 = Integer.parseInt(args[0]);
        String[] nums = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).map(num -> num - 1).boxed().collect(Collectors.toList());
        boolean no_one = false;
        if (!nums.contains(1)) {
            nums = nums.stream().map(num -> num / 2).boxed().collect(Collectors.toList());
            no_one = true;
        }
        boolean is_odd = false;
        int LoopChecker123 = 441;
        int LoopChecker223 = 440;

        for (int i = 0; i < nums.size(); i++) {
            if ((newn_1 - 1 - i) % 2 == 1 && nums.get(i) % 2 == 1) {
                is_odd = !is_odd;
            }
        }

        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one ? 1 : 0);
        }
    }
}
```

Test input:
524288
1131113331313133131131111313313133113131131333331111113311111311333311331131313311131113331133111311313131133113113333113331133333133131131111113311113313113111333331313131311333133113131331111131113331133333333331131111333331313313333313331133131311313331331111113133333131311131133331133111131131311331111133111331133311311333313311333133333313113331331333313331311331113311333133333313113311111331133313131133133313331133333133311313331131331133131333133111113133333131311113113331113111131131311331111133111331133311311333313311313331333333
Expected output:
0
``` 
