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
	
	@RequestMapping(method = RequestMethod.GET, path = "/test")
	public List<Game> allGames()
	{
		return helloService.games();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/test/game/{game}")
	public Game searchForGame(@PathVariable(value="game") String game ) {
		return helloService.getSpecificgame(game);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/test/{genre}")
	public List<Game> searchForGenres(@PathVariable(value="genre") String genre )
	{
		return helloService.getGamesByGenres(genre);
	}
	@RequestMapping(method = RequestMethod.GET, path = "/test/recomandation")
	public List<Game> recomandedGames()
	{
		return helloService.recomanded();
	}
	@RequestMapping(method = RequestMethod.GET, path = "/test/publisher/{publisher}")
	public List<Game> PublishersGames(@PathVariable(value="publisher") String publisher ){
		return helloService.SearchbyPublisher(publisher);
	}
	@RequestMapping(method = RequestMethod.GET, path = "/test/publisher1/{publisher}")
	public Publisher Publishers(@PathVariable(value="publisher") String publisher ){
		return helloService.SearchforPublisher(publisher);
	}
}

