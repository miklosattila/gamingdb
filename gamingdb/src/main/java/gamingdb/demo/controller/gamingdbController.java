package gamingdb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gamingdb.demo.model.Developer;
import gamingdb.demo.service.HelloService;



@RestController
@RequestMapping("/api/hello")
public class gamingdbController {
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index.html";
	
	}
	@RequestMapping(method = RequestMethod.POST, path = "/test1", consumes = "application/json", produces = "application/json")
	void test(@RequestBody Developer test) {

		helloService.addnew(test);
		// return "test called";
	}

}
