package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.List;

public class Motif {

	private Long id;
	private int version;
	private Type type;
	private int nbCreneau;
	private List<LieuConsult> mesLieux  = new ArrayList<LieuConsult>();
	
	
	public Motif() {
		super();
	}
	
	
	
	public List<LieuConsult> getMesLieux() {
		return mesLieux;
	}



	public void setMesLieux(List<LieuConsult> mesLieux) {
		this.mesLieux = mesLieux;
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
	
	
	
}
