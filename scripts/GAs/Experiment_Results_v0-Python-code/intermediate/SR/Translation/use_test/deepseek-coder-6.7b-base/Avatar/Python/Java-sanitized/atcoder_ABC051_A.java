import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://google.com"))
                .timeout(Duration.ofSeconds(1))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
        System.out.println(Base64.getEncoder().encodeToString("23766616823515439923".getBytes()));
        System.out.println(Stream.of(67, 64, 100).collect(Collectors.toList()));
        System.out.println(new Date());
        System.out.println(new Scanner(System.in).nextLine().replace(",", " "));
        System.out.println(ThreadLocalRandom.current().nextInt(1, 100));
    }
}