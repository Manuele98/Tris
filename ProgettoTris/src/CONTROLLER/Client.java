package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
	private String flag=null;							//Flag per controllare se l'utente ha selezionato una cella e se si quale
	private String pAvversario=null;
	private String simbolo="1";							//Flag per tenere conto se utilizzare la "X" o il "O", 1 --> "X" 2 --> "O"
	private ImageIcon iconMia=null;
	private ImageIcon iconAvversario=null;
	private boolean vittoria=false;
	private String nomeServer="localhost";
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
		connetti();
		simbolo=simboloServer();
		if(simbolo.equals("1")){
			iconMia = new ImageIcon("X.jpg");
			iconAvversario=new ImageIcon("Cerchio.png");
			f2.getLabel_Simbolo_Giocatore().setIcon(new ImageIcon("X_piccolo.jpg"));
			f2.getLabel_Simbolo_Avversario().setIcon(new ImageIcon("Cerchio_piccolo.png"));
		}
		if(simbolo.equals("2")){
			iconMia = new ImageIcon("Cerchio.png");
			iconAvversario=new ImageIcon("X.jpg");
			f2.getLabel_Simbolo_Giocatore().setIcon(new ImageIcon("Cerchio_piccolo.png"));
			f2.getLabel_Simbolo_Avversario().setIcon(new ImageIcon("X_piccolo.jpg"));
		}
	}
	
	public void connetti() {
		try {
			s=new Socket(nomeServer, portaServer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String simboloServer(){
		String sim=null;
		try {
			InputStreamReader isr= new InputStreamReader(s.getInputStream());
			BufferedReader in=new BufferedReader(isr);
			System.out.println("Il Client riceve: " + in.readLine());
			sim=in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sim;
	}
	
	public void comunicaPosizione(String p) {
		System.out.println("Invio al server...");
		try {
			PrintWriter out=new PrintWriter(s.getOutputStream(), true);
			out.println(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String riceviPosizione (){
		String p=null;
		try {
			InputStreamReader isr= new InputStreamReader(s.getInputStream());
			BufferedReader in=new BufferedReader(isr);
			System.out.println("Il Client riceve posizione: " + in.readLine());
			p=in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}
	public void esci(){
		System.out.println("Invio al server...");
		try {
			PrintWriter out=new PrintWriter(s.getOutputStream(), true);
			out.println("Esci");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean controllaVittoria(){
		String vitt=null;
		try {
			InputStreamReader isr= new InputStreamReader(s.getInputStream());
			BufferedReader in=new BufferedReader(isr);
			System.out.println("Il Client riceve: " + in.readLine());
			vitt=in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vitt.equals("Hai vinto") ?  true : false;
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
			if (flag!=null) {
				switch (flag) {
				case "1":
					f2.getLbl_1().setIcon(iconMia);
					f2.getLbl_1().removeMouseListener(this);
					break;
				case "2":
					f2.getLbl_2().setIcon(iconMia);
					f2.getLbl_2().removeMouseListener(this);
					break;
				case "3":
					f2.getLbl_3().setIcon(iconMia);
					f2.getLbl_3().removeMouseListener(this);
					break;
				case "4":
					f2.getLbl_4().setIcon(iconMia);
					f2.getLbl_4().removeMouseListener(this);
					break;
				case "5":
					f2.getLbl_5().setIcon(iconMia);
					f2.getLbl_5().removeMouseListener(this);
					break;
				case "6":
					f2.getLbl_6().setIcon(iconMia);
					f2.getLbl_6().removeMouseListener(this);
					break;
				case "7":
					f2.getLbl_7().setIcon(iconMia);
					f2.getLbl_7().removeMouseListener(this);
					break;
				case "8":
					f2.getLbl_8().setIcon(iconMia);
					f2.getLbl_8().removeMouseListener(this);
					break;
				case "9":
					f2.getLbl_9().setIcon(iconMia);
					f2.getLbl_9().removeMouseListener(this);
					break;
				}
				//comunicaPosizione(flag);
				f2.getBtn_Invia().setEnabled(false);
				flag=null;
			}
			else {
				JOptionPane.showMessageDialog(f2, "Seleziona un pannello", "ERRORE", 0);
			}
		//	pAvversario=riceviPosizione();
		//	f2.getBtn_Invia().setEnabled(true);
			switch (pAvversario) {
			case "1":
				f2.getLbl_1().setIcon(iconAvversario);
				f2.getLbl_1().removeMouseListener(this);
				break;
			case "2":
				f2.getLbl_2().setIcon(iconAvversario);
				f2.getLbl_2().removeMouseListener(this);
				break;
			case "3":
				f2.getLbl_3().setIcon(iconAvversario);
				f2.getLbl_3().removeMouseListener(this);
				break;
			case "4":
				f2.getLbl_4().setIcon(iconAvversario);
				f2.getLbl_4().removeMouseListener(this);
				break;
			case "5":
				f2.getLbl_5().setIcon(iconAvversario);
				f2.getLbl_5().removeMouseListener(this);
				break;
			case "6":
				f2.getLbl_6().setIcon(iconAvversario);
				f2.getLbl_6().removeMouseListener(this);
				break;
			case "7":
				f2.getLbl_7().setIcon(iconAvversario);
				f2.getLbl_7().removeMouseListener(this);
				break;
			case "8":
				f2.getLbl_8().setIcon(iconAvversario);
				f2.getLbl_8().removeMouseListener(this);
				break;
			case "9":
				f2.getLbl_9().setIcon(iconAvversario);
				f2.getLbl_9().removeMouseListener(this);
				break;
			}
			if(controllaVittoria()==true){
				JOptionPane.showMessageDialog(f2, "Hai vinto", "BRAVO", 0);
			}
		}
		if (evt.getSource()==f2.getBtnEsci()){
			//esci();
			System.exit(1);
		}
	}

	@Override
	public void mouseClicked(MouseEvent evt) {
		if (evt.getSource()==f2.getLbl_1()) {
			System.out.println("Label 1 cliccata");
			flag="1";
		}
		if (evt.getSource()==f2.getLbl_2()) {
			System.out.println("Label 2 cliccata");
			flag="2";
		}
		if (evt.getSource()==f2.getLbl_3()) {
			System.out.println("Label 3 cliccata");
			flag="3";
		}
		if (evt.getSource()==f2.getLbl_4()) {
			System.out.println("Label 4 cliccata");
			flag="4";
		}
		if (evt.getSource()==f2.getLbl_5()) {
			System.out.println("Label 5 cliccata");
			flag="5";
		}
		if (evt.getSource()==f2.getLbl_6()) {
			System.out.println("Label 6 cliccata");
			flag="6";
		}
		if (evt.getSource()==f2.getLbl_7()) {
			System.out.println("Label 7 cliccata");
			flag="7";
		}
		if (evt.getSource()==f2.getLbl_8()) {
			System.out.println("Label 8 cliccata");
			flag="8";
		}
		if (evt.getSource()==f2.getLbl_9()) {
			System.out.println("Label 9 cliccata");
			flag="9";
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
