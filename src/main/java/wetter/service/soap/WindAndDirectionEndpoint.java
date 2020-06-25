package wetter.service.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.wetter_service.java.GetForecastRequest;
import com.wetter_service.java.GetWindAndDirectionResponse;
import com.wetter_service.java.WindAndDirection;

import java.util.Random;


@Endpoint
public class WindAndDirectionEndpoint {
	private static final String NAMESPACE_URI = "http://www.wetter-service.com/java";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWindAndDirectionRequest")
	@ResponsePayload
	public GetWindAndDirectionResponse getForecast(@RequestPayload GetForecastRequest request) {
		GetWindAndDirectionResponse response = new GetWindAndDirectionResponse();
		if(request.getCountry().equals("Wien")) {
			
			WindAndDirection obj = new WindAndDirection();
			Random random = new Random();
			double randomWind = random.nextDouble() * (190.0 - 0.0) + 0.0;
			
			String[] arrOfDirections ={"North", "South", "West", "East"};
			Random r=new Random();
			int index = r.nextInt(arrOfDirections.length);
			
			obj.setWind(randomWind);
			obj.setDirection(arrOfDirections[index]);
			response.setWindAndDirection(obj);
		
		}
		return response;
	}
}