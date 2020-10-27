package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class LieuConsult {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	@Embedded
	private Adresse adresse;
	@ManyToMany(mappedBy = "mesLieux")
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	@ManyToMany(mappedBy = "mesLieux")
	private List<Motif> motifs = new ArrayList<Motif>();
	@OneToMany(mappedBy = "lieuConsult")
	private List<Creneau> creneaux = new ArrayList<Creneau>();

	public LieuConsult() {
		super();
	}

	public LieuConsult(String nom) {
		super();
		this.nom = nom;
	}

	public LieuConsult(String nom, Adresse adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Praticien> getPraticiens() {
		return praticiens;
	}

	public void setPraticiens(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}
	
	public void addPraticien(Praticien praticien) {
		this.praticiens.add(praticien);
	}

	public List<Motif> getMotifs() {
		return motifs;
	}

	public void setMotifs(List<Motif> motifs) {
		this.motifs = motifs;
	}
	
	public void addMotif(Motif motif) {
		this.motifs.add(motif);
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

}
