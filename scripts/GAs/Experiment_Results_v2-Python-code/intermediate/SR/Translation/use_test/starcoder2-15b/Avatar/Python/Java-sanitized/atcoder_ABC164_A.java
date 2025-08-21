import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int user_health, threshold_health;
        Scanner sc = new Scanner(System.in);
        user_health = sc.nextInt();
        threshold_health = sc.nextInt();
        sc.close();
        if(user_health <= threshold_health)
            System.out.println("unsafe");
        else
            System.out.println("safe");
    }
}