package controlador;

import java.awt.event.ActionEvent;

import vista.Vt_Log;

/**
 * @author nfernandez
 *
 */

public class Ctr_Log implements Controlador {

	private Vt_Log vtLog;
	private Ctr_Presentacion crtPresentacion;

	public Ctr_Log() {
		this.vtLog = new Vt_Log();
		this.crtPresentacion = new Ctr_Presentacion();
		
		this.vtLog.getBtnAceptar().addActionListener(this);
		this.vtLog.getBtnCancelar().addActionListener(this);
	}
	
	public void InitControlador() {
		this.vtLog.setVisible(true);
	}
	

	public void TerminateControlador() {
		this.vtLog.setVisible(false);
	}
	
	public void SuccesLog() {
		this.TerminateControlador();
		this.crtPresentacion.InitControlador();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.vtLog.getBtnAceptar()) {
			SuccesLog();
		}
		else if(arg0.getSource() == this.vtLog.getBtnCancelar()) {
			this.vtLog.dispose();
		}
	}
}
