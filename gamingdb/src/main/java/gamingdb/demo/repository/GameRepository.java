package gamingdb.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import gamingdb.demo.model.Game;
import gamingdb.demo.model.Publisher;

public interface GameRepository extends CrudRepository<Game, Long> {
	
	public List<Game> findAll();

	public Game findByName(String game);

	public List<Game> findAllByGenre(String genre);

	public List<Game> findAllByOrderByRelaseDateDesc();
	
	public List<Game> findAllByPublisher(Publisher publisher);

	

}
