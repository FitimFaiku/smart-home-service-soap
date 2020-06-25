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
import io.spring.guides.gs_producing_web_service.GetTemperaturRequest;
import io.spring.guides.gs_producing_web_service.GetTemperaturResponse;

@Endpoint
public class TemperatureEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

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