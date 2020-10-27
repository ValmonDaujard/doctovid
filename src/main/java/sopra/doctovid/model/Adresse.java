package sopra.doctovid.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private String rue;
	private String complement;
	private String cp;
	private String ville;

	public Adresse() {
		super();
	}
	
	public Adresse(String rue, String complement, String cp, String ville) {
		super();
		this.rue = rue;
		this.complement = complement;
		this.cp = cp;
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
	
	}