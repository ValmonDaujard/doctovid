package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Motif {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Enumerated(EnumType.STRING)
	private Type type;
	private int nbCreneau;
	@ManyToMany
	@JoinTable(name = "motif_lieuConsult", joinColumns = @JoinColumn(name = "motif_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "lieuConsult_id", referencedColumnName = "id"))
	private List<LieuConsult> mesLieux = new ArrayList<LieuConsult>();

	public Motif() {
		super();
	}

	public Motif(Type type, int nbCreneau) {
		super();
		this.type = type;
		this.nbCreneau = nbCreneau;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getNbCreneau() {
		return nbCreneau;
	}

	public void setNbCreneau(int nbCreneau) {
		this.nbCreneau = nbCreneau;
	}

	public List<LieuConsult> getMesLieux() {
		return mesLieux;
	}

	public void setMesLieux(List<LieuConsult> mesLieux) {
		this.mesLieux = mesLieux;
	}
	
	public void addLieu(LieuConsult lieu) {
		this.mesLieux.add(lieu);
	}

}
