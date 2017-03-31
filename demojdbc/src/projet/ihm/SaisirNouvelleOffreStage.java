package projet.ihm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import projet.database.Database;
import projet.metiers.OffreStage;

import java.awt.Color;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class SaisirNouvelleOffreStage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField libeleOffre;
	private JTextField date_obtenu;
	private JTextField duree;
	private JTextField chemindestockage;
	private JTextField descriptionoffre;
	private OffreStage offre_st;
	//private String nom_selectionne;
	//private String domaine_selectionne;
	//private int ide_obtenu;
	/**
	 * Launch the application.
	 */
	public static void run(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaisirNouvelleOffreStage frame = new SaisirNouvelleOffreStage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SaisirNouvelleOffreStage() {
		setBackground(new Color(0, 255, 127));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(65, 105, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(75dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(22dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblGestion = new JLabel("Saisie D'une Offre De Stage ");
		lblGestion.setForeground(new Color(128, 128, 0));
		lblGestion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblGestion, "8, 2, 14, 1, center, default");
		
		JLabel lblNomdeLentreprise = new JLabel("Nom de L'entreprise");
		lblNomdeLentreprise.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNomdeLentreprise, "8, 6, right, default");
		
		JComboBox<String> liste_entreprise = new JComboBox<String>();
		// recherche la liste des noms d'entreprise
		ArrayList<String> noms_ent = new ArrayList<String>();
		noms_ent = Database.extractEntrepriseName();
		int i=0;
		//initialisation
		offre_st = new OffreStage();
		for (String nomEntreprise : noms_ent) {
			liste_entreprise.addItem(nomEntreprise);
			if(i==0){
				//tmp = nomEntreprise;
				offre_st.setNomEntreprise(nomEntreprise);
				i++;
			}
		}
		//nom_selectionne=tmp;
		// si le combobox change, on lance un evenement
		liste_entreprise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String entr_name=liste_entreprise.getSelectedItem().toString();
				//nom_selectionne=entr_name;
				offre_st.setNomEntreprise(liste_entreprise.getSelectedItem().toString());

				// faire une requete SQL
				offre_st.setIdeEntreprise(Database.getEntrepriseIDEFromDB(offre_st.getNomEntreprise()));
				//ide_obtenu=Database.getEntrepriseIDEFromDB(offre_st.getNomEntreprise());
				
			}
		});
		contentPane.add(liste_entreprise, "10, 6");
		
		JLabel lblDomaine = new JLabel("Domaine de l'offre");
		lblDomaine.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblDomaine, "8, 10, right, default");
		
		String tmp="";
		JComboBox<String> liste_domaine = new JComboBox<String>();
		//selection par défaut du domaine
		tmp="Développement";
		//domaine_selectionne=tmp;
		offre_st.setDomaine(tmp);
		liste_domaine.addItem(tmp);//1
		liste_domaine.addItem("Réseaux");//2
		liste_domaine.addItem("Comptabilité");//3
		//evenements pour domaine
		liste_domaine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// capture de la selection
				//String entr_domaine = liste_domaine.getSelectedItem().toString();
				//domaine_selectionne = entr_domaine;
				offre_st.setDomaine(liste_domaine.getSelectedItem().toString());
			}
		});
		contentPane.add(liste_domaine, "10, 10");
		
		JLabel lblLibelleDeLoffre = new JLabel("Libelle de L'offre");
		lblLibelleDeLoffre.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblLibelleDeLoffre, "6, 14, right, default");
		libeleOffre = new JTextField();
		libeleOffre.setColumns(10);
		contentPane.add(libeleOffre, "8, 14, 19, 1, fill, default");
		
		JLabel lblDate = new JLabel("Date De debut du Stage");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblDate, "6, 18, right, default");
		
		date_obtenu = new JTextField();
		contentPane.add(date_obtenu, "8, 18, 5, 1, fill, default");
		date_obtenu.setColumns(10);
		
		JLabel lblDuree = new JLabel("Duree");
		lblDuree.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblDuree, "14, 18, center, default");
		
		duree = new JTextField();
		contentPane.add(duree, "15, 18, 12, 1, fill, default");
		duree.setColumns(10);
		
		JLabel lblCheminDeStockage = new JLabel("Chemin De Stockage De L'offre De Stage");
		lblCheminDeStockage.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblCheminDeStockage, "8, 22, right, default");
		
		chemindestockage = new JTextField();
		contentPane.add(chemindestockage, "10, 22, 9, 1, fill, default");
		chemindestockage.setColumns(10);
		
		JLabel lblDescritionDeoffre = new JLabel("Descrition de'offre");
		lblDescritionDeoffre.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblDescritionDeoffre, "10, 24, right, default");
		
		descriptionoffre = new JTextField();
		contentPane.add(descriptionoffre, "8, 26, 19, 9, fill, default");
		descriptionoffre.setColumns(10);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		contentPane.add(btnEnvoyer, "10, 38, fill, default");
		btnEnvoyer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//String libele = libeleOffre.getText();
				//String date = date_obtenu.getText();
				//String descriptif = descriptionoffre.getText();
				//int duree_obtenu = Integer.parseInt(duree.getText());
				//String cheminOffre = chemindestockage.getText();
				//offre_st = new OffreStage(libele, descriptif, domaine_selectionne, date, duree_obtenu, cheminOffre, 1);
				//ide_obtenu = Database.getEntrepriseIDEFromDB(nom_selectionne);				
				//Database.createOffreDeStage(offre_st, ide_obtenu);
				
				offre_st.setLibeleOffre(libeleOffre.getText());
				offre_st.setDateD(date_obtenu.getText());
				offre_st.setDescriptifOffre(descriptionoffre.getText());
				offre_st.setDuree(Integer.parseInt(duree.getText()));
				offre_st.setCheminOffre(chemindestockage.getText());
				offre_st.setValide(1);
				offre_st.setIdeEntreprise(Database.getEntrepriseIDEFromDB(offre_st.getNomEntreprise()));
				//a mettre a jour
					offre_st.setVilleOffreStage(Database.getEntrepriseVilleFromDB(offre_st.getIdeEntreprise()));
					offre_st.setMailOffreStage(Database.getEntrepriseMailFromDB(offre_st.getIdeEntreprise()));
				System.out.println(offre_st.toString());
				//Database.createOffreDeStage(offre_st, offre_st.getIdeEntreprise());
			}
		});
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnAnnuler, "14, 38, left, default");
	}

}
