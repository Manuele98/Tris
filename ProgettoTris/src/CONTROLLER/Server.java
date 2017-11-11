package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	String messaggio1,messaggio2;
	
	public void start() {

		f3.getBtnSpegniServer().addActionListener(this);
		f3.setVisible(true);
		try {
			serverSocket = new ServerSocket(6789);
			f3.setMod("Server in attesa...");
			socket1 = serverSocket.accept();
			socket2 = serverSocket.accept();
			f3.setMod("-> Creo un nuovo thread assegnando il socket: " + socket1);
			serverThread1 = new ServerThread(socket1);
			serverThread1.start();
			serverThread2 = new ServerThread(socket2);
			serverThread2.start();
			// creo metodo per inviare e ricevere dai 2 socket
			out1 = new PrintWriter(socket1.getOutputStream(), true);
			out2 = new PrintWriter(socket2.getOutputStream(), true);
			in1 = new Scanner(socket1.getInputStream());
			in2 = new Scanner(socket2.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		//invio 1, che significa che il 1° socket ha X
		out1.println("1");
		//invio 2, che significa che il 2° socket ha cerchio
		out2.println("2");
		while (true) {
			messaggio1=in1.nextLine();
			switch(messaggio1){
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "6":
					break;
				case "7":
					break;
				case "8":
					break;
				case "9":
					break;
				default:
					f3.setMod("Errore ricezione!");
					break;
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
