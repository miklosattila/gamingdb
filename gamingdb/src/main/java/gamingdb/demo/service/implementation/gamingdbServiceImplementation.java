package gamingdb.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gamingdb.demo.model.Game;
import gamingdb.demo.repository.GameRepository;
import gamingdb.demo.service.gamingdbService;

@Service
public class gamingdbServiceImplementation  implements gamingdbService{
	
	@Autowired 
	GameRepository gameRepo;
	
	public List<Game> games() {
		
		List<Game> games=gameRepo.findAll();
		return games;
	}
	
}
