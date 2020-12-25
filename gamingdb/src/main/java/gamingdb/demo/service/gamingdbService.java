package gamingdb.demo.service;

import java.util.List;

import gamingdb.demo.model.Game;
import gamingdb.demo.model.Publisher;

public interface gamingdbService {
	

	public List<Game> games();

	public Game getSpecificgame(String game);

	public List<Game> getGamesByGenres(String genre);

	public List<Game> recomanded();

	public List<Game> SearchbyPublisher(String publisher);

	public Publisher SearchforPublisher(String publisher);

	

	
}
