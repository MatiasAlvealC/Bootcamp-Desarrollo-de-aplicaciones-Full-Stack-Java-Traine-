package cl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TemplateController {
	private final RestTemplate restTemplate;

	@Autowired
	public TemplateController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping("/test")
	public Object getApi() {
	String url = "https://jsonplaceholder.typicode.com/todos/1";
	return restTemplate.getForObject(url, Object.class);
	}
}
