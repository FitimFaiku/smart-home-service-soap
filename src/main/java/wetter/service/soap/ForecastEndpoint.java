package wetter.service.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.wetter_service.java.GetForecastRequest;
import com.wetter_service.java.GetForecastResponse;



@Endpoint
public class ForecastEndpoint {
	private static final String NAMESPACE_URI = "http://www.wetter-service.com/java";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getForecastRequest")
	@ResponsePayload
	public GetForecastResponse getForecast(@RequestPayload GetForecastRequest request) {
		GetForecastResponse response = new GetForecastResponse();
		if(request.getCountry().equals("Wien")) {
			response.getBeschreibung().add("Sonnig bei 25 grad.");
			response.getBeschreibung().add("Sonnig bei 30 grad.");
			response.getBeschreibung().add("Regnerisch bei 17 grad.");
			response.getBeschreibung().add("Wolkig bei 20 grad.");
			response.getBeschreibung().add("Hagel bei 17 grad.");
			response.getBeschreibung().add("Sonnig bei 23 grad.");
			response.getBeschreibung().add("Sonnig bei 25 grad.");
		}
		return response;
	}
}