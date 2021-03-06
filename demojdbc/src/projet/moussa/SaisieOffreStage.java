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

public class SaisieOffreStage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaisieOffreStage frame = new SaisieOffreStage();
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
	public SaisieOffreStage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SAISIE D'UNE OFFRE DE STAGE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(171, 11, 393, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom de l'entreprise\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(207, 75, 118, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDomaineDeLoffre = new JLabel("Domaine de l'Offre");
		lblDomaineDeLoffre.setForeground(Color.WHITE);
		lblDomaineDeLoffre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDomaineDeLoffre.setBackground(Color.WHITE);
		lblDomaineDeLoffre.setBounds(207, 111, 118, 37);
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
		lblDure.setBounds(401, 206, 50, 37);
		contentPane.add(lblDure);
		
		JLabel lblChemainDeStockage = new JLabel("Chemain de stockage de l'offre du stage\r\n");
		lblChemainDeStockage.setForeground(Color.WHITE);
		lblChemainDeStockage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChemainDeStockage.setBackground(Color.WHITE);
		lblChemainDeStockage.setBounds(98, 258, 266, 37);
		contentPane.add(lblChemainDeStockage);
		
		JLabel lblDescriptionDeLoffe = new JLabel("Description de l'offe\r\n");
		lblDescriptionDeLoffe.setForeground(Color.WHITE);
		lblDescriptionDeLoffe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescriptionDeLoffe.setBackground(Color.WHITE);
		lblDescriptionDeLoffe.setBounds(264, 306, 208, 37);
		contentPane.add(lblDescriptionDeLoffe);
		
		textField = new JTextField();
		textField.setBounds(157, 167, 434, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(191, 215, 193, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(446, 215, 118, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(358, 267, 173, 20);
		contentPane.add(textField_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(130, 332, 467, 80);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Envoyer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Offre Ajout�e");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(182, 447, 108, 29);
		contentPane.add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(e-> System.exit(0)); {
			/*public void actionPerformed(ActionEvent e) {
			}
		});*/
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAnnuler.setBounds(442, 447, 108, 29);
		contentPane.add(btnAnnuler);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(335, 84, 146, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(335, 120, 201, 20);
		contentPane.add(spinner_1);
	}
}}
