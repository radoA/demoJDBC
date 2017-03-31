package projet.moussa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsulterOffres extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsulterOffres frame = new ConsulterOffres();
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
	public ConsulterOffres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONSULTER LES OFFRE DE STAGES");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(171, 11, 467, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom de l'entreprise\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(40, 87, 118, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDomaineDeLoffre = new JLabel("Domaine de l'Offre");
		lblDomaineDeLoffre.setForeground(Color.WHITE);
		lblDomaineDeLoffre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDomaineDeLoffre.setBackground(Color.WHITE);
		lblDomaineDeLoffre.setBounds(405, 87, 118, 37);
		contentPane.add(lblDomaineDeLoffre);
		
		JLabel lblLibellDeLoffre = new JLabel("Libell\u00E9 de l'offre");
		lblLibellDeLoffre.setForeground(Color.WHITE);
		lblLibellDeLoffre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLibellDeLoffre.setBackground(Color.WHITE);
		lblLibellDeLoffre.setBounds(40, 158, 108, 37);
		contentPane.add(lblLibellDeLoffre);
		
		JLabel lblDateDuDebut = new JLabel("Date du debut du stage");
		lblDateDuDebut.setForeground(Color.WHITE);
		lblDateDuDebut.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateDuDebut.setBackground(Color.WHITE);
		lblDateDuDebut.setBounds(40, 206, 201, 37);
		contentPane.add(lblDateDuDebut);
		
		JLabel lblDure = new JLabel("Dur\u00E9e");
		lblDure.setForeground(Color.WHITE);
		lblDure.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDure.setBackground(Color.WHITE);
		lblDure.setBounds(405, 158, 50, 37);
		contentPane.add(lblDure);
		
		JLabel lblChemainDeStockage = new JLabel("Chemain de stockage de l'offre du stage\r\n");
		lblChemainDeStockage.setForeground(Color.WHITE);
		lblChemainDeStockage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChemainDeStockage.setBackground(Color.WHITE);
		lblChemainDeStockage.setBounds(40, 254, 266, 37);
		contentPane.add(lblChemainDeStockage);
		
		JLabel lblDescriptionDeLoffe = new JLabel("Description de l'offe\r\n");
		lblDescriptionDeLoffe.setForeground(Color.WHITE);
		lblDescriptionDeLoffe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescriptionDeLoffe.setBackground(Color.WHITE);
		lblDescriptionDeLoffe.setBounds(405, 237, 208, 37);
		contentPane.add(lblDescriptionDeLoffe);
		
		JButton btnNewButton = new JButton("Précedent");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Vouler vous quitter cette page");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(75, 381, 108, 29);
		contentPane.add(btnNewButton);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(e-> System.exit(0)); {
			/*public void actionPerformed(ActionEvent e) {
			}
		});*/
			btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnQuitter.setBounds(546, 381, 108, 29);
		contentPane.add(btnQuitter);
	}
 
 JButton btnSuivant = new JButton("Suivant");
 btnSuivant.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 	}
 });
 btnSuivant.setFont(new Font("Tahoma", Font.BOLD, 12));
 btnSuivant.setBounds(300, 385, 108, 29);
 contentPane.add(btnSuivant);}	
}
 /*JButton btnQuitter_1 = new JButton("Quitter\r\n");
 btnQuitter_1.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 	}
 });
 btnQuitter_1.setFont(new Font("Tahoma", Font.BOLD, 12));
 btnQuitter_1.setBounds(415, 381, 108, 29);
 contentPane.add(btnQuitter_1);
}}
*/