package cl.controller;

import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.expression.Arrays;

import cl.models.Post;

@RestController
public class PostController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value ="/template/post")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders(); headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.GET, entity,String.class).getBody();
	}
	// crear
	@RequestMapping(value ="/template/post", method = RequestMethod.POST)
	public String createPost(@RequestBody Post post) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Post> entity = new HttpEntity<Post>(post,headers);
		return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.POST, entity, String.class).getBody();
	
	}
	//put
	@RequestMapping(value ="/template/post/{id}", method = RequestMethod.PUT)
	public String updateProduct(@PathVariable("id") String id, @RequestBody Post post) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Post> entity = new HttpEntity<Post>(post,headers);
		return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/"+id,HttpMethod.PUT, entity, String.class).getBody();
	}
	
	//delete
	@RequestMapping(value ="/template/post/{id}", method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("id") String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Post> entity = new HttpEntity<Post>(headers);
		return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/"+id, HttpMethod.DELETE, entity, String.class).getBody();
	}
}