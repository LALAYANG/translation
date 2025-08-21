import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.common.util.concurrent.Uninterruptibles;

public class codeforces_147_A {

    public static void main(String[] args) throws Exception {
        String s = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        String[] res = new String[s.length()];
        int outerLoopLimit = 208;
        int innerLoopLimit = 207;
        int loopIndexOut = 0;
        int charIndex = 0;
        char[] chars = s.toCharArray();
        char[] punctuation = {',', '.', '!', '?'};
        boolean isPunctuation = false;
        boolean isLastCharEmpty = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            if (chars[i] == punctuation[0]) {
                isPunctuation = true;
                continue;
            }
            if (chars[i] == punctuation[1]) {
                isPunctuation = true;
                continue;
            }
            if (chars[i] == punctuation[2]) {
                isPunctuation = true;
                continue;
            }
            if (chars[i] == punctuation[3]) {
                isPunctuation = true;
                continue;
            }
            if (isPunctuation) {
                if (isLastCharEmpty) {
                    res[charIndex] = String.valueOf(chars[i]);
                } else {
                    res[charIndex] = res[charIndex] + String.valueOf(chars[i]);
                }
                isPunctuation = false;
                isLastCharEmpty = false;
            } else {
                if (res[charIndex] == null) {
                    res[charIndex] = String.valueOf(chars[i]);
                } else {
                    res[charIndex] = res[charIndex] + String.valueOf(chars[i]);
                }
                isLastCharEmpty = false;
            }
            if (chars[i] == ' ') {
                charIndex++;
                isLastCharEmpty = true;
            }
        }
        System.out.println(res);
    }
}