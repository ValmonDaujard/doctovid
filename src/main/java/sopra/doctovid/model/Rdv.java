package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Rdv {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@ManyToOne
	@JoinColumn(name = "praticien_id")
	@JsonView(Views.ViewCommon.class)
	private Praticien praticien;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonView(Views.ViewCommon.class)
	private Patient patient;
	@OneToMany(mappedBy = "rdv")
	@JsonView(Views.ViewCommon.class)
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	@ManyToOne
	@JoinColumn(name = "motif_id")
	@JsonView(Views.ViewCommon.class)
	private Motif motif;

	public Rdv() {
		super();
	}

	public Rdv(Praticien praticien, Patient patient) {
		super();
		this.praticien = praticien;
		this.patient = patient;
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
	
	public void addCreneau(Creneau creneau) {
		this.creneaux.add(creneau);
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

}
