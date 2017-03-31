package projet.application;

import java.util.ArrayList;

import projet.database.Database;
import projet.metiers.Entreprise;
import projet.metiers.OffreStage;

public class TestCreation {
	
	public static void viewList(ArrayList<OffreStage> list){
		for (OffreStage offreStage : list) {
			System.out.println(offreStage.toString());
			System.out.println("\n\n");
		}
	}
	
	public static void main(String[] args) {
		//création d'entreprise
		Entreprise e1 = new Entreprise("Airbus", "3 avenue de toulouse", 31400, "Toulouse", "rh@airbus.com", "0658746284", "Aviation");
		Entreprise e2 = new Entreprise("Atos", "3 avenue de france", 91000, "Evry", "rh@atos.com", "0658748584", "devellopement");
		Entreprise e3 = new Entreprise("Genopole", "3 avenue de picard", 91400, "Evry", "rh@genopole.com", "0658746284", "R&D");
		Entreprise e4 = new Entreprise("meetic", "3 avenue de paris", 77400, "paris", "rh@meetic.com", "0658749084", "web");
		
		//insertion dans la table Entreprise
		 //Database.create(e1);
		 //Database.create(e2);
		 //Database.create(e3);
		 //Database.create(e4);
		 
		 //création d'une offre de stage
		 //OffreStage o1 = new OffreStage( "libele-ibisc", "descriptif-ibisc", "domaine-ibisc",  "dateD-ibisc", 45, "cheminOffre-ibisc", 1);
		 //OffreStage o2 = new OffreStage( "libele-Atos", "descriptif-Atos", "domaine-Atos",  "dateD-Atos", 45, "cheminOffre-Atos", 1);
		 //OffreStage o3 = new OffreStage( "libele-Genopole", "descriptif-Genopole", "domaine-Genopole",  "dateD-Genopole", 45, "cheminOffre-Genopole", 1);
		 //OffreStage o4 = new OffreStage( "libele-meetic", "descriptif-meetic", "domaine-meetic",  "dateD-meetic", 45, "cheminOffre-meetic", 1);

		//insertion dans la table OffreStage
		 //BaseDeDonne.createOffreDeStage(o1);
		 //BaseDeDonne.createOffreDeStage(o2);
		 //BaseDeDonne.createOffreDeStage(o3);
		 //BaseDeDonne.createOffreDeStage(o4);
		 
		 //extraction des données dans la table offrestage
		 //ArrayList<OffreStage> offres = new ArrayList<OffreStage>();
		 //offres = BaseDeDonne.extractOffreDeStage();
		 //viewList(offres);
		 
		 //test
		 ArrayList<String> noms = new ArrayList<String>();
		 noms = Database.extractEntrepriseName();
		 for (String string : noms) {
			System.out.println(string);
		}
	}

}
