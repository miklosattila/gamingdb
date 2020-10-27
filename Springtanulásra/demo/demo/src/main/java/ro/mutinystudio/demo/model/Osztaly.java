package ro.mutinystudio.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Osztaly {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String evfolyam;
	
	@Column
	private String megnevezes;
	
	@OneToMany(mappedBy = "osztaly", cascade = CascadeType.ALL)
	private Set<Diak> diakok;

	@OneToOne
	@JoinColumn(name = "terem_id", referencedColumnName = "id")
	private Terem terem;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEvfolyam() {
		return evfolyam;
	}

	public void setEvfolyam(String evfolyam) {
		this.evfolyam = evfolyam;
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public void setMegnevezes(String megnevezes) {
		this.megnevezes = megnevezes;
	}

	public Set<Diak> getDiakok() {
		return diakok;
	}

	public void setDiakok(Set<Diak> diakok) {
		this.diakok = diakok;
	}

	public Terem getTerem() {
		return terem;
	}

	public void setTerem(Terem terem) {
		this.terem = terem;
	}
	
}
