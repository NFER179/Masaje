package main;

import javax.swing.UIManager;

import controlador.Ctr_Log;
import controlador.Ctr_Presentacion;

public class Main {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}	 
		catch (Exception e) {
		}
		
		Ctr_Log log = new Ctr_Log();
		
		log.InitControlador();
	}
}
