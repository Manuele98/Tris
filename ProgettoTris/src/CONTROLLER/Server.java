package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import VIEW.Finestra3;

public class Server implements ActionListener {
	Finestra3 f3 = new Finestra3();
	ServerSocket serverSocket;
	Socket socket1, socket2;
	ServerThread serverThread1, serverThread2;
	PrintWriter out1;
	PrintWriter out2;
	Scanner in1;
	Scanner in2;
	String messaggio1="", messaggio2="", pos1="", pos2="", pos3="", pos4="", pos5="", pos6="", pos7="", pos8="", pos9="", vittorioso="";
	Boolean chiuso = false;
	Boolean vittoria = false;

	public Server() throws IOException{
		this.start();
	}
	public void start() throws IOException {

		f3.getBtnSpegniServer().addActionListener(this);
		f3.setVisible(true);
		try {
			serverSocket = new ServerSocket(6789);
			f3.setMod("Server avviato e in attesa...");
			richiesta_socket();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void richiesta_socket() throws IOException {
		try {
			socket1 = serverSocket.accept();
			socket2 = serverSocket.accept();
			f3.setMod("-> Creo un nuovo thread assegnando il socket: " + socket1);
			f3.setMod("-> Creo un nuovo thread assegnando il socket: " + socket2);
			serverThread1 = new ServerThread(socket1);
			serverThread1.start();
			serverThread2 = new ServerThread(socket2);
			serverThread2.start();
			f3.setMod("-> Avviati i Thread");
			// creo metodo per inviare e ricevere dai 2 socket
			out1 = new PrintWriter(socket1.getOutputStream(), true);
			out2 = new PrintWriter(socket2.getOutputStream(), true);
			in1 = new Scanner(socket1.getInputStream());
			in2 = new Scanner(socket2.getInputStream());
			f3.setMod("-> Avviati i flussi input e output");
			chiuso = false;
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		// invio 1, che significa che il 1° socket ha X
		out1.println("1");
		// invio 2, che significa che il 2° socket ha cerchio
		out2.println("2");
		f3.setMod("-> Socket1: X Socket2: Cerchio");
		this.partita();
	}

	public void partita() throws IOException {
		Boolean partita = true;
		while (partita == true) {
			if (vittoria == false) {
				messaggio1 = in1.nextLine();
				System.out.println("Ricevo messaggio1= " + messaggio1);
				switch (messaggio1) {
				case "1":
					pos1 = "X";
					System.out.println("Invio al client 2 pos1");
					out2.println("1");
					break;
				case "2":
					pos2 = "X";
					System.out.println("Invio al client 2 pos2");
					out2.println("2");
					break;
				case "3":
					pos3 = "X";
					System.out.println("Invio al client 2 pos3");
					out2.println("3");
					break;
				case "4":
					pos4 = "X";
					System.out.println("Invio al client 2 pos4");
					out2.println("4");
					break;
				case "5":
					pos5 = "X";
					System.out.println("Invio al client 2 pos5");
					out2.println("5");
					break;
				case "6":
					pos6 = "X";
					System.out.println("Invio al client 2 pos6");
					out2.println("6");
					break;
				case "7":
					pos7 = "X";
					System.out.println("Invio al client 2 pos7");
					out2.println("7");
					break;
				case "8":
					pos8 = "X";
					System.out.println("Invio al client 2 pos8");
					out2.println("8");
					break;
				case "9":
					pos9 = "X";
					System.out.println("Invio al client 2 pos9");
					out2.println("9");
					break;
				case "Esci":
					socket1.close();
					out2.println("Hai vinto");
					f3.setMod("-> Socket1 chiuso, partita annullata. Vittoria socket2(Cerchio)");
					partita=false;
					break;
				default:
					f3.setMod("Errore ricezione!");
					break;
				}
			}
			this.Controllo_vittoria();
			if (vittoria == false) {
				messaggio2 = in2.nextLine();
				System.out.println("Ricevo messaggio2= " + messaggio2);
				switch (messaggio2) {
				case "1":
					pos1 = "Cerchio";
					System.out.println("Invio al client 1 pos1");
					out1.println("1");
					break;
				case "2":
					pos2 = "Cerchio";
					System.out.println("Invio al client 1 pos2");
					out1.println("2");
					break;
				case "3":
					pos3 = "Cerchio";
					System.out.println("Invio al client 1 pos3");
					out1.println("3");
					break;
				case "4":
					pos4 = "Cerchio";
					System.out.println("Invio al client 1 pos4");
					out1.println("4");
					break;
				case "5":
					pos5 = "Cerchio";
					System.out.println("Invio al client 1 pos5");
					out1.println("5");
					break;
				case "6":
					pos6 = "Cerchio";
					System.out.println("Invio al client 1 pos6");
					out1.println("6");
					break;
				case "7":
					pos7 = "Cerchio";
					System.out.println("Invio al client 1 pos7");
					out1.println("7");
					break;
				case "8":
					pos8 = "Cerchio";
					System.out.println("Invio al client 1 pos8");
					out1.println("8");
					break;
				case "9":
					pos9 = "Cerchio";
					System.out.println("Invio al client 1 pos9");
					out1.println("9");
					break;
				case "Esci":
					socket2.close();
					out1.println("Hai vinto");
					f3.setMod("-> Socket2 chiuso, partita annullata. Vittoria socket1(X)");
					partita=false;
					break;
				default:
					f3.setMod("Errore ricezione!");
					break;
				}
			}
			this.Controllo_vittoria();
			if(vittoria==true){
				if (vittorioso.equals("X")) {
					out1.println("Hai vinto");
					out2.println("Hai perso");
					f3.setMod("Socket1 (X) ha vinto!!!");
				} else {
					out2.println("Hai vinto");
					out1.println("Hai perso");
					f3.setMod("Socket2 (Cerchio) ha vinto!!!");
				}
				f3.setMod(""+vittorioso+"  Vittoria:"+vittoria);
			}
			partita = false;
		}
		if(socket1.isClosed()==false&&socket2.isClosed()==false){
			socket1.close();
			socket2.close();
		}else{
			if(socket1.isClosed()==true&&socket2.isClosed()==false){
				socket2.close();
			}
			if(socket1.isClosed()==false&&socket2.isClosed()==true){
				socket1.close();
			}
		}			
		vittoria = false;
		vittorioso = "";
		this.richiesta_socket();
	}

	public void Controllo_vittoria() {
		if (pos1.equals(pos2) && pos1.equals(pos3)&&!pos1.equals("")) {
			vittoria = true;
			if (pos1.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos4.equals(pos5) && pos4.equals(pos6)&&!pos4.equals("")) {
			vittoria = true;
			if (pos4.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos7.equals(pos8) && pos7.equals(pos9)&&!pos7.equals("")) {
			vittoria = true;
			if (pos7.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos1.equals(pos5) && pos1.equals(pos9)&&!pos1.equals("")) {
			vittoria = true;
			if (pos1.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos3.equals(pos5) && pos3.equals(pos7)&&!pos3.equals("")) {
			vittoria = true;
			if (pos3.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos1.equals(pos4) && pos1.equals(pos7)&&!pos1.equals("")) {
			vittoria = true;
			if (pos1.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos2.equals(pos5) && pos2.equals(pos8)&&!pos2.equals("")) {
			vittoria = true;
			if (pos2.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
		if (pos3.equals(pos6) && pos3.equals(pos9)&&!pos3.equals("")) {
			vittoria = true;
			if (pos3.equals("X")) {
				vittorioso = "X";
			} else {
				vittorioso = "Cerchio";
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == f3.getBtnSpegniServer()) {
			System.exit(1);
		}
	}
}
