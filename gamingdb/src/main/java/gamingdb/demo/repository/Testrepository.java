package gamingdb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gamingdb.demo.model.Developer;




public interface Testrepository extends JpaRepository<Developer, Long> {


}
