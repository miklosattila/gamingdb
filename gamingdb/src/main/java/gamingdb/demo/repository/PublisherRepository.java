package gamingdb.demo.repository;

import org.springframework.data.repository.CrudRepository;

import gamingdb.demo.model.Game;
import gamingdb.demo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Game, Long> {

	public Publisher findByName(String publisher);

	

}
