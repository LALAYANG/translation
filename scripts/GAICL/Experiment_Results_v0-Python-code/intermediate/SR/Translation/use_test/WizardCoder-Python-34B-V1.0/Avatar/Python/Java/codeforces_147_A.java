```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.time.DateUtils;

import com.google.common.io.BaseEncoding;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        String[] punctuation = {",", ".", "!", "?"};
        int outer_loop_limit = 208;
        int inner_loop_limit = 207;
        String[] res = new String[0];
        String[] inputArray = input.split(" ");
        for (int i = 0; i < outer_loop_limit / inner_loop_limit; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (j > 0 && inputArray[j].isEmpty()) {
                    if (!res[res.length - 1].isEmpty()) {
                        res = Arrays.copyOf(res, res.length + 1);
                        res[res.length - 1] = inputArray[j];
                    }
                } else if (Arrays.asList(punctuation).contains(inputArray[j])) {
                    if (!res[res.length - 1].isEmpty()) {
                        res[res.length - 1] = "";
                        res = Arrays.copyOf(res, res.length + 1);
                        res[res.length - 1] = inputArray[j];
                        res = Arrays.copyOf(res, res.length + 1);
                        res[res.length - 1] = "";
                    }
                } else {
                    if (!inputArray[j].isEmpty() && !Arrays.asList(punctuation).contains(inputArray[j])) {
                        res = Arrays.copyOf(res, res.length + 1);
                        res[res.length - 1] = inputArray[j];
                    }
                }
            }
        }
        System.out.println(String.join("", res));
    }
}
```

Test input:
mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l

Expected output:
mck. gq dauqminf wee bazyzy humnv d pgtvx, vxntxgrkrc rg rwr, uuyweyz l
``` 
