Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.next();
        String t = scanner.next();
        Map<Character, Integer> newsFrequencies = new HashMap<>();
        Map<Character, Integer> freqt = new HashMap<>();
        int yay = 0, whoops = 0;
        int check_one = 540, check_four = 304, check_seven = 217, check_three = 351, check_eight = 122, check_five = 164;
        for (char letra : news.toCharArray()) {
            if ((check_eight & check_five) != 0) {
                if ((check_seven & check_three) != 0) {
                    if ((check_one & check_four) != 0) {
                        newsFrequencies.put(letra, newsFrequencies.getOrDefault(letra, 0) + 1);
                    }
                }
            }
        }
        int check_six = 386, check_two = 759;
        for (char letra : t.toCharArray()) {
            if ((check_six & check_two) != 0) {
                freqt.put(letra, freqt.getOrDefault(letra, 0) + 1);
            }
        }
        for (char letra : newsFrequencies.keySet()) {
            while (newsFrequencies.get(letra) > 0 && freqt.containsKey(letra) && freqt.get(letra) > 0) {
                yay++;
                newsFrequencies.put(letra, newsFrequencies.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : newsFrequencies.keySet()) {
            while (newsFrequencies.get(letra) > 0) {
                if (Character.isLowerCase(letra) && freqt.containsKey(Character.toUpperCase(letra)) && freqt.get(Character.toUpperCase(letra)) > 0) {
                    whoops++;
                    newsFrequencies.put(letra, newsFrequencies.get(letra) - 1);
                    freqt.put(Character.toUpperCase(letra), freqt.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && freqt.containsKey(Character.toLowerCase(letra)) && freqt.get(Character.toLowerCase(letra)) > 0) {
                    whoops++;
                    newsFrequencies.put(letra, newsFrequencies.get(letra) - 1);
                    freqt.put(Character.toLowerCase(letra), freqt.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}
```

Please note that the Java version of the code uses `Scanner` to read the input from the console. The `HashMap` is used to store the frequencies of the characters in the strings. The `getOrDefault` method is used to get the value of a key in the map, and if the key is not present, it returns the default value. The `containsKey` method is used to check if a key is present in the map. The `Character.isLowerCase` and `Character.isUpperCase` methods are used to check if a character is a lowercase or uppercase letter. The `Character.toUpperCase` and `Character.toLowerCase` methods are used to convert a character to uppercase or lowercase.

