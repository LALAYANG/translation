```java
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.google.common.collect.Lists;

import edu.stanford.nlp.util.Triple;
import edu.stanford.nlp.util.TripleIterator;
import edu.stanford.nlp.util.TripleIterator.Direction;
import edu.stanford.nlp.util.TripleIterator.Order;
import edu.stanford.nlp.util.TripleIterator.Style;
import edu.stanford.nlp.util.TripleIterator.Type;

public class PythonToJava {

    public static void main(String[] args) throws Exception {
        int targetSize = Integer.parseInt(args[0]);
        List<Integer> combinedSet = Lists.newArrayList(Arrays.asList(args[1].split(" ")));
        List<Integer> secondSet = Lists.newArrayList(Arrays.asList(args[2].split(" ")));
        combinedSet.remove(0);
        secondSet.remove(0);
        Set<Integer> combinedSetSet = new HashSet<>(combinedSet);
        Set<Integer> secondSetSet = new HashSet<>(secondSet);
        if ((combinedSetSet.contains(condition1_part1) && combinedSetSet.contains(condition1_part2)) || (secondSetSet.contains(condition1_part1) && secondSetSet.contains(condition1_part2))) {
            if ((combinedSetSet.contains(condition2_part1) && combinedSetSet.contains(condition2_part2)) || (secondSetSet.contains(condition2_part1) && secondSetSet.contains(condition2_part2))) {
                if (combinedSetSet.contains(0)) {
                    combinedSetSet.remove(0);
                } else if (secondSetSet.contains(0)) {
                    secondSetSet.remove(0);
                }
            }
        }
        Set<Integer> unionSet = new HashSet<>(combinedSetSet);
        unionSet.addAll(secondSetSet);
        if (unionSet.size() != targetSize) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```
