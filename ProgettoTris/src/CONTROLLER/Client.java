package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import MODEL.Persona;
import VIEW.Finestra1;
import VIEW.Finestra2;

public class Client implements ActionListener, MouseListener{
	private Finestra1 f1;
	private Finestra2 f2;
	private Persona p;
	private int flag=0;						//Flag per controllare se l'utente ha selezionato una cella e se si quale
	private boolean simbolo=true;			//Flag per tenere conto se utilizzare la "X" o il "O", true --> X false --> O
	private String nomeServer;
	private int portaServer=6789;
	private Socket s;
	
	public Client (Finestra1 f1, Finestra2 f2){
		this.f1=f1;
		this.f2=f2;
		f1.getBtn_Accedi().addActionListener(this);
		f2.getBtn_Invia().addActionListener(this);
		f2.getBtnEsci().addActionListener(this);
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
	
	public void connetti() {
		try {
			s=new Socket(nomeServer, portaServer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void comunica(int p) {
		System.out.println("Invio al server...");
		try {
			s.getOutputStream().write(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
			if (flag>0) {
				// Inviare al server la posizione selezionata
				//this.comunica(flag);
				
				//Manca if per decidere il simbolo
				ImageIcon icon = new ImageIcon("Cerchio.png");
				
				switch (flag) {
				case 1:
					f2.getLbl_1().setIcon(icon);
					break;
				case 2:
					f2.getLbl_2().setIcon(icon);
					break;
				case 3:
					f2.getLbl_3().setIcon(icon);
					break;
				case 4:
					f2.getLbl_4().setIcon(icon);
					break;
				case 5:
					f2.getLbl_5().setIcon(icon);
					break;
				case 6:
					f2.getLbl_6().setIcon(icon);
					break;
				case 7:
					f2.getLbl_7().setIcon(icon);
					break;
				case 8:
					f2.getLbl_8().setIcon(icon);
					break;
				case 9:
					f2.getLbl_9().setIcon(icon);
					break;
				}
				
				flag=0;
			}
			else {
				JOptionPane.showMessageDialog(f2, "Seleziona un pannello", "ERRORE", 0);
			}
		}
		if (evt.getSource()==f2.getBtnEsci()){
			System.exit(1);
		}
	}

	@Override
	public void mouseClicked(MouseEvent evt) {
		if (evt.getSource()==f2.getLbl_1()) {
			System.out.println("Label 1 cliccata");
			flag=1;
		}
		if (evt.getSource()==f2.getLbl_2()) {
			System.out.println("Label 2 cliccata");
			flag=2;
		}
		if (evt.getSource()==f2.getLbl_3()) {
			System.out.println("Label 3 cliccata");
			flag=3;
		}
		if (evt.getSource()==f2.getLbl_4()) {
			System.out.println("Label 4 cliccata");
			flag=4;
		}
		if (evt.getSource()==f2.getLbl_5()) {
			System.out.println("Label 5 cliccata");
			flag=5;
		}
		if (evt.getSource()==f2.getLbl_6()) {
			System.out.println("Label 6 cliccata");
			flag=6;
		}
		if (evt.getSource()==f2.getLbl_7()) {
			System.out.println("Label 7 cliccata");
			flag=7;
		}
		if (evt.getSource()==f2.getLbl_8()) {
			System.out.println("Label 8 cliccata");
			flag=8;
		}
		if (evt.getSource()==f2.getLbl_9()) {
			System.out.println("Label 9 cliccata");
			flag=9;
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

	public Socket getS() {
		return s;
	}

	public void setS(Socket s) {
		this.s = s;
	}

	public String getNomeServer() {
		return nomeServer;
	}

	public int getPortaServer() {
		return portaServer;
	}
	
}
