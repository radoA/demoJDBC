package projet.ihm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;


public class EntrerDansLapplication extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntrerDansLapplication frame = new EntrerDansLapplication();
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
	public EntrerDansLapplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
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
				RowSpec.decode("default:grow"),
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
		
		JLabel lblGestionDesOffres = new JLabel("Gestion Des offres De Stage ");
		lblGestionDesOffres.setForeground(new Color(255, 0, 255));
		lblGestionDesOffres.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblGestionDesOffres, "4, 2, 9, 1, center, bottom");
		
		JButton btnCreerUneEntreprise = new JButton("Creer une entreprise ");
		//evenement Creer une entreprise
		btnCreerUneEntreprise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//appel de CreationEntreprise
				CreationEntreprise.run();
			}
		});
		btnCreerUneEntreprise.setBackground(new Color(0, 255, 255));
		contentPane.add(btnCreerUneEntreprise, "4, 8");
		
		JButton btnSaisirUneOffre = new JButton("Saisir une offre");
		//evenement Saisir une offre
		btnSaisirUneOffre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//appel de SaisirNouvelleOffreStage
				SaisirNouvelleOffreStage.run();
				//.......
			}
		});
		btnSaisirUneOffre.setBackground(new Color(0, 255, 255));
		contentPane.add(btnSaisirUneOffre, "8, 8");
		
		JButton btnConsulterLesOffres = new JButton("Consulter les offres");
		//evenement Consulter les offres
		btnConsulterLesOffres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//appel de ConsultationOffreStage
				ConsultationOffreStage.run();
		
			}
		});
		btnConsulterLesOffres.setBackground(new Color(0, 255, 255));
		contentPane.add(btnConsulterLesOffres, "12, 8");
		
		JButton btnAnnuler = new JButton("Annuler");
		//evenement annuler
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnAnnuler.setBackground(new Color(0, 255, 255));
		contentPane.add(btnAnnuler, "8, 14");
	}

}
