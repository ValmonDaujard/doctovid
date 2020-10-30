package sopra.doctovid.model;

public enum Type {
	PremierRendezVous("Premier Rendez-Vous"),Suivi("Suivi"),Urgence("Urgence");
	
	private final String label;

	private Type(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
