package projet.application;

import java.awt.EventQueue;

//import projet.ihm.CreationEntreprise;
import projet.ihm.EntrerDansLapplication;

public class Application {
//DAO : Data Acces Object
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

}
//C:\Users\User\AppData\Local\SceneBuilder
/* 
 * DIAGRAMME UML
 *use case
 *activity
 *classe
 *sequenc */
 