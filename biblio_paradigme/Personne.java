package biblio_paradigme;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected int id;

	public Personne(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract String afficherDetails();

}
