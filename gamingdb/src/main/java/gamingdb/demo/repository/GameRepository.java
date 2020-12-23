package gamingdb.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import gamingdb.demo.model.Game;

public interface GameRepository extends CrudRepository<Game, Long> {
	
	public List<Game> findAll();
}
