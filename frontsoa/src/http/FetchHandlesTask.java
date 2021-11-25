package http;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import jdk.internal.org.objectweb.asm.Handle;
import sun.net.www.http.HttpClient;

public class FetchHandlesTask {

    private Gson gson = new Gson();
    private String url = "http://localhost:8085/handles";

    @Override
    protected Handle[] call() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(),Handle[].class);
    }
}
