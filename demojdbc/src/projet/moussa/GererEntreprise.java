package projet.moussa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
public class GererEntreprise extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GererEntreprise frame = new GererEntreprise();
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
	public GererEntreprise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setForeground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.resize(false);
		
		JLabel lblCreationDuneEntreprise = new JLabel("GESTION DES OFFRE DES STRAGES\r\n");
		lblCreationDuneEntreprise.setForeground(new Color(255, 255, 255));
		lblCreationDuneEntreprise.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCreationDuneEntreprise.setBounds(216, 31, 455, 52);
		contentPane.add(lblCreationDuneEntreprise);
		
		JButton btnNewButton = new JButton("Creer une entreprise");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreerEntreprise cr=new CreerEntreprise();
				cr.setVisible(true);
				//this.hide();
				GererEntreprise E= new GererEntreprise();
						E.setVisible(false);
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(63, 190, 171, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consulter les offres");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(582, 190, 171, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Saisir une offre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaisieOffreStage sos=new SaisieOffreStage();
				sos.setVisible(true);
				//this.hide();
				GererEntreprise E= new GererEntreprise();
						E.setVisible(false);
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(322, 190, 171, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnAnnuler = new JButton("Annuler\r\n");
		btnAnnuler.addActionListener(e->System.exit(0)); {
		
			/*public void actionPerformed(ActionEvent e) {
			}
		});*/
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnnuler.setBounds(351, 330, 105, 31);
		contentPane.add(btnAnnuler);
	}
}

	private void resize(boolean b) {
		// TODO Auto-generated method stub
		
	}}
