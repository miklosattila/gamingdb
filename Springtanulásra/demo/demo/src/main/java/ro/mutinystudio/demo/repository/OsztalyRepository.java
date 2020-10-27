package ro.mutinystudio.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.mutinystudio.demo.model.Osztaly;

public interface OsztalyRepository extends JpaRepository<Osztaly, Long>{
	
	public List<Osztaly> findAllByEvfolyamAndMegnevezes(String evfolyam, String megnevezes);
	
}
