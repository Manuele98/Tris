package CONTROLLER;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ServerSocket;
import java.net.Socket;

import VIEW.Finestra3;

public class Server implements ActionListener{
	Finestra3 f3=new Finestra3();
	public void start() {
		
		f3.getBtnSpegniServer().addActionListener(this);
		f3.setVisible(true);
		try {
			ServerSocket serverSocket = new ServerSocket(6789);
			for (;;) { // Altro modo di fare un ciclo infinito
				f3.setMod("Server in attesa...");
				Socket socket = serverSocket.accept();
				
				f3.setMod("-> Creo un nuovo thread assegnando il socket: " + socket);
				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				
				// Aggiungo il socket alla lista dei socket
				ServerModel.listaSocket.add(socket);
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
