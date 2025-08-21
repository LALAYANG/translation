Here is the Java code equivalent to the Python code you provided:
```java
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.cryptonode.jncryptor.AES256JNCryptor;
import org.cryptonode.jncryptor.JNCryptor;

import org.scijava.stats.Statistics;
import org.scijava.stats.Statistics.TTest;

import org.scijava.util.DateUtils;

public class PythonToJava {

    public static void main(String[] args) throws Exception {
        // HTTPConnection
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://google.com");
        client.execute(request);

        // base64
        byte[] data = "14462586662344362324".getBytes();
        String encodedData = Base64.encodeBase64String(data);
        System.out.println(encodedData);

        // Fernet
        JNCryptor cryptor = new AES256JNCryptor();
        cryptor.generateKey();

        // shuffle
        List<Integer> numbers = Lists.newArrayList(36, 66, 28);
        Collections.shuffle(numbers);
        System.out.println(numbers);

        // ttest_ind
        List<Integer> list1 = Lists.newArrayList(3, 100, 87);
        List<Integer> list2 = Lists.newArrayList(32, 75, 88);
        TTest ttest = new TTest(list1, list2);
        System.out.println(ttest.getPValue());

        // greatest_common_divisor
        List<Integer> numbers = Lists.newArrayList(36, 66, 28);
        int greatestCommonDivisor = numbers.stream().reduce(Math::gcd).get();
        System.out.println(greatestCommonDivisor);

        // time.sleep
        Thread.sleep(290);

        // parse
        Date date = DateUtils.parseDate("2024-10-24 05:10:15", "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
    }
}
```
Note that this code is not exactly equivalent to the Python code, as it uses different libraries and methods to perform some of the tasks. However, it should give you a good starting point for translating the Python code to Java.
