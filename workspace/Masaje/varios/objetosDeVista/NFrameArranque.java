package objetosDeVista;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class NFrameArranque extends JFrame {

	private JPanel contentPane = new JPanel();
	
	private ImageIcon imgFondo;
	
	private JLabel fondo;
	private JProgressBar barraAvance;
	
	public NFrameArranque(String Fondo) {
		this.imgFondo = new ImageIcon(Fondo);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, this.imgFondo.getIconWidth(), this.imgFondo.getIconHeight());
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		this.setContentPane(contentPane);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		
		this.barraAvance = new JProgressBar();
		this.barraAvance.setBounds(10, this.imgFondo.getIconHeight() - 30, this.imgFondo.getIconWidth() - 20, 20);
		this.contentPane.add(this.barraAvance);
		
		this.fondo = new JLabel();
		this.fondo.setBounds(0, 0, this.imgFondo.getIconWidth(), this.imgFondo.getIconHeight());
		this.fondo.setIcon(this.imgFondo);
		this.contentPane.add(this.fondo);
	}
	
}
