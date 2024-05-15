package biblio_paradigme;

import java.util.ArrayList;
import java.util.Date;

public class Membre extends Personne {
	Date dateAdhesion;
	String statut;
	ArrayList<Livre> emprunts;
	public Membre(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}

	public Date getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(Date dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Override
	public String afficherDetails() {
		return "Nom:" + nom + " Prenom:" + prenom + " Date d'adhesion:" + dateAdhesion + " Statut:" + statut;
		
	}

}
