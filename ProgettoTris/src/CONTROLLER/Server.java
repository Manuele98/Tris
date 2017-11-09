package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import VIEW.Finestra3;

public class Server implements ActionListener{
	Finestra3 f3=new Finestra3();
	ServerSocket serverSocket;
	Socket socket1,socket2;
	ServerThread serverThread1,serverThread2;
	PrintWriter out1;
	PrintWriter out2;
	public void start() {
		
		f3.getBtnSpegniServer().addActionListener(this);
		f3.setVisible(true);
		try {
			serverSocket = new ServerSocket(6789);
			for (;;) { // Altro modo di fare un ciclo infinito
				f3.setMod("Server in attesa...");
				socket1 = serverSocket.accept();
				socket2 = serverSocket.accept();			
				f3.setMod("-> Creo un nuovo thread assegnando il socket: " + socket1);
				serverThread1 = new ServerThread(socket1);
				serverThread1.start();
				serverThread2 = new ServerThread(socket2);
				serverThread2.start();
				out1 = new PrintWriter(socket1.getOutputStream(), true);
				out2 = new PrintWriter(socket2.getOutputStream(), true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==f3.getBtnSpegniServer()) {
			System.exit(1);
		}
	}
}
