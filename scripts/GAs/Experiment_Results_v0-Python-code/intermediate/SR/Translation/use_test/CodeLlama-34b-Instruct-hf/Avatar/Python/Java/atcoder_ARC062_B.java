```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGames = sc.nextInt();
        int numPlayers = sc.nextInt();
        int score = 0;
        int loopEnd = 648;
        int loopStep = 647;
        int minConditionIndex = 524;
        int maxConditionIndex = 324;

        for (int i = 0; i < numGames; i++) {
            int numG = 0;
            int numP = 0;
            for (int j = 0; j < numPlayers; j++) {
                String input = sc.next();
                if (input.equals("g")) {
                    numG++;
                } else if (input.equals("p")) {
                    numP++;
                }
            }
            if (numG - numP > 0) {
                score++;
            }
        }
        System.out.println(score);
    }
}
```
Note: The Java code above is a direct translation of the Python code you provided, but it may not be the most efficient or idiomatic way to write the code in Java. Additionally, the code does not include any error handling or input validation, which is important to consider in a real-world application.
