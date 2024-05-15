package biblio_paradigme;

public class Employe extends Personne {
	
	public Employe(String nom, String prenom, int id) {
		super(nom, prenom, id);

	}


	String poste;
	double salaire;
	
	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	@Override
	public String afficherDetails() {
		return "Nom:" + nom + " Prenom:" + prenom + " Poste:" + poste + " Salaire:" + salaire;
	}

}
