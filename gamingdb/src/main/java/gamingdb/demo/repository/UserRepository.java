package gamingdb.demo.repository;

import org.springframework.data.repository.CrudRepository;


import gamingdb.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String Email);

	User findByActivation(String code);
}
