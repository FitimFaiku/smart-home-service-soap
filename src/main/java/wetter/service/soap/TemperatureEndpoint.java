package wetter.service.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.wetter_service.java.GetTemperaturRequest;
import com.wetter_service.java.GetTemperaturResponse;

import java.util.Random;



@Endpoint
public class TemperatureEndpoint {
	private static final String NAMESPACE_URI = "http://www.wetter-service.com/java";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTemperaturRequest")
	@ResponsePayload
	public GetTemperaturResponse getForecast(@RequestPayload GetTemperaturRequest request) {
		GetTemperaturResponse response = new GetTemperaturResponse();
		 Random random = new Random();
	     double randomTemperature = random.nextDouble() * (27.0 - 18.0) + 18.0;
		response.setTemperatur(randomTemperature);
		return response;
	}
}