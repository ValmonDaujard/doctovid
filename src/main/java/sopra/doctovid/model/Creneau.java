package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Creneau {

	private Long id;
	private int version;
	private Date date;
	private Boolean dispo;
	private List<LieuConsult> lieux  = new ArrayList<LieuConsult>();
	
	public Creneau() {
		super();
	}
	
	
	
	public List<LieuConsult> getLieux() {
		return lieux;
	}



	public void setLieux(List<LieuConsult> lieux) {
		this.lieux = lieux;
	}


	public void addLieux(LieuConsult lieuConsult) {
		this.lieux.add(lieuConsult);
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

	
	
}
