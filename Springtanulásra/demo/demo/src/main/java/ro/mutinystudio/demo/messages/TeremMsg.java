package ro.mutinystudio.demo.messages;

import ro.mutinystudio.demo.model.Terem;

public class TeremMsg {
	
	private Long id;
	
	private String szam;
	
	private String szint;
	
	public TeremMsg() {
		
	}
	
	public TeremMsg(Terem terem) {
		this.id = terem.getId();
		this.szam = terem.getSzam();
		this.szint = terem.getSzint();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSzam() {
		return szam;
	}

	public void setSzam(String szam) {
		this.szam = szam;
	}

	public String getSzint() {
		return szint;
	}

	public void setSzint(String szint) {
		this.szint = szint;
	}
	
}
