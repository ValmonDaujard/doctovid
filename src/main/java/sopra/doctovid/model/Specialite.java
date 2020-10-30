package sopra.doctovid.model;

public enum Specialite {
	Generaliste("Généraliste");
	
	private final String label;

	private Specialite(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
