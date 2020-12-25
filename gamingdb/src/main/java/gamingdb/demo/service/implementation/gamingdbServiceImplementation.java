package gamingdb.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gamingdb.demo.model.Game;
import gamingdb.demo.model.Publisher;
import gamingdb.demo.repository.GameRepository;
import gamingdb.demo.repository.PublisherRepository;
import gamingdb.demo.service.gamingdbService;

@Service
public class gamingdbServiceImplementation  implements gamingdbService{
	
	@Autowired 
	GameRepository gameRepo;
	
	@Autowired 
	PublisherRepository publiRepo;
	
	public List<Game> games() {
		
		List<Game> games=gameRepo.findAll();
		return games;
	}
	
	public Game getSpecificgame(String game)
	{
		return gameRepo.findByName(game);
	}
	public List<Game> getGamesByGenres(String genre)
	{
		return gameRepo.findAllByGenre(genre);
	}
	public List<Game> recomanded()
	{
		return gameRepo.findAllByOrderByRelaseDateDesc();
	}
	public List<Game> SearchbyPublisher(String publisher)
	{
		Publisher publis=publiRepo.findByName(publisher);
		
		return gameRepo.findAllByPublisher(publis);
	}
	public Publisher SearchforPublisher(String publisher)
	{
		return publiRepo.findByName(publisher);
	}
}
