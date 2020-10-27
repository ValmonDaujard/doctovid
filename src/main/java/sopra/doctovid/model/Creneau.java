package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@ManyToMany
	@JoinTable(name = "creneau_lieuConsult", joinColumns = @JoinColumn(name = "creneau_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "lieuConsult_id", referencedColumnName = "id"))
	private List<LieuConsult> mesLieux = new ArrayList<LieuConsult>();
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

	public List<LieuConsult> getLieux() {
		return mesLieux;
	}

	public void setLieux(List<LieuConsult> lieux) {
		this.mesLieux = lieux;
	}

	public void addLieux(LieuConsult lieuConsult) {
		this.mesLieux.add(lieuConsult);
	}

}
