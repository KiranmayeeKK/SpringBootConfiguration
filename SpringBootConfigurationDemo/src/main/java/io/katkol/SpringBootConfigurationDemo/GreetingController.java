package io.katkol.SpringBootConfigurationDemo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	public GreetingController() {
	}

	@Value("${my.greeting: default text here}")
	private String greetingMessage;
	
	@Value("some static text here")
	private String staticMessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@Value("#{${myKeyValuePairs}}") // # treats the text in the {} after it as spring expression language (spel)
	private Map<String,String> keyValuePairs;
	
	@Autowired
	private DbSettings dbSettings;
	@GetMapping("/greeting")
	public String greeting() {
		//return greetingMessage + staticMessage + listValues + keyValuePairs;
		return dbSettings.getConnection() + " " +dbSettings.getHost();
	}
	
	
	

}
