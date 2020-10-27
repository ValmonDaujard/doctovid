package sopra.doctovid.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Rdv {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@ManyToOne
	@JoinColumn(name = "praticien_id")
	private Praticien praticien;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	@OneToMany(mappedBy = "rdv")
	private List<Creneau> creneaux;
	@ManyToOne
	@JoinColumn(name = "motif_id")
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
