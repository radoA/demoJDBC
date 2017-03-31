package projet.moussa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreerEntreprise extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreerEntreprise() {
	}

	private JPanel contentPane;
	private JTextField nomEntreprise;
	private JTextField adresseNumeroRue;
	private JTextField adresseCodePostal;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerEntreprise frame = new CreerEntreprise();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void CreationEntreprise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREATION D'UNE ENTREPRISE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(174, 30, 383, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomDeLentreprise = new JLabel("Nom de l'entreprise");
		lblNomDeLentreprise.setLabelFor(this);
		lblNomDeLentreprise.setToolTipText("");
		lblNomDeLentreprise.setForeground(Color.WHITE);
		lblNomDeLentreprise.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNomDeLentreprise.setBounds(109, 88, 146, 30);
		contentPane.add(lblNomDeLentreprise);
		
		JLabel lblAdressenumeroEtRue = new JLabel("Adresse(numero et rue)\r\n");
		lblAdressenumeroEtRue.setForeground(Color.WHITE);
		lblAdressenumeroEtRue.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdressenumeroEtRue.setBounds(78, 129, 177, 30);
		contentPane.add(lblAdressenumeroEtRue);
		
		JLabel lblAdressecodePostal = new JLabel("Adresse(code postal)");
		lblAdressecodePostal.setForeground(Color.WHITE);
		lblAdressecodePostal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdressecodePostal.setBounds(101, 170, 154, 30);
		contentPane.add(lblAdressecodePostal);
		
		JLabel lblAdresseville = new JLabel("Adresse(ville)");
		lblAdresseville.setForeground(Color.WHITE);
		lblAdresseville.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdresseville.setBounds(157, 211, 98, 30);
		contentPane.add(lblAdresseville);
		
		JLabel lblMailDuContacte = new JLabel("Mail du contacte");
		lblMailDuContacte.setForeground(Color.WHITE);
		lblMailDuContacte.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMailDuContacte.setBounds(136, 252, 126, 30);
		contentPane.add(lblMailDuContacte);
		
		JLabel lblTelephoneDuContacte = new JLabel("Telephone du contacte");
		lblTelephoneDuContacte.setForeground(Color.WHITE);
		lblTelephoneDuContacte.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelephoneDuContacte.setBounds(89, 293, 166, 30);
		contentPane.add(lblTelephoneDuContacte);
		
		JLabel lblSecteurDactivitDe = new JLabel("Secteur d'activit\u00E9 de l'entreprise");
		lblSecteurDactivitDe.setForeground(Color.WHITE);
		lblSecteurDactivitDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSecteurDactivitDe.setBounds(29, 334, 233, 30);
		contentPane.add(lblSecteurDactivitDe);
		
		nomEntreprise = new JTextField();
		nomEntreprise.setBounds(265, 95, 341, 20);
		contentPane.add(nomEntreprise);
		nomEntreprise.setColumns(10);
		
		adresseNumeroRue = new JTextField();
		adresseNumeroRue.setColumns(10);
		adresseNumeroRue.setBounds(265, 136, 395, 20);
		contentPane.add(adresseNumeroRue);
		
		adresseCodePostal = new JTextField();
		adresseCodePostal.setColumns(10);
		adresseCodePostal.setBounds(265, 177, 138, 20);
		contentPane.add(adresseCodePostal);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 218, 218, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 259, 313, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(265, 300, 313, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(265, 341, 287, 20);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("Envoyer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Entreprise Ajouté");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(166, 406, 119, 30);
		contentPane.add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(e-> System.exit(0)); {
			/*public void actionPerformed(ActionEvent e) {
			}
		});*/
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAnnuler.setBounds(379, 406, 119, 30);
		contentPane.add(btnAnnuler);
	}
}}
