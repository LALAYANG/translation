```java
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PythonToJava {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String luckyString = "abcd";
        String result = "";

        Random rand = new Random();
        int[] arr = {28, 72, 50};
        int[] arr2 = {19, 7, 23};

        for (int i = 0; i < n; i++) {
            result += luckyString.charAt(rand.nextInt(luckyString.length()));
        }

        System.out.println(result);
    }
}
```
