package gamingdb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gamingdb.demo.model.Game;
import gamingdb.demo.model.Publisher;
import gamingdb.demo.service.gamingdbService;

@RestController
@RequestMapping("/api/hello")
public class gamingdbRestController {
	
	@Autowired
	private gamingdbService helloService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/test", consumes = "application/json", produces = "application/json")
	public List<Game> allGames()
	{
		return helloService.games();
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/test/game/{game}", consumes = "application/json", produces = "application/json")
	public Game searchForGame(@PathVariable(value="game") String game ) {
		return helloService.getSpecificgame(game);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/test/{genre}", consumes = "application/json", produces = "application/json")
	public List<Game> searchForGenres(@PathVariable(value="genre") String genre )
	{
		return helloService.getGamesByGenres(genre);
	}
	@RequestMapping(method = RequestMethod.POST, path = "/test/recomandation", consumes = "application/json", produces = "application/json")
	public List<Game> recomandedGames()
	{
		return helloService.recomanded();
	}
	@RequestMapping(method = RequestMethod.POST, path = "/test/publisher/{publisher}", consumes = "application/json", produces = "application/json")
	public List<Game> PublishersGames(@PathVariable(value="publisher") String publisher ){
		return helloService.SearchbyPublisher(publisher);
	}
	@RequestMapping(method = RequestMethod.POST, path = "/test/publisher1/{publisher}", consumes = "application/json", produces = "application/json")
	public Publisher Publishers(@PathVariable(value="publisher") String publisher ){
		return helloService.SearchforPublisher(publisher);
	}
}

