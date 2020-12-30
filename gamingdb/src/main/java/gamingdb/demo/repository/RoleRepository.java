package gamingdb.demo.repository;

import org.springframework.data.repository.CrudRepository;

import gamingdb.demo.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByRole(String role);
}
