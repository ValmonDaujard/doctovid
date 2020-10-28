package sopra.doctovid.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Motif {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Enumerated(EnumType.STRING)
	@JsonView(Views.ViewMotif.class)
	private Type type;
	@JsonView(Views.ViewMotif.class)
	private int nbCreneau;
	@ManyToOne
	@JoinColumn(name = "lieuConsult_id")
	@JsonView(Views.ViewMotif.class)
	private LieuConsult lieuConsult;

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

	public LieuConsult getLieuConsult() {
		return lieuConsult;
	}

	public void setLieuConsult(LieuConsult lieuConsult) {
		this.lieuConsult = lieuConsult;
	}

	

}
