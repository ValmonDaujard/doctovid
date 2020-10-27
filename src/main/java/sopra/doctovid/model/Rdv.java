package sopra.doctovid.model;

import java.util.List;

public class Rdv {

	private Long id;
	private int version;
	private Praticien praticien;
	private Patient patient;
	private List<Creneau> creneaux;
	private Motif motif;
	
	
	public Rdv() {
		super();
	}
	
	
	
	public Praticien getPraticien() {
		return praticien;
	}



	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	public List<Creneau> getCreneaux() {
		return creneaux;
	}



	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}



	public Motif getMotif() {
		return motif;
	}



	public void setMotif(Motif motif) {
		this.motif = motif;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
}
