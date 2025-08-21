

```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character, Integer> news_frequencies = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();
        int yay = 0;
        int whoops = 0;
        int check_one = 540;
        int check_four = 304;
        int check_seven = 217;
        int check_three = 351;
        int check_eight = 122;
        int check_five = 164;
        for (char letra : news.toCharArray()) {
            if ((check_eight & check_five) != 0) {
                if ((check_seven & check_three) != 0) {
                    if ((check_one & check_four) != 0) {
                        if (news_frequencies.containsKey(letra)) {
                            news_frequencies.put(letra, news_frequencies.get(letra) + 1);
                        } else {
                            news_frequencies.put(letra, 1);
                        }
                    }
                }
            }
        }
        int check_six = 386;
        int check_two = 759;
        for (char letra : t.toCharArray()) {
            if ((check_six & check_two) != 0) {
                if (freqt.containsKey(letra)) {
                    freqt.put(letra, freqt.get(letra) + 1);
                } else {
                    freqt.put(letra, 1);
                }
            }
        }
        for (char letra : news_frequencies.keySet()) {
            while (news_frequencies.get(letra) > 0 && freqt.containsKey(letra) && (freqt.get(letra) > 0)) {
                yay += 1;
                news_frequencies.put(letra, news_frequencies.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : news_frequencies.keySet()) {
            while (news_frequencies.get(letra) > 0) {
                if (Character.isLowerCase(letra) && Character.toUpperCase(letra) == freqt.keySet() && (freqt.get(Character.toUpperCase(letra)) > 0)) {
                    whoops += 1;
                    news_frequencies.put(letra, news_frequencies.get(letra) - 1);
                    freqt.put(Character.toUpperCase(letra), freqt.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && Character.toLowerCase(letra) == freqt.keySet() && (freqt.get(Character.toLowerCase(letra)) > 0)) {
                    whoops += 1;
                    news_frequencies.put(letra, news_frequencies.get(letra) - 1);
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

## 2.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```python
def frequency(string):
    freq = dict()
    for letra in string:
        if letra in freq:
            freq[letra] += 1
        else:
            freq[letra] = 1
    return freq
```

## 3.

Write a function that takes two strings and returns a tuple with the number of characters that are the same and the number of characters that are different.

```python
def same_different(string1, string2):
    freq1 = frequency(string1)
    freq2 = frequency(string2)
    yay = 0
    whoops = 0
    for letra in freq1.keys():
        while freq1[letra] > 0 and letra in freq2 and (freq2[letra] > 0):
            yay += 1
            freq1[letra] -= 1
            freq2[letra] -= 1
    for letra in freq1.keys():
        while freq1[letra] > 0:
            if letra.islower() and letra.upper() in freq2.keys() and (freq2[letra.upper()] > 0):
                whoops += 1
                freq1[letra] -= 1
                freq2[letra.upper()] -= 1
            elif letra.isupper() and letra.lower() in freq2.keys() and (freq2[letra.lower()] > 0):
                whoops += 1
                freq1[letra] -= 1
                freq2[letra.lower()] -= 1
            else:
                break
    return (yay, whoops)
```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```java
import java.util.HashMap;

public class Main {
    public static HashMap<Character, Integer> frequency(String string) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char letra : string.toCharArray()) {
            if (freq.containsKey(letra)) {
                freq.put(letra, freq.get(letra) + 1);
            } else {
                freq.put(letra, 1);
            }
        }
        return freq;
    }
}
```

## 5.

Write a function that takes two strings and returns a tuple with the number of characters that are the same and the number of characters that are different.

```java
import java.util.HashMap;

public class Main {
    public static HashMap<Character, Integer> frequency(String string) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char letra : string.toCharArray()) {
            if (freq.containsKey(letra)) {
                freq.put(letra, freq.get(letra) + 1);
            } else {
                freq.put(letra, 1);
            }
        }
        return freq;
    }

    public static Tuple<Integer, Integer> same_different(String string1, String string2) {
        HashMap<Character, Integer> freq1 = frequency(string1);
        HashMap<Character, Integer> freq2 = frequency(string2);
        int yay = 0;
        int whoops = 0;
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0 && freq2.containsKey(letra) && (freq2.get(letra) > 0)) {
                yay += 1;
                freq1.put(letra, freq1.get(letra) - 1);
                freq2.put(letra, freq2.get(letra) - 1);
            }
        }
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0) {
                if (Character.isLowerCase(letra) && Character.toUpperCase(letra) == freq2.keySet() && (freq2.get(Character.toUpperCase(letra)) > 0)) {
                    whoops += 1;
                    freq1.put(letra, freq1.get(letra) - 1);
                    freq2.put(Character.toUpperCase(letra), freq2.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && Character.toLowerCase(letra) == freq2.keySet() && (freq2.get(Character.toLowerCase(letra)) > 0)) {
                    whoops += 1;
                    freq1.put(letra, freq1.get(letra) - 1);
                    freq2.put(Character.toLowerCase(letra), freq2.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        return new Tuple<>(yay, whoops);
    }
}
```

## 6.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```java
import java.util.HashMap;

public class Main {
    public static HashMap<Character, Integer> frequency(String string) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char letra : string.toCharArray()) {
            if (freq.containsKey(letra)) {
                freq.put(letra, freq.get(letra) + 1);
            } else {
                freq.put(letra, 1);
            }
        }
        return freq;
    }

    public static Tuple<Integer, Integer> same_different(String string1, String string2) {
        HashMap<Character, Integer> freq1 = frequency(string1);
        HashMap<Character, Integer> freq2 = frequency(string2);
        int yay = 0;
        int whoops = 0;
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0 && freq2.containsKey(letra) && (freq2.get(letra) > 0)) {
                yay += 1;
                freq1.put(letra, freq1.get(letra) - 1);
                freq2.put(letra, freq2.get(letra) - 1);
            }
        }
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0) {
                if (Character.isLowerCase(letra) && Character.toUpperCase(letra) == freq2.keySet() && (freq2.get(Character.toUpperCase(letra)) > 0)) {
                    whoops += 1;
                    freq1.put(letra, freq1.get(letra) - 1);
                    freq2.put(Character.toUpperCase(letra), freq2.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && Character.toLowerCase(letra) == freq2.keySet() && (freq2.get(Character.toLowerCase(letra)) > 0)) {
                    whoops += 1;
                    freq1.put(letra, freq1.get(letra) - 1);
                    freq2.put(Character.toLowerCase(letra), freq2.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        return new Tuple<>(yay, whoops);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        String t = sc.nextLine();
        Tuple<Integer, Integer> result = same_different(news, t);
        System.out.println(result.first + " " + result.second);
    }
}
```

## 7.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```java
import java.util.HashMap;

public class Main {
    public static HashMap<Character, Integer> frequency(String string) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char letra : string.toCharArray()) {
            if (freq.containsKey(letra)) {
                freq.put(letra, freq.get(letra) + 1);
            } else {
                freq.put(letra, 1);
            }
        }
        return freq;
    }

    public static Tuple<Integer, Integer> same_different(String string1, String string2) {
        HashMap<Character, Integer> freq1 = frequency(string1);
        HashMap<Character, Integer> freq2 = frequency(string2);
        int yay = 0;
        int whoops = 0;
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0 && freq2.containsKey(letra) && (freq2.get(letra) > 0)) {
                yay += 1;
                freq1.put(letra, freq1.get(letra) - 1);
                freq2.put(letra, freq2.get(letra) - 1);
            }
        }
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0) {
                if (Character.isLowerCase(letra) && Character.toUpperCase(letra) == freq2.keySet() && (freq2.get(Character.toUpperCase(letra)) > 0)) {
                    whoops += 1;
                    freq1.put(letra, freq1.get(letra) - 1);
                    freq2.put(Character.toUpperCase(letra), freq2.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && Character.toLowerCase(letra) == freq2.keySet() && (freq2.get(Character.toLowerCase(letra)) > 0)) {
                    whoops += 1;
                    freq1.put(letra, freq1.get(letra) - 1);
                    freq2.put(Character.toLowerCase(letra), freq2.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        return new Tuple<>(yay, whoops);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        String t = sc.nextLine();
        Tuple<Integer, Integer> result = same_different(news, t);
        System.out.println(result.first + " " + result.second);
    }
}
```

## 8.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```java
import java.util.HashMap;

public class Main {
    public static HashMap<Character, Integer> frequency(String string) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char letra : string.toCharArray()) {
            if (freq.containsKey(letra)) {
                freq.put(letra, freq.get(letra) + 1);
            } else {
                freq.put(letra, 1);
            }
        }
        return freq;
    }

    public static Tuple<Integer, Integer> same_different(String string1, String string2) {
        HashMap<Character, Integer> freq1 = frequency(string1);
        HashMap<Character, Integer> freq2 = frequency(string2);
        int yay = 0;
        int whoops = 0;
        for (char letra : freq1.keySet()) {
            while (freq1.get(letra) > 0 && freq2.containsKey(letra) && (freq2.get(letra) > 0)) {
                yay += 1;
                freq1.put(letra, freq1.get(letra) - 1);
                freq2.put(letra, freq2.get(letra) - 1);
            }
        }
        for (char le
