package sopra.doctovid.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Creneau {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	private Boolean dispo;
	@ManyToOne
	@JoinColumn(name = "lieuConsult_id")
	private LieuConsult lieuConsult;
	@ManyToOne
	@JoinColumn(name = "rdv_id")
	private Rdv rdv;

	public Creneau() {
		super();
	}

	public Creneau(Date date, Boolean dispo) {
		super();
		this.date = date;
		this.dispo = dispo;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getDispo() {
		return dispo;
	}

	public void setDispo(Boolean dispo) {
		this.dispo = dispo;
	}

	public Rdv getRdv() {
		return rdv;
	}

	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}

	public LieuConsult getLieuConsult() {
		return lieuConsult;
	}

	public void setLieuConsult(LieuConsult lieuConsult) {
		this.lieuConsult = lieuConsult;
	}

	

}
