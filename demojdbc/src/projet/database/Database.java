package projet.database;
import java.sql.SQLException;
import java.util.ArrayList;
import projet.metiers.Entreprise;
import projet.metiers.OffreStage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//PARTIE METIER

public class Database {
	// inserer une Entreprise dans la table Entreprise
	public static boolean create(Entreprise e) {
		try {
			// Creation d'une requete SQL
			// String sql = "insert into entreprise (`nom`, `adresseNumeroRue`,
			// `adresseCodePostal`, `adresseVille`, `mail`, `telephone`,
			// `secteurActivite`) values (?,?,?,?,?,?,?)";

			String sql = "INSERT INTO entreprise (`nom`,`adresseNumeroRue`,`adresseCodePostal`,`adresseVille`,`mail`,`telephone`,`secteurActivite`) VALUES ("
					+ "'" + e.getNom() + "'" + "," + "'" + e.getAdresseNumeroRue() + "'" + ","
					+ e.getAdresseCodePostal() + "," + "'" + e.getAdresseVille() + "'" + "," + "'" + e.getMail() + "'"
					+ "," + "'" + e.getTelephone() + "'" + "," + "'" + e.getSecteurActivite() + "'" + ")";

			// System.out.println(sql);
			// Etape 3 : Creation d'un Statement
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			/*
			 * st.setString(1, e.getNom()); st.setString(2,
			 * e.getAdresseNumeroRue()); st.setInt(3, e.getAdresseCodePostal());
			 * st.setString(4, e.getAdresseVille()); st.setString(5,
			 * e.getMail()); st.setString(6, e.getTelephone()); st.setString(7,
			 * e.getSecteurActivite());
			 */
			// Etape 4 : Execution de la requete
			if (st.executeUpdate(sql) == 1) {
				st.close();
				return true;
			}
			st.close();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL");
		}
		return false;
	}

	// inserer une offre de stage dans table OffeStage
	/** 
	 * 
	 * @param o
	 * @return
	 */
	public static boolean createOffreDeStage(OffreStage o, int ide) {
		try {
			// trouver ensuite l'ide de l'entreprise dont le nom est affiché (select ide from entreprise where nom= 'lenomaffiché')			
			// Creation d'unerequete SQL
			String sql = "INSERT INTO offrestage (`IDE`,`LIBELLEOFFRE`,`DESCRIPTIFOFFRE`,`DOMAINEOFFRE`,`DATEDEBUTOFFRE`,`DUREEOFFRE`,`CHEMINOFFRE` , `VALIDE`) VALUES ("
					+ ide +  ",'" + o.getLibeleOffre() + "','" + o.getDescriptifOffre() + "','" + o.getDomaine() + "','"
					+ o.getDateD() + "'," + o.getDuree() + ",'" + o.getCheminOffre() + "'," + o.isValide() + ")";
			 System.out.println(sql);
			// Etape 3 : Creation d'un Statement
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			// Etape 4 : Execution de la requete
			if (st.executeUpdate(sql) == 1) {
				st.close();
				return true;
			}
			st.close();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL, création offre de stage");
		}
		return false;
	}

	// extraire/lister dans une Liste les offres de stages stockés dans la base de données
	public static ArrayList<OffreStage> extractOffreDeStage(){
		ArrayList<OffreStage> offres = new ArrayList<OffreStage>();
	
		String sql = "select * from offrestage";
		try {
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				OffreStage o= new OffreStage();
				o.setLibeleOffre(rs.getString(3));
				o.setDescriptifOffre(rs.getString(4));
				o.setDomaine(rs.getString(5));
				o.setDateD(rs.getString(6));
				o.setDuree(rs.getInt(7));
				o.setCheminOffre(rs.getString(8));
				o.setValide(rs.getInt(9));
				//rajout
				o.setIdeEntreprise(rs.getInt(2));
				o.setNomEntreprise(getEntrepriseNameFromDB(o.getIdeEntreprise()));
				o.setVilleOffreStage(getEntrepriseVilleFromDB(o.getIdeEntreprise()));
				o.setMailOffreStage(getEntrepriseMailFromDB(o.getIdeEntreprise()));
				o.setIdOffreStage(rs.getInt(1));
				//---- fin rajout
				offres.add(o);
			}
			st.close();
		} catch (SQLException e) {
			
			System.out.println("Erreur SQL dans la table offrestage");
		}
		
		return offres;
	}
	
	//utile pour la saisie d'une offre dans le combobox
	public static ArrayList<String> extractEntrepriseName(){
		ArrayList<String> noms = new ArrayList<String>();
		String sql = "SELECT nom FROM entreprise";
		try {
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				noms.add(rs.getString(1));
			}
			st.close();
		} catch (SQLException e) {
			System.out.println("A problem during sql suery execution");
			e.printStackTrace();
		}
		return noms;
	}
	// rechercher un élement

	// supprimer

	public static int getEntrepriseIDEFromDB(String nomEntreprise) {
		String sql = "SELECT IDE FROM entreprise WHERE nom = '"+ nomEntreprise + "' LIMIT 1;";
		int res=0;
		String res2=null;
		try {
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			//System.out.println(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				res2= rs.getString(1);
			}
			res= Integer.parseInt(res2);
			return res;
			//st.close();
		} catch (SQLException e) {
			System.out.println("A problem during sql query execution");
			e.printStackTrace();
			//return null;
		}
		return res;	
	}
	
	public static String getEntrepriseVilleFromDB(int ide_Entreprise){
		String sql = "SELECT ADRESSEVILLE FROM entreprise WHERE ide = "+ ide_Entreprise + ";";
		String res=null;
		try {
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				res=rs.getString(1);
				return res;
			}
		} catch (SQLException e) {
			System.out.println("A problem during sql query execution, getEntrepriseVilleFromDB()");
			e.printStackTrace();
		}
		return res;
	}
	
	public static String getEntrepriseMailFromDB(int ide_Entreprise){
		String sql = "SELECT mail FROM entreprise WHERE ide = "+ ide_Entreprise + ";";
		String res=null;
		try {
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				res=rs.getString(1);
				return res;
			}
		} catch (SQLException e) {
			System.out.println("A problem during sql query execution, getEntrepriseMailFromDB(");
			e.printStackTrace();
		}
		return res;
	}
	
	public static String getEntrepriseNameFromDB(int ide_Entreprise){
		String sql = "SELECT nom FROM entreprise WHERE ide = "+ ide_Entreprise + ";";
		String res=null;
		try {
			PreparedStatement st = Connexion.getCn().prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()){
				res=rs.getString(1);
				return res;
			}
		} catch (SQLException e) {
			System.out.println("A problem during sql query execution, getEntrepriseMailFromDB(");
			e.printStackTrace();
		}
		return res;
	}
}
