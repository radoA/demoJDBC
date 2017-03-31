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

import com.jgoodies.forms.factories.FormFactory;
//import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.JTextArea;
//import javax.swing.JFormattedTextField;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import java.awt.Button;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;



//@SuppressWarnings({ "unused", "serial" })
public class ConsultationOffreStage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_NomEntreprise;
	private JLabel lblNel;
	private JTextField textField_VilleStage;
	private JLabel lblMailContact;
	private JTextField textField_MailContact;
	private JLabel lblNewLabel_DomaineOffre;
	private JTextField textField_DomaineOffre;
	private JLabel lblLibelleDeLoffre;
	private JTextField textField_LibelleOffre;
	private JLabel lblDate;
	private JTextField textField_Date;
	private JLabel lblDuree;
	private JTextField textField_Duree;
	private JLabel lblNewLabel_DescriptifOffre;
	private TextArea textArea_DescriptifOffre;
	private JButton btnSuivant;
	private JButton btnPrecedent;
	private JButton btnFermer;
	//liste des offres de stage
	private ArrayList<OffreStage> listeOffres = Database.extractOffreDeStage();
	private int index_offre = 0;
	//private Frame frame;
	//private Frame frame1;

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) 
	public static void run(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultationOffreStage frame = new ConsultationOffreStage();
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
	public ConsultationOffreStage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
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
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
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
				ColumnSpec.decode("default:grow"),
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
				RowSpec.decode("0dlu"),
				RowSpec.decode("fill:default"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("top:max(0dlu;pref):grow"),}));
		
		JLabel lblConsultationDesOffres = new JLabel("Consultation Des Offres De Stage ");
		lblConsultationDesOffres.setForeground(new Color(255, 255, 255));
		lblConsultationDesOffres.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblConsultationDesOffres, "3, 2, 31, 1, center, default");
		
		JLabel lblNewLabel_NomEntreprise = new JLabel("Nom de L'Entreprise");
		lblNewLabel_NomEntreprise.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_NomEntreprise, "2, 6, right, default");
		
		textField_NomEntreprise = new JTextField();
		contentPane.add(textField_NomEntreprise, "4, 6, 13, 1, fill, default");
		textField_NomEntreprise.setColumns(10);
		
		lblNel = new JLabel("Ville Du Stage");
		lblNel.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNel, "20, 6, 9, 1");
		
		textField_VilleStage = new JTextField();
		contentPane.add(textField_VilleStage, "30, 6, 9, 1, fill, default");
		textField_VilleStage.setColumns(10);
		
		lblMailContact = new JLabel("Mail Contact");
		lblMailContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblMailContact, "2, 10, right, default");
		
		textField_MailContact = new JTextField();
		contentPane.add(textField_MailContact, "4, 10, 13, 1, fill, default");
		textField_MailContact.setColumns(10);
		
		lblNewLabel_DomaineOffre = new JLabel("Domaine De L'offre");
		lblNewLabel_DomaineOffre.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_DomaineOffre, "27, 10, 7, 1, right, default");
		
		textField_DomaineOffre = new JTextField();
		contentPane.add(textField_DomaineOffre, "34, 10, 5, 1, fill, default");
		textField_DomaineOffre.setColumns(10);
		
		lblLibelleDeLoffre = new JLabel("Libelle De l'offre");
		lblLibelleDeLoffre.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblLibelleDeLoffre, "2, 14, right, default");
		
		textField_LibelleOffre = new JTextField();
		contentPane.add(textField_LibelleOffre, "4, 14, 35, 1, fill, default");
		textField_LibelleOffre.setColumns(10);
		
		lblDate = new JLabel("Date Debut Stage");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblDate, "1, 18, 2, 1, right, default");
		
		textField_Date = new JTextField();
		contentPane.add(textField_Date, "4, 18, 17, 1, fill, default");
		textField_Date.setColumns(10);
		
		lblDuree = new JLabel("Duree Du Stage");
		lblDuree.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblDuree, "25, 18, 6, 1, center, default");
		
		textField_Duree = new JTextField();
		contentPane.add(textField_Duree, "35, 18, 4, 1, fill, default");
		textField_Duree.setColumns(10);
		
		//Descriptif
		textArea_DescriptifOffre = new TextArea("c'est koi sa ?");
		contentPane.add(textArea_DescriptifOffre, "12, 21, 22, 5, fill, default");
		
		lblNewLabel_DescriptifOffre = new JLabel("Descriptif De L'Offre");
		lblNewLabel_DescriptifOffre.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_DescriptifOffre, "2, 22, 9, 1, right, default");
		//fin de descriptif
		
		//boutton précédent
		btnPrecedent = new JButton("Precedent");
		contentPane.add(btnPrecedent, "12, 26, default, center");
		btnPrecedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(index_offre>0){//hasPrev()
					index_offre--;
					System.out.println(listeOffres.get(index_offre).toString());
				}
				else{
					System.out.println("Parcours terminée, on arrive au début de la liste");
				}
			}
		});
		
		//boutton suivant
		btnSuivant = new JButton("Suivant");
		contentPane.add(btnSuivant, "14, 26, default, center");
		
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index_offre < listeOffres.size()){//hasNext()
					System.out.println(listeOffres.get(index_offre).toString());
					index_offre++;
				}
				else{
					System.out.println("Parcours terminée, on arrive à la fin de la liste");
				}
			}
		});
									
		btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		contentPane.add(btnFermer, "16, 26, default, center");
	}

}
