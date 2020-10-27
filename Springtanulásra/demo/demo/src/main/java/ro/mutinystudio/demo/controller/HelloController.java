package ro.mutinystudio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ro.mutinystudio.demo.messages.OsztalyMsg;
import ro.mutinystudio.demo.model.Test;
import ro.mutinystudio.demo.service.HelloService;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/test")
	public List<OsztalyMsg> test() {
		return helloService.szamol();
//		return "A teszt metódus meghívódott!";
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/test", consumes = "application/json", produces = "application/json")
	public String test2(@RequestBody Test test) {
		System.out.println(test.getName());
		return "test called";
	}

	@GetMapping()
	public String hello() {
		helloService.szamol();
		return "Hello word!";
	}
	
	
	
	
}
