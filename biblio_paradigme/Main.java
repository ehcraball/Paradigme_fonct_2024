package biblio_paradigme;

import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ArrayList listePersonne = new ArrayList<Personne>();
		
		Date date = new Date();
		Membre membre1 = new Membre ("Labarche","Nathan",0);
		Employe employe1 = new Employe("Bento","Damien",1);
		
		employe1.setPoste("Caissier");
		employe1.setSalaire(1200.0);
		
		membre1.setDateAdhesion(date);
		membre1.setStatut("Abonné");
		
		listePersonne.add(employe1.afficherDetails());
		listePersonne.add(membre1.afficherDetails());
		
		
		System.out.println(listePersonne);
		
		
	}
}
