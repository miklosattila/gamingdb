package gamingdb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gamingdb.demo.model.Game;
import gamingdb.demo.service.gamingdbService;

@RestController
@RequestMapping("/api/hello")
public class gamingdbRestController {
	
	@Autowired
	gamingdbService helloService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/test", consumes = "application/json", produces = "application/json")
	private List<Game> allGames()
	{
		return helloService.games();
	}
}
