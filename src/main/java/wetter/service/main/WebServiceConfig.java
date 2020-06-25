package wetter.service.main;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "countries")
	public DefaultWsdl11Definition defaultWsdl11Definition() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("CountriesPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://www.wetter-service.com/java");
		wsdl11Definition.setSchemaCollection(schemaCollection());
		// wsdl11Definition.setSchema(new SimpleXsdSchema(new ClassPathResource("countries.xsd")));
		return wsdl11Definition;
	}

	@Bean(name = "forecast")
	public DefaultWsdl11Definition forecastDefinition() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ForecastPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://www.wetter-service.com/java");
		wsdl11Definition.setSchemaCollection(schemaCollection());
		// wsdl11Definition.setSchema(new SimpleXsdSchema(new ClassPathResource("forecast.xsd")));
		return wsdl11Definition;
	}

	@Bean(name = "temperature")
	public DefaultWsdl11Definition temperatureDefinition() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("TemperaturePort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://www.wetter-service.com/java");
		wsdl11Definition.setSchemaCollection(schemaCollection());
		// wsdl11Definition.setSchema(new SimpleXsdSchema(new ClassPathResource("temperature.xsd")));
		return wsdl11Definition;
	}

	@Bean(name = "windAndDirection")
	public DefaultWsdl11Definition windAndDirectionDefinition() {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("WindAndDirectionPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://www.wetter-service.com/java");
		wsdl11Definition.setSchemaCollection(schemaCollection());
		return wsdl11Definition;
	}

	@Bean
	public XsdSchemaCollection schemaCollection() {
		CommonsXsdSchemaCollection commonsXsdSchemaCollection = new CommonsXsdSchemaCollection(
				new ClassPathResource("countries.xsd"),
				new ClassPathResource("forecast.xsd"), new ClassPathResource("temperatur.xsd"), new ClassPathResource("windAndDirection.xsd"));
		commonsXsdSchemaCollection.setInline(true);
		return commonsXsdSchemaCollection;
	}

}