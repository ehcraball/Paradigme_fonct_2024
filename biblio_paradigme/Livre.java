package biblio_paradigme;

public class Livre implements Empruntable{
	protected String titre;
	protected String auteur;
	protected String isbn;
	protected Boolean disponible;

	public Livre(String titre, String auteur, String isbn, Boolean disponible) {
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public String afficherDetails(String livreDescription) {
		livreDescription = "Titre : " + titre + " Auteur : " + auteur + " ISBN : " + isbn + " Disponible : "
				+ disponible;
		return livreDescription;

	}

	@Override
	public boolean Emprunter() {
		
		return false;
	}

	@Override
	public boolean Retourner() {
		
		return false;
	}


}
