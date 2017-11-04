package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import MODEL.Persona;
import VIEW.Finestra1;
import VIEW.Finestra2;

public class Client implements ActionListener{
	private Finestra1 f1;
	private Finestra2 f2;
	private Persona p;
	
	public Client (Finestra1 f1, Finestra2 f2){
		this.f1=f1;
		this.f2=f2;
		f1.getBtn_Accedi().addActionListener(this);
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
	}
	
}
