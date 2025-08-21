import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userHealth = scanner.nextInt();
        int thresholdHealth = scanner.nextInt();
        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}