package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import objetosDeVista.NFrameArranque;

public class Vt_Log extends NFrameArranque{
	
	private JLabel iconUser;
	private JTextField fieldUser;
	private JLabel keyUser;
	private JTextField fieldPass;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private int posx = 20;
	private int posy = 25;
	
	private int wdhimg = 30;
	private int hgtimg = 30;
	
	private int wdhtextField = 300;
	private int hgttextfield = 22;
	
	private int wdhbutton = 145;
	private int hgtbutton = 22;
	
	public Vt_Log() {
		super("varios/imagenes/LogBackground.png");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.QuitarProgressBar();
		this.setBackground(Color.GRAY);
		
		this.iconUser = new JLabel();
		this.iconUser.setBounds(this.posx, this.posy, this.wdhimg, this.hgtimg);
		this.iconUser.setIcon(new ImageIcon("varios/imagenes/UserIcon.png"));
		this.add(this.iconUser);
		
		this.fieldUser = new JTextField();
		this.fieldUser.setBounds(this.posx + this.wdhimg +10, this.posy + ((this.wdhimg - this.hgttextfield)/2), this.wdhtextField, this.hgttextfield);
		this.fieldUser.setBorder(null);
		this.add(this.fieldUser);
		
		this.keyUser = new JLabel();
		this.keyUser.setBounds(this.posx, this.iconUser.getY() + this.iconUser.getHeight() + 10, this.wdhimg, this.hgtimg);
		this.keyUser.setIcon(new ImageIcon("varios/imagenes/PassIcon.png"));
		this.add(this.keyUser);
		
		this.fieldPass = new JTextField();
		this.fieldPass.setBounds(this.posx + this.wdhimg +10, this.keyUser.getY() + ((this.keyUser.getHeight() - this.hgttextfield) / 2), this.wdhtextField, this.hgttextfield);
		this.fieldPass.setBorder(null);
		this.add(this.fieldPass);
		
		this.btnAceptar = new JButton("Aceptar");
		this.btnAceptar.setBounds(this.fieldPass.getX(), this.keyUser.getY() + this.keyUser.getHeight() + 10, this.wdhbutton, this.hgtbutton);
		this.add(this.btnAceptar);
		
		this.btnCancelar = new JButton("Cancelar");
		this.btnCancelar.setBounds(this.fieldPass.getX() + this.wdhbutton + 10, this.btnAceptar.getY(), this.wdhbutton, this.hgtbutton);
		this.add(this.btnCancelar);
		
		this.FondoAlFondo();
	}

	public JLabel getIconUser() {
		return iconUser;
	}

	public void setIconUser(JLabel iconUser) {
		this.iconUser = iconUser;
	}

	public JTextField getFieldUser() {
		return fieldUser;
	}

	public void setFieldUser(JTextField fieldUser) {
		this.fieldUser = fieldUser;
	}

	public JLabel getKeyUser() {
		return keyUser;
	}

	public void setKeyUser(JLabel keyUser) {
		this.keyUser = keyUser;
	}

	public JTextField getFieldPass() {
		return fieldPass;
	}

	public void setFieldPass(JTextField fieldPass) {
		this.fieldPass = fieldPass;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
}
