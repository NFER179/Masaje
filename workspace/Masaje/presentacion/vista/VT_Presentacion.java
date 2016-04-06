package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class VT_Presentacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public VT_Presentacion() {
		this.setBounds(100, 100, 900, 700);
		setLayout(null);
		
		JButton button = new JButton();
		button.setBounds(0, 0, this.getWidth(), 50);
		add(button);
	}
}
