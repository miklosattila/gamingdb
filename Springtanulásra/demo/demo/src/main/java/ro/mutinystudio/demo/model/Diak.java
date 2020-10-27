package ro.mutinystudio.demo.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="diakok")
public class Diak {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="teszt")
	private String name;
	
	@ManyToMany()
	@JoinTable(name = "diak_tantargyak", joinColumns = @JoinColumn(name = "diak_id"), inverseJoinColumns = @JoinColumn(name = "tantargy_id"))
	private Set<Tantargy> tantargyak;
	
	@ManyToOne
	@JoinColumn(name = "osztaly_id")
	private Osztaly osztaly;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Tantargy> getTantargyak() {
		return tantargyak;
	}

	public void setTantargyak(Set<Tantargy> tantargyak) {
		this.tantargyak = tantargyak;
	}
	
}
