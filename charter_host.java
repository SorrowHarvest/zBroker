package manager;

import java.io.IOException;
import java.io.FileWriter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class charter_host {

	public charter_host() {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.cryptocurrencychart.com/live-prices/XMR"))
                .GET() // GET is default
                .build();

        HttpResponse<String> response = null;
		try {
			response = client.send(request,
			        HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
            FileWriter imprint_chart = new FileWriter("coinchart.txt", false);
            imprint_chart.write(response.body());
            imprint_chart.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
        System.out.println(response.body());
	}
}
