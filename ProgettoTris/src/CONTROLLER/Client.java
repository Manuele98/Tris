package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import MODEL.Persona;
import VIEW.Finestra1;
import VIEW.Finestra2;

public class Client implements ActionListener, MouseListener{
	private Finestra1 f1;
	private Finestra2 f2;
	private Persona p;
	private boolean flag=false;
	
	public Client (Finestra1 f1, Finestra2 f2){
		this.f1=f1;
		this.f2=f2;
		f1.getBtn_Accedi().addActionListener(this);
		f2.getBtn_Invia().addActionListener(this);
		f2.getLbl_1().addMouseListener(this);
		f2.getLbl_2().addMouseListener(this);
		f2.getLbl_3().addMouseListener(this);
		f2.getLbl_4().addMouseListener(this);
		f2.getLbl_5().addMouseListener(this);
		f2.getLbl_6().addMouseListener(this);
		f2.getLbl_7().addMouseListener(this);
		f2.getLbl_8().addMouseListener(this);
		f2.getLbl_9().addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource()==f1.getBtn_Accedi()){
			String nome=(String)f1.getTextField_NickName().getText();
			if (nome.equals("")) {
				JOptionPane.showMessageDialog(f1, "Inserisci un nickname", "ERRORE", 0);
			}
			else {
				p=new Persona(nome);
				f2.setVisible(true);
				f1.setVisible(false);
			}
		}
		if (evt.getSource()==f2.getBtn_Invia()) {
			if (flag==true) {
				// Inviare al server la posizione selezionata
				
				
				flag=false;
			}
			else {
				JOptionPane.showMessageDialog(f2, "Seleziona un pannello", "ERRORE", 0);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent evt) {
		if (evt.getSource()==f2.getLbl_1()) {
			System.out.println("Pannello 1 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_2()) {
			System.out.println("Pannello 2 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_3()) {
			System.out.println("Pannello 3 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_4()) {
			System.out.println("Pannello 4 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_5()) {
			System.out.println("Pannello 5 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_6()) {
			System.out.println("Pannello 6 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_7()) {
			System.out.println("Pannello 7 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_8()) {
			System.out.println("Pannello 8 cliccato");
			flag=true;
		}
		if (evt.getSource()==f2.getLbl_9()) {
			System.out.println("Pannello 9 cliccato");
			flag=true;
		}
	}

	@Override
	public void mouseEntered(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
}
