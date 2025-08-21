import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.List;
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

import com.google.common.collect.Lists;
import com.google.common.io.BaseEncoding;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class atcoder_ABC171_B {

    public static void main(String[] args) throws Exception {
        String input = "111 47\n368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827";
        String[] lines = input.split("\n");
        int[] arr = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            arr[i] = Integer.parseInt(lines[i]);
        }
        int num_elements = 111;
        int top_k_elements = 47;
        List<Integer> list = Lists.newArrayList(arr);
        Random random = new Random();
        Collections.shuffle(list, random);
        int[] topK = new int[top_k_elements];
        for (int i = 0; i < top_k_elements; i++) {
            topK[i] = list.get(i);
        }
        int sum = 0;
        for (int i = 0; i < top_k_elements; i++) {
            sum += topK[i];
        }
        System.out.println(sum);
    }
}