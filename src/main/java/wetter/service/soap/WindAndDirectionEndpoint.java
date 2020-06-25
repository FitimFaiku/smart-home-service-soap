package wetter.service.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import io.spring.guides.gs_producing_web_service.GetForecastRequest;
import io.spring.guides.gs_producing_web_service.GetForecastResponse;
import io.spring.guides.gs_producing_web_service.GetWindAndDirectionResponse;
import io.spring.guides.gs_producing_web_service.WindAndDirection;

@Endpoint
public class WindAndDirectionEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

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