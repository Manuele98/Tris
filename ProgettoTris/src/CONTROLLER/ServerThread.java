package CONTROLLER;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket client = null;
	String messaggio2 = null;
	String messaggio = null;
	BufferedReader input;
	PrintWriter output;

	public ServerThread(Socket socket) {
		this.client = socket;
	}

	public void run() {
		try {
			input = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(true) {
				messaggio = input.readLine(); // riceve il messaggio
				//ServerModel.sendMessage(messaggio, client); // lo ritrasmette 
				input = new BufferedReader(new InputStreamReader(client.getInputStream()));
				switch(messaggio) {
					case "1":
						messaggio2 = input.readLine();
					break;
					case "2":
						messaggio2 = input.readLine();
						break;
					case "3":
						messaggio2 = input.readLine();
						break;
					case "4":
						messaggio2 = input.readLine();
						break;
					case "5":
						messaggio2 = input.readLine();
						break;
					case "6":
						messaggio2 = input.readLine();
						break;
					case "7":
						messaggio2 = input.readLine();
						break;
					case "8":
						messaggio2 = input.readLine();
						break;
					case "9":
						messaggio2 = input.readLine();
						break;
					case "FINE":
						System.out.println(Thread.currentThread().getId() + " Addio! " + messaggio);
						ServerModel.close();
						System.exit(0);
						break;
					default:
						System.out.println("Errore scelta!");
						break;
				}
			}		
			
		}catch(Exception e){
		// esce e basta
		}
	}
}
