package ro.mutinystudio.demo.messages;

import ro.mutinystudio.demo.model.Osztaly;

public class OsztalyMsg {

	private Long id; 
	
	private String evfolyam;
	
	private String megnevezes;
	
	private TeremMsg terem;
	
	public OsztalyMsg() {
		
	}
	
	public OsztalyMsg(Osztaly osztaly) {
		this.id = osztaly.getId();
		this.evfolyam = osztaly.getEvfolyam();
		this.megnevezes = osztaly.getMegnevezes();
		this.terem = new TeremMsg(osztaly.getTerem());
	}

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

	public TeremMsg getTerem() {
		return terem;
	}

	public void setTerem(TeremMsg terem) {
		this.terem = terem;
	}
	
}
