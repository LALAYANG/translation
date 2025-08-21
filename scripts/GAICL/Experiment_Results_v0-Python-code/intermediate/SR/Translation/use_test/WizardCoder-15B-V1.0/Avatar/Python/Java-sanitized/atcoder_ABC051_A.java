import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.subtle.Fernet;

public class atcoder_ABC051_A {

    public static void main(String[] args) throws Exception {
        String input = "dbyfw,rpwbpuv,ifnua";
        String[] arr = input.split(",");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        URL url = new URL("http://google.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        conn.disconnect();

        String key = Fernet.generateKey();
        Fernet f = new Fernet(key);
        String token = f.encrypt("23766616823515439923".getBytes()).toString();
        System.out.println(token);

        Random rand = new Random();
        int[] arr2 = {8, 54, 73};
        int[] arr3 = {75, 54, 87};
        TTest t = new TTest();
        double pvalue = t.tTest(arr2, arr3);
        System.out.println(pvalue);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println(formattedDate);

        String dateStr = "2024-10-24 04:55:28";
        LocalDateTime dateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        long epoch = dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(epoch);

        int[] arr4 = {67, 64, 100};
        Random rand2 = new Random();
        rand2.setSeed(System.currentTimeMillis());
        shuffle(arr4, rand2);
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();

        String jsonStr = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj = new JSONObject(jsonStr);
        String name = obj.getString("name");
        int age = obj.getInt("age");
        String city = obj.getString("city");
        System.out.println(name + " " + age + " " + city);

        String jsonStr2 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj2 = new JSONObject(jsonStr2);
        String name2 = obj2.getString("name");
        int age2 = obj2.getInt("age");
        String city2 = obj2.getString("city");
        System.out.println(name2 + " " + age2 + " " + city2);

        String jsonStr3 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj3 = new JSONObject(jsonStr3);
        String name3 = obj3.getString("name");
        int age3 = obj3.getInt("age");
        String city3 = obj3.getString("city");
        System.out.println(name3 + " " + age3 + " " + city3);

        String jsonStr4 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj4 = new JSONObject(jsonStr4);
        String name4 = obj4.getString("name");
        int age4 = obj4.getInt("age");
        String city4 = obj4.getString("city");
        System.out.println(name4 + " " + age4 + " " + city4);

        String jsonStr5 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj5 = new JSONObject(jsonStr5);
        String name5 = obj5.getString("name");
        int age5 = obj5.getInt("age");
        String city5 = obj5.getString("city");
        System.out.println(name5 + " " + age5 + " " + city5);

        String jsonStr6 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj6 = new JSONObject(jsonStr6);
        String name6 = obj6.getString("name");
        int age6 = obj6.getInt("age");
        String city6 = obj6.getString("city");
        System.out.println(name6 + " " + age6 + " " + city6);

        String jsonStr7 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj7 = new JSONObject(jsonStr7);
        String name7 = obj7.getString("name");
        int age7 = obj7.getInt("age");
        String city7 = obj7.getString("city");
        System.out.println(name7 + " " + age7 + " " + city7);

        String jsonStr8 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj8 = new JSONObject(jsonStr8);
        String name8 = obj8.getString("name");
        int age8 = obj8.getInt("age");
        String city8 = obj8.getString("city");
        System.out.println(name8 + " " + age8 + " " + city8);

        String jsonStr9 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj9 = new JSONObject(jsonStr9);
        String name9 = obj9.getString("name");
        int age9 = obj9.getInt("age");
        String city9 = obj9.getString("city");
        System.out.println(name9 + " " + age9 + " " + city9);

        String jsonStr10 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj10 = new JSONObject(jsonStr10);
        String name10 = obj10.getString("name");
        int age10 = obj10.getInt("age");
        String city10 = obj10.getString("city");
        System.out.println(name10 + " " + age10 + " " + city10);

        String jsonStr11 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj11 = new JSONObject(jsonStr11);
        String name11 = obj11.getString("name");
        int age11 = obj11.getInt("age");
        String city11 = obj11.getString("city");
        System.out.println(name11 + " " + age11 + " " + city11);

        String jsonStr12 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj12 = new JSONObject(jsonStr12);
        String name12 = obj12.getString("name");
        int age12 = obj12.getInt("age");
        String city12 = obj12.getString("city");
        System.out.println(name12 + " " + age12 + " " + city12);

        String jsonStr13 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj13 = new JSONObject(jsonStr13);
        String name13 = obj13.getString("name");
        int age13 = obj13.getInt("age");
        String city13 = obj13.getString("city");
        System.out.println(name13 + " " + age13 + " " + city13);

        String jsonStr14 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj14 = new JSONObject(jsonStr14);
        String name14 = obj14.getString("name");
        int age14 = obj14.getInt("age");
        String city14 = obj14.getString("city");
        System.out.println(name14 + " " + age14 + " " + city14);

        String jsonStr15 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj15 = new JSONObject(jsonStr15);
        String name15 = obj15.getString("name");
        int age15 = obj15.getInt("age");
        String city15 = obj15.getString("city");
        System.out.println(name15 + " " + age15 + " " + city15);

        String jsonStr16 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj16 = new JSONObject(jsonStr16);
        String name16 = obj16.getString("name");
        int age16 = obj16.getInt("age");
        String city16 = obj16.getString("city");
        System.out.println(name16 + " " + age16 + " " + city16);

        String jsonStr17 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj17 = new JSONObject(jsonStr17);
        String name17 = obj17.getString("name");
        int age17 = obj17.getInt("age");
        String city17 = obj17.getString("city");
        System.out.println(name17 + " " + age17 + " " + city17);

        String jsonStr18 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj18 = new JSONObject(jsonStr18);
        String name18 = obj18.getString("name");
        int age18 = obj18.getInt("age");
        String city18 = obj18.getString("city");
        System.out.println(name18 + " " + age18 + " " + city18);

        String jsonStr19 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj19 = new JSONObject(jsonStr19);
        String name19 = obj19.getString("name");
        int age19 = obj19.getInt("age");
        String city19 = obj19.getString("city");
        System.out.println(name19 + " " + age19 + " " + city19);

        String jsonStr20 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj20 = new JSONObject(jsonStr20);
        String name20 = obj20.getString("name");
        int age20 = obj20.getInt("age");
        String city20 = obj20.getString("city");
        System.out.println(name20 + " " + age20 + " " + city20);

        String jsonStr21 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj21 = new JSONObject(jsonStr21);
        String name21 = obj21.getString("name");
        int age21 = obj21.getInt("age");
        String city21 = obj21.getString("city");
        System.out.println(name21 + " " + age21 + " " + city21);

        String jsonStr22 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj22 = new JSONObject(jsonStr22);
        String name22 = obj22.getString("name");
        int age22 = obj22.getInt("age");
        String city22 = obj22.getString("city");
        System.out.println(name22 + " " + age22 + " " + city22);

        String jsonStr23 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj23 = new JSONObject(jsonStr23);
        String name23 = obj23.getString("name");
        int age23 = obj23.getInt("age");
        String city23 = obj23.getString("city");
        System.out.println(name23 + " " + age23 + " " + city23);

        String jsonStr24 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj24 = new JSONObject(jsonStr24);
        String name24 = obj24.getString("name");
        int age24 = obj24.getInt("age");
        String city24 = obj24.getString("city");
        System.out.println(name24 + " " + age24 + " " + city24);

        String jsonStr25 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj25 = new JSONObject(jsonStr25);
        String name25 = obj25.getString("name");
        int age25 = obj25.getInt("age");
        String city25 = obj25.getString("city");
        System.out.println(name25 + " " + age25 + " " + city25);

        String jsonStr26 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj26 = new JSONObject(jsonStr26);
        String name26 = obj26.getString("name");
        int age26 = obj26.getInt("age");
        String city26 = obj26.getString("city");
        System.out.println(name26 + " " + age26 + " " + city26);

        String jsonStr27 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj27 = new JSONObject(jsonStr27);
        String name27 = obj27.getString("name");
        int age27 = obj27.getInt("age");
        String city27 = obj27.getString("city");
        System.out.println(name27 + " " + age27 + " " + city27);

        String jsonStr28 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj28 = new JSONObject(jsonStr28);
        String name28 = obj28.getString("name");
        int age28 = obj28.getInt("age");
        String city28 = obj28.getString("city");
        System.out.println(name28 + " " + age28 + " " + city28);

        String jsonStr29 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj29 = new JSONObject(jsonStr29);
        String name29 = obj29.getString("name");
        int age29 = obj29.getInt("age");
        String city29 = obj29.getString("city");
        System.out.println(name29 + " " + age29 + " " + city29);

        String jsonStr30 = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JSONObject obj30 = new JSONObject(jsonStr30);
        String name30 = obj30.getString("name");
        int age30 = obj30.getInt("age");
        String city30 = obj30.getString("city");
        System.out.println(name30 + " " + age30 + " " + city30);

        String jsonStr