package controlador;

import java.awt.event.ActionEvent;
import thread.Thrd_Presentacion;
import vista.Vt_Presentacion;

public class Ctr_Presentacion implements Controlador{

	Vt_Presentacion VtPresentacion;
	Thrd_Presentacion Thread;
	
	public Ctr_Presentacion(){
		this.VtPresentacion = new Vt_Presentacion();
	}

	public void InitControlador() {
		this.VtPresentacion.setVisible(true);
	}

	public void TerminateControlador() {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
