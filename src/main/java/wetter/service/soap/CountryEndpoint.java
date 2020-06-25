package wetter.service.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.wetter_service.java.Country;
import com.wetter_service.java.Currency;
import com.wetter_service.java.GetCountryRequest;
import com.wetter_service.java.GetCountryResponse;



@Endpoint
public class CountryEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.wetter-service.com/java";


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		Country c = new Country();
		c.setCapital("Wien");
		c.setCurrency(Currency.EUR);
		c.setName("Austria");
		c.setPopulation(100);
		response.setCountry(c);
		return response;
	}
}