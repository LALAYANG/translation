```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pya = scanner.nextInt();
        List<String> arre = new ArrayList<>();
        while (pya-- > 0) {
            arre.add(scanner.next().toLowerCase());
        }
        String oString = scanner.next();
        String lowString = oString.toLowerCase();
        String letter1 = scanner.next().substring(0, 1).toLowerCase();
        String letter2 = "a".equals(letter1) ? "b" : "a";
        int[] valid = new int[oString.length()];
        Set<Integer> setcito = new HashSet<>();
        for (String x : arre) {
            int wat = 0;
            while (true) {
                int index = lowString.indexOf(x, wat);
                if (index < 0) {
                    break;
                }
                for (int i = index; i < index + x.length(); i++) {
                    setcito.add(i);
                }
                wat = index + 1;
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            String letter = lowString.charAt(i) != letter1.charAt(0) ? letter1 : letter2;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter.charAt(0) : letter.toUpperCase().charAt(0);
        }
        System.out.println(new String(oStringArray));
    }
}
```

