package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import thread.THRD_Presentacion;
import vista.VT_Presentacion;

public class CTR_Presentacion implements ActionListener{

	VT_Presentacion VistaPresentacion;
	THRD_Presentacion Thread;
	
	public CTR_Presentacion(){
		this.VistaPresentacion = new VT_Presentacion();
	}
	
	public void InitControladot() {
		this.VistaPresentacion.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
	}
}
