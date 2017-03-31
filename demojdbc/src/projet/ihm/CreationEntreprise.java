package projet.ihm;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import projet.database.Database;
import projet.metiers.Entreprise;


public class CreationEntreprise extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomEntreprise;
	private JTextField adresseNumeroRue;
	private JTextField adresseCodePostal;
	private JTextField adresseVille;
	private JTextField mail;
	private JTextField telephone;
	private JTextField secteurActivite;
	private Entreprise ent;

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args)
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationEntreprise frame = new CreationEntreprise();
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
	public CreationEntreprise() {
	
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
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
				ColumnSpec.decode("default:grow"),},
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblGestionDuneEntreprise = new JLabel("Création d'une Entreprise ");
		lblGestionDuneEntreprise.setForeground(new Color(255, 0, 255));
		lblGestionDuneEntreprise.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblGestionDuneEntreprise, "8, 4, 8, 1, center, default");
		
		JLabel lblNomDeLentreprise = new JLabel("Nom de l'entreprise");
		lblNomDeLentreprise.setForeground(new Color(0, 0, 0));
		lblNomDeLentreprise.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNomDeLentreprise, "8, 8, right, default");
		
		nomEntreprise = new JTextField();
		contentPane.add(nomEntreprise, "10, 8, 6, 1");
		nomEntreprise.setColumns(10);
		
		JLabel lblAdresseruenumero = new JLabel("Adresse(Rue,numero)");
		lblAdresseruenumero.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblAdresseruenumero, "8, 12, right, default");
		
		adresseNumeroRue = new JTextField();
		contentPane.add(adresseNumeroRue, "10, 12, 6, 1, fill, default");
		adresseNumeroRue.setColumns(10);
		
		JLabel lblAdressecodePostal = new JLabel("Adresse(Code Postal)");
		lblAdressecodePostal.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblAdressecodePostal, "8, 16, right, default");
		
		adresseCodePostal = new JTextField();
		contentPane.add(adresseCodePostal, "10, 16, 6, 1, fill, default");
		adresseCodePostal.setColumns(10);
		
		JLabel lblAdresseville = new JLabel("Adresse(Ville)");
		lblAdresseville.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblAdresseville, "8, 20, right, default");
		
		adresseVille = new JTextField();
		contentPane.add(adresseVille, "10, 20, 6, 1, fill, default");
		adresseVille.setColumns(10);
		
		JLabel lblMailDuContact = new JLabel("Mail du contact");
		lblMailDuContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblMailDuContact, "8, 24, right, default");
		
		mail = new JTextField();
		contentPane.add(mail, "10, 24, 6, 1, fill, default");
		mail.setColumns(10);
		
		JLabel lblTelephoneDuContact = new JLabel("Telephone du contact");
		lblTelephoneDuContact.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblTelephoneDuContact, "8, 28, right, default");
		
		telephone = new JTextField();
		contentPane.add(telephone, "10, 28, 6, 1, fill, default");
		telephone.setColumns(10);
		
		JLabel lblSecteurDactiviteDe = new JLabel("Secteur D'activite de l'entreprise ");
		lblSecteurDactiviteDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblSecteurDactiviteDe, "4, 32, 5, 1, right, default");
		
		secteurActivite = new JTextField();
		contentPane.add(secteurActivite, "10, 32, 6, 1, fill, default");
		secteurActivite.setColumns(10);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		contentPane.add(btnEnvoyer, "8, 36");
		btnEnvoyer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {			
				// récupère le nom dans une variable
				String nom_ent=nomEntreprise.getText();
				String ad_Num_Rue = adresseNumeroRue.getText();
				int ad_Code_P = Integer.parseInt(adresseCodePostal.getText());
				String ad_Ville = adresseVille.getText();
				String ad_mail = mail.getText();
				String tel = telephone.getText();
				String sec_act = secteurActivite.getText();
				ent = new Entreprise(nom_ent, ad_Num_Rue, ad_Code_P, ad_Ville,ad_mail, tel, sec_act);
				//System.out.println(ent.toString());
				Database.create(ent);
			}
		});
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
 
		contentPane.add(btnAnnuler, "10, 36, center, default");
	}
	

}
