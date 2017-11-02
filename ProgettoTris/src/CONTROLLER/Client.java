package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import VIEW.Finestra1;

public class Client implements ActionListener{
	private Finestra1 f1;
	
	public Client (Finestra1 f1){
		this.f1=f1;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		/*if (evt.getSource()){
			
		}*/
	}
	
}
