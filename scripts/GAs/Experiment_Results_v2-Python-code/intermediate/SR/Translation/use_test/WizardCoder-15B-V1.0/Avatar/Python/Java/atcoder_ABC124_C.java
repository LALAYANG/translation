```java
import java.util.*;

public class PythonToJava {

    public static int sum_arguments(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int my_decorator(int a, int b) {
        return sum_arguments(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> input_list = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            input_list.add(Integer.parseInt(input.charAt(i) + ""));
        }
        Map<Integer, Integer> even_counts = new HashMap<Integer, Integer>();
        for (int i = 0; i < input_list.size(); i += 2) {
            if (even_counts.containsKey(input_list.get(i))) {
                even_counts.put(input_list.get(i), even_counts.get(input_list.get(i)) + 1);
            } else {
                even_counts.put(input_list.get(i), 1);
            }
        }
        Map<Integer, Integer> odd_counts = new HashMap<Integer, Integer>();
        for (int i = 1; i < input_list.size(); i += 2) {
            if (odd_counts.containsKey(input_list.get(i))) {
                odd_counts.put(input_list.get(i), odd_counts.get(input_list.get(i)) + 1);
            } else {
                odd_counts.put(input_list.get(i), 1);
            }
        }
        int min_value = Math.min(input_list.size() - my_decorator(even_counts.get(0), odd_counts.get(1)), input_list.size() - (even_counts.get(1) + odd_counts.get(0)));
        System.out.println(min_value);
    }
}
```
